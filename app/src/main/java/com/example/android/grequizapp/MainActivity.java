package com.example.android.grequizapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int totalScore = 0;
    int Score1 = 0;
    int Score2 = 0;
    int Score3 = 0;
    int Score4 = 0;
    int Score5 = 0;
    int Score6 = 0;
    CharSequence resultsDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void setTotalScore(View view) {
        //question 1
        RadioButton question1_choice2 = (RadioButton)findViewById(R.id.question1_choice2_radio_text);
        boolean question1 = question1_choice2.isChecked();
        if(question1==true)
        {
           Score1 = 5;
        }
        else
        {
            Score1=0;
        }

        //question2
        CheckBox question2_choice1 = (CheckBox)findViewById(R.id.question2_choice1_checkbox);
        boolean question2 = question2_choice1.isChecked();
        CheckBox question2_choice5 = (CheckBox)findViewById(R.id.question2_choice5_checkbox);
        boolean ques2 = question2_choice5.isChecked();
        if(ques2&&question2==true){
            Score2 = 5;
        }
        else{
            Score2 = 0;
        }
        CheckBox question2_choice3 = (CheckBox)findViewById(R.id.question2_choice3_checkbox);
        boolean ques2_ch3 = question2_choice3.isChecked();
        CheckBox question2_choice4 = (CheckBox)findViewById(R.id.question2_choice4_checkbox);
        boolean ques2_ch4 = question2_choice4.isChecked();
        CheckBox question2_choice2 = (CheckBox)findViewById(R.id.question2_choice2_checkbox);
        boolean ques2_ch2 = question2_choice2.isChecked();
        if (ques2_ch2==true){
            Score2 = 0;
        }
        if (ques2_ch4==true){
            Score2 = 0;
        }
        if (ques2_ch3==true){
            Score2 = 0;
        }

        //question3
        EditText question3 = (EditText) findViewById(R.id.question3_EditText);
        String n = question3.getText().toString();
        if(TextUtils.isEmpty(n)) {
            question3.setError("Empty");
            return;
        }
        int Answer = new Integer(n).intValue();
        if(Answer>2400){
            Score3=0;
        }
        else if(Answer==2400){
            Score3=5;
        }
        else{
            Score3=0;
        }
        //question4
        CheckBox question4_choice3 = (CheckBox)findViewById(R.id.question4_choice3_chechbox);
        boolean ques4 = question4_choice3.isChecked();
        CheckBox question4_choice5 = (CheckBox)findViewById(R.id.question4_choice5_chechbox);
        boolean question4 = question4_choice5.isChecked();
        if(ques4&&question4==true){
            Score4 = 5;
        }
        else{
            Score4 = 0;
        }
        CheckBox question4_choice1 = (CheckBox)findViewById(R.id.question4_choice1_chechbox);
        boolean ques4_ch1 = question4_choice1.isChecked();
        CheckBox question4_choice2 = (CheckBox)findViewById(R.id.question4_choice2_chechbox);
        boolean ques4_ch2 = question4_choice2.isChecked();
        CheckBox question4_choice4 = (CheckBox)findViewById(R.id.question4_choice4_chechbox);
        boolean ques4_ch4 = question4_choice4.isChecked();
        if(ques4_ch1){
            Score4=0;
        }
        if(ques4_ch2){
            Score4=0;
        }
        if(ques4_ch4){
            Score4=0;
        }
        //question5
        RadioButton question5 = (RadioButton)findViewById(R.id.question5_choice1_radio_text);
        boolean ques5 = question5.isChecked();
        if(ques5== true){
            Score5 = 5;
        }
        else{
            Score5 = 0;
        }
        //question6
        EditText question6 = (EditText)findViewById(R.id.question6_EditText);
        String sTextFromET = question6.getText().toString();
        if(TextUtils.isEmpty(sTextFromET)) {
            question6.setError("Empty");
            return;
        }
        int Answer6 = new Integer(sTextFromET).intValue();
        if(Answer6>502){
            Score6 = 0;
        }
        else if (Answer6==502){
            Score6 = 5;
        }
        else{
            Score6 = 0;
        }
        totalScore = Score1 + Score2 + Score3 + Score4 + Score5 + Score6;
        if (totalScore == 30) {
            resultsDisplay = "Perfect! You scored 30 out of 30";
        } else {
            resultsDisplay = "Try again. You scored " + totalScore + " out of 30";
        }
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

    }

}


