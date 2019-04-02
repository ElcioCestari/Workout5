package com.elcio.workout5;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Transition;

public class MainActivity extends AppCompatActivity implements WorkoutListFragment.WorkoutListListner{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WorkoutDetailFragment detailFragment = (WorkoutDetailFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_detail);

        //detailFragment.setWorkoutId(0);
    }

    @Override
    public void itemClicked(long id) {
        WorkoutDetailFragment detailFragment = new WorkoutDetailFragment();
        FragmentTransaction transition = getSupportFragmentManager().beginTransaction();
        detailFragment.setWorkoutId((int) id);
        transition.replace(R.id.fragment_detail, detailFragment);
        transition.addToBackStack(null);
        transition.setTransition(transition.TRANSIT_FRAGMENT_FADE);
        transition.commit();
        //
    }
}
