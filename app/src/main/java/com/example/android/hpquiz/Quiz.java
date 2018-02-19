package com.example.android.hpquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    int score = 0;

    public void summary (View view){

        RadioButton ans1_2 = findViewById(R.id.ans1_2);
        RadioButton ans2_2 = findViewById(R.id.ans2_2);
        RadioButton ans3_2 = findViewById(R.id.ans3_2);
        RadioButton ans4_1 = findViewById(R.id.ans4_1);
        RadioButton ans5_4 = findViewById(R.id.ans5_4);
        RadioButton ans6_3 = findViewById(R.id.ans6_3);

        EditText ans7 = findViewById(R.id.ans7);

        CheckBox ans8_1 = findViewById(R.id.ans8_1);
        CheckBox ans8_2 = findViewById(R.id.ans8_2);
        CheckBox ans8_3 = findViewById(R.id.ans8_3);
        CheckBox ans8_4 = findViewById(R.id.ans8_4);

        if (ans1_2.isChecked())
            score += 1;
        if (ans2_2.isChecked())
            score += 1;
        if (ans3_2.isChecked())
            score += 1;
        if (ans4_1.isChecked())
            score += 1;
        if (ans5_4.isChecked())
            score += 1;
        if (ans6_3.isChecked())
            score += 1;

        String text7 = ans7.getText().toString().toLowerCase().replaceAll(" ","");
        if (text7.equals("red") || text7.equals("scarlet") || text7.equals("crimson") || text7.equals("gules"))
            score +=1;

        if (!ans8_1.isChecked() && ans8_2.isChecked() && !ans8_3.isChecked() && ans8_4.isChecked())
            score +=1;

        String summaryText = "You scored "+score+" points!";

        TextView scoreText = findViewById(R.id.score_text);
        scoreText.setText(summaryText);

        //restart score
        score = 0;
    }
}
