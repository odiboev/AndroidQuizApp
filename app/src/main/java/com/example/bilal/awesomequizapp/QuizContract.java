package com.example.bilal.awesomequizapp;

import android.provider.BaseColumns;

public final class QuizContract {

    private QuizContract(){}

    public static class QuestionTable implements BaseColumns{
        public static final String TABLE_NAME = "quiz_question";
        public static final String COLUM_QUESTION = "questions";
        public static final String COLUM_OPTION1 = "option1";
        public static final String COLUM_OPTION2 = "option2";
        public static final String COLUM_OPTION3 = "option3";
        public static final String COLUMN_ANSWER_NR = "answer_nr";

        //TODO Nice explanation here: https://www.youtube.com/watch?v=XJTUwR4GxW0&t=7s
    }
}
