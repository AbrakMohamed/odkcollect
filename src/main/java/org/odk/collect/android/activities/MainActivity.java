package org.odk.collect.android.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import org.odk.collect.android.R;
import org.odk.collect.android.activities.HomeActivity;

import java.util.concurrent.TimeUnit;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    // Variable for FirebaseAuth class
    private FirebaseAuth mAuth;
    // Variable for text input fields for phone and OTP
    private EditText edtPhone, edtOTP;
    // Buttons for generating OTP and verifying OTP
    private Button verifyOTPBtn, generateOTPBtn;
    // String for storing our verification ID
    private String verificationId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Getting instance of FirebaseAuth
        FirebaseApp.initializeApp(this);
        mAuth = FirebaseAuth.getInstance();
        // Initializing variables for buttons and EditTexts
        edtPhone = findViewById(R.id.idEdtPhoneNumber);
        edtOTP = findViewById(R.id.idEdtOtp);
        verifyOTPBtn = findViewById(R.id.idBtnVerify);
        generateOTPBtn = findViewById(R.id.idBtnGetOtp);

        // Setting onClick listener for generate OTP button
        generateOTPBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Checking if the user has entered a phone number
                if (TextUtils.isEmpty(edtPhone.getText().toString())) {
                    // Displaying a toast message when the phone number field is empty
                    Toast.makeText(MainActivity.this, "Please enter a valid phone number.", Toast.LENGTH_SHORT).show();
                } else {
                    // Sending OTP if the phone number field is not empty
                    String phone = "+212" + edtPhone.getText().toString(); // Adjust country code as needed
                    Timber.tag("MainActivity").d("Phone number: %s", phone);
                    sendVerificationCode(phone);
                }
            }
        });

        // Setting onClick listener for verify OTP button
        verifyOTPBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Checking if the OTP field is empty
                if (TextUtils.isEmpty(edtOTP.getText().toString())) {
                    // Displaying a message to enter OTP if the field is empty
                    Toast.makeText(MainActivity.this, "Please enter OTP", Toast.LENGTH_SHORT).show();
                } else {
                    // Verifying the OTP if the field is not empty
                    verifyCode(edtOTP.getText().toString());
                }
            }
        });
    }

    private void signInWithCredential(PhoneAuthCredential credential) {
        // Checking if the entered code is correct
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sending the user to the new activity if the code is correct and the task is successful
                            Intent i = new Intent(MainActivity.this, HomeActivity.class);
                            startActivity(i);
                            finish();
                        } else {
                            // Displaying an error message if the code is incorrect
                            Toast.makeText(MainActivity.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }

    private void sendVerificationCode(String number) {
        // Method to get OTP on user's phone number
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                number, // User's mobile number
                60, // Time limit for OTP verification (60 seconds in this case)
                TimeUnit.SECONDS, // Units for time period (seconds in this case)
                this, // Activity for the task
                mCallBack // Callback method when OTP is received
        );
    }

    // Callback method for PhoneAuthProvider
    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallBack = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

        // Method called when OTP is sent from Firebase
        @Override
        public void onCodeSent(String s, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            super.onCodeSent(s, forceResendingToken);
            // Storing the OTP's unique ID
            verificationId = s;
        }

        // Method called when the user receives OTP from Firebase
        @Override
        public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
            // Getting the OTP code from phone auth credentials
            final String code = phoneAuthCredential.getSmsCode();
            // Checking if the code is null
            if (code != null) {
                // Setting the code to the OTP EditText if it's not null
                edtOTP.setText(code);
                // Verifying the code
                verifyCode(code);
            }
        }

        // Method called when Firebase doesn't send OTP due to an error
        @Override
        public void onVerificationFailed(FirebaseException e) {
            // Displaying an error message with Firebase exception
            Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
        }
    };

    // Method to verify the code from Firebase
    private void verifyCode(String code) {
        // Getting credentials from the verification ID and code
        PhoneAuthCredential credential = PhoneAuthProvider.getCredential(verificationId, code);
        // Signing in with the credential
        signInWithCredential(credential);
    }
}
