package com.example.a533.exam;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Question1 extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    ArrayList<JobOfferModel> jobOffers = new ArrayList<JobOfferModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        setTitle("Question 1");

        JobOfferModel job1 = new JobOfferModel("First Job", "This is my first job offer for you Mr Techno", 28);
        JobOfferModel job2 = new JobOfferModel("Second Job", "This is my second job offer for you Mr Techno", 22);
        JobOfferModel job3 = new JobOfferModel("Third Job", "This is my third job offer for you Mr Techno", 75);
        jobOffers.add(job1);
        jobOffers.add(job2);
        jobOffers.add(job3);

        recyclerView = (RecyclerView) findViewById(R.id.job_offer_recycler_view);


        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        mAdapter = new JobOfferAdapter(jobOffers);
        recyclerView.setAdapter(mAdapter);
    }

}
