package com.example.madlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int btnI = 0;
    public String name1, name2, color, animal, thing, age, days, height;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonNext(View v){
        EditText word = (EditText) findViewById(R.id.editWord);
        Button button = (Button) findViewById(R.id.buttonSubmit);
        TextView text1 = (TextView) findViewById(R.id.textView1);
        TextView text2 = (TextView) findViewById(R.id.textView2);

        if (btnI <= 7) {
            if(word.getText().toString().equals("")){
                Toast toast = Toast.makeText(getApplicationContext(), "Please type in somethings", Toast.LENGTH_SHORT);
                toast.show();
            }
            else {
                text1.setText(text1.getText().toString() + button.getText().toString() + ":\n");
                text2.setText(text2.getText().toString() + word.getText().toString() + "\n");

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

        }

        else{
            //String name1, name2, color, animal, thing, age, days, height;
            Intent intent = new Intent(this, MadLibStory.class);
            intent.putExtra(MadLibStory.NAME1, name1);
            intent.putExtra(MadLibStory.NAME2, name2);
            intent.putExtra(MadLibStory.COLOR, color);
            intent.putExtra(MadLibStory.ANIMAL, animal);
            intent.putExtra(MadLibStory.THING, thing);
            intent.putExtra(MadLibStory.AGE, age);
            intent.putExtra(MadLibStory.DAYS, days);
            intent.putExtra(MadLibStory.HEIGHT, height);

            startActivity(intent);
        }

}
    public void reset(View v){
        EditText word = (EditText) findViewById(R.id.editWord);
        Button button = (Button) findViewById(R.id.buttonSubmit);
        TextView text1 = (TextView) findViewById(R.id.textView1);
        TextView text2 = (TextView) findViewById(R.id.textView2);

        btnI = 0;
        word.setText("");
        text1.setText("");
        text2.setText("");
        button.setText("a name");
    }

}
