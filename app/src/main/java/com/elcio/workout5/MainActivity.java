package com.elcio.workout5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WorkoutDetailFragment detailFragment = (WorkoutDetailFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_detail);

        detailFragment.setWorkoutId(0);
    }
}
