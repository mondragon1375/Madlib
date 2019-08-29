package com.example.madlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendInfo(View v){
        EditText word = (EditText) findViewById(R.id.editWord);
        Button enter = (Button) findViewById(R.id.buttonSubmit);
        TextView text = (TextView) findViewById(R.id.textView);

        String outputText = text.getText().toString() + " " + word.getText().toString();
        text.setText(outputText);
        word.setText("");
        enter.setText(enter.getText().toString() + "1");
    }
}
