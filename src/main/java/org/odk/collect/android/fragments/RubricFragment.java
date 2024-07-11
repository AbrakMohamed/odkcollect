package org.odk.collect.android.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.odk.collect.android.R;
import org.odk.collect.android.activities.FormActivity;
import org.odk.collect.android.activities.viewmodels.Question;
import org.odk.collect.android.activities.viewmodels.Rubric;

import javax.annotation.Nullable;

public class RubricFragment extends Fragment {

    private static final String ARG_RUBRIC = "rubric";
    private static final String ARG_IS_LAST_RUBRIC = "is_last_rubric";
    private Rubric rubric;
    private boolean isLastRubric;

    public static RubricFragment newInstance(Rubric rubric, boolean isLastRubric) {
        RubricFragment fragment = new RubricFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_RUBRIC, rubric);
        args.putBoolean(ARG_IS_LAST_RUBRIC, isLastRubric);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            rubric = (Rubric) getArguments().getSerializable(ARG_RUBRIC);
            isLastRubric = getArguments().getBoolean(ARG_IS_LAST_RUBRIC);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rubric, container, false);

        TextView titleTextView = view.findViewById(R.id.rubric_title);
        titleTextView.setText(rubric.getName());

        LinearLayout questionsContainer = view.findViewById(R.id.questions_container);
        for (Question question : rubric.getQuestions()) {
            View questionView = createQuestionView(question);
            questionsContainer.addView(questionView);
        }

        Button nextButton = view.findViewById(R.id.next_button);
        nextButton.setText(isLastRubric ? R.string.validate : R.string.suivant);
        nextButton.setOnClickListener(v -> {
            if (isLastRubric) {
                ((FormActivity) getActivity()).validateForm();
            } else {
                ((FormActivity) getActivity()).goToNextRubric();
            }
        });

        return view;
    }

    private View createQuestionView(Question question) {
        LinearLayout questionLayout = new LinearLayout(getContext());
        questionLayout.setOrientation(LinearLayout.VERTICAL);

        TextView questionTextView = new TextView(getContext());
        questionTextView.setText(question.getQuestionText());
        questionLayout.addView(questionTextView);

        if ("radio".equals(question.getQuestionType())) {
            RadioGroup radioGroup = new RadioGroup(getContext());
            for (String answer : question.getAnswers()) {
                RadioButton radioButton = new RadioButton(getContext());
                radioButton.setText(answer);
                radioGroup.addView(radioButton);
            }
            questionLayout.addView(radioGroup);
        } else if ("checkbox".equals(question.getQuestionType())) {
            for (String answer : question.getAnswers()) {
                CheckBox checkBox = new CheckBox(getContext());
                checkBox.setText(answer);
                questionLayout.addView(checkBox);
            }
        }

        return questionLayout;
    }
}
