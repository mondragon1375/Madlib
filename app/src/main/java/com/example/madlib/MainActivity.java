package com.example.madlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int btnI = 0;
    String name1, name2, color, animal, thing, age, days, height;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonNext(View v){
        EditText word = (EditText) findViewById(R.id.editWord);
        Button button = (Button) findViewById(R.id.buttonSubmit);
        TextView text = (TextView) findViewById(R.id.textView);

        if (btnI <= 7) {
            text.setText(text.getText().toString() + button.getText().toString() + ": " + word.getText() + "\n");

            if (btnI == 0) {
                name1 = word.getText().toString();
                button.setText("a number");
            } else if (btnI == 1) {
                age = word.getText().toString();
                button.setText("a color");
            } else if (btnI == 2) {
                color = word.getText().toString();
                button.setText("an animal");
            } else if (btnI == 3) {
                animal = word.getText().toString();
                button.setText("a big number");
            } else if (btnI == 4) {
                days = word.getText().toString();
                button.setText("a name");
            } else if (btnI == 5) {
                name2 = word.getText().toString();
                button.setText("an object");
            } else if (btnI == 6) {
                thing = word.getText().toString();
                button.setText("a small number");
            } else if (btnI == 7) {
                height = word.getText().toString();
                button.setText("finished story");
            }
            word.setText("");
            btnI += 1;

        }
        else{
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, "");
            //Do this^^^^^^^ and much more
        }
    }

    public void reset(View v){
        EditText word = (EditText) findViewById(R.id.editWord);
        Button button = (Button) findViewById(R.id.buttonSubmit);
        TextView text = (TextView) findViewById(R.id.textView);

        btnI = 0;
        word.setText("");
        text.setText("");
        button.setText("a name");
    }

}
