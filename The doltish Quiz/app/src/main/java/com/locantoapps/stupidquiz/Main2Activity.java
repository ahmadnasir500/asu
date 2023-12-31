package com.locantoapps.stupidquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    TextView tv, tvtotal;
    Button btn1, btn2, btn3, btn4;
    private level2 level2 = new level2();
    private String answer;
    //private int questionLength = question.questions.length;
    public int sequence = 0;
    public int totalCorrect = 0;
    public int totalQuestions = 9;
    public int totalAttempt = 0;
    public int wrong = 0;
    public int currentSatge = 1;
    public String flag="ok2";
    public String unlockflag="unlock3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sequence = 0;

        btn1 = (Button) findViewById(R.id.option1);
        btn1.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.option2);
        btn2.setOnClickListener(this);
        btn3 = (Button) findViewById(R.id.option3);
        btn3.setOnClickListener(this);
        btn4 = (Button) findViewById(R.id.option4);
        btn4.setOnClickListener(this);
        tv = findViewById(R.id.question);
        tvtotal = findViewById(R.id.total);
        NextQuestion(sequence);
        tvtotal.setText(sequence + "/" + totalQuestions);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.option1:
                if (btn1.getText() == answer) {

                    totalCorrect++;
                    conditions();

                }
                else {

                    wrong++;
                    conditions();

                }

                break;

            case R.id.option2:
                if (btn2.getText() == answer) {
                    totalCorrect++;
                    conditions();
                } else {
                    wrong++;
                    conditions();

                }

                break;
            case R.id.option3:
                if (btn3.getText() == answer) {
                    totalCorrect++;
                    conditions();
                } else {

                    wrong++;
                    conditions();

                }

                break;



            case R.id.option4:
                if (btn4.getText() == answer) {
                    totalCorrect++;
                    conditions();
                } else {
                    wrong++;
                    conditions();
                }

                break;
        }
    }

    private void NextQuestion(int num) {
        tv.setText(level2.getQuestion(num));
        btn1.setText(level2.getchoice1(num));
        btn2.setText(level2.getchoice2(num));
        btn3.setText(level2.getchoice3(num));
        btn4.setText(level2.getchoice4(num));
        answer = level2.getCorrectAnswer(num);
    }
    public void conditions(){
        if(sequence==totalQuestions){
            if(totalCorrect>=5){
                Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                intent.putExtra("flag",flag);
                startActivity(intent);
            }
            else{
                Intent intent=new Intent(Main2Activity.this,TryAgain.class);
                intent.putExtra("unlock",unlockflag);
                intent.putExtra("Wrong",wrong);
                startActivity(intent);
            }
        }
        else{
            sequence++;
            tvtotal.setText(sequence + "/" + totalQuestions);
            NextQuestion(sequence);
        }
    }
    public void onBackPressed(){
        finish();
        super.onBackPressed();
    }
}
