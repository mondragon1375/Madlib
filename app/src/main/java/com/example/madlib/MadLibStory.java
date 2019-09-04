package com.example.madlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MadLibStory extends AppCompatActivity {
    //String name1, name2, color, animal, thing, age, days, height;

    public static final String NAME1 = "name1";
    public static final String NAME2 = "name2";
    public static final String COLOR = "color";
    public static final String ANIMAL = "animal";
    public static final String THING = "thing";
    public static final String AGE = "age";
    public static final String DAYS = "days";
    public static final String HEIGHT = "height";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madlib_intent);

        Intent intent = getIntent();
        String name1 = intent.getStringExtra(NAME1);
        String name2 = intent.getStringExtra(NAME2);
        String color = intent.getStringExtra(COLOR);
        String animal = intent.getStringExtra(ANIMAL);
        String thing = intent.getStringExtra(THING);
        String age = intent.getStringExtra(AGE);
        String days = intent.getStringExtra(DAYS);
        String height = intent.getStringExtra(HEIGHT);

        String story = "Test: " + name1 + " is " + age + " years old but is still loves the outdoors." +
                name1 + " went to the zoo today with " + name2 + " to go see their favorite animal the " +
                animal + ". However. when they came to view the " + animal + ", it was " + color + " and stood " +
                height + " feet tall! It was only the " + days + " day they were there but something told them";
    }
}
