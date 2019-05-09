package com.example.a533.exam;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class JobOfferAdapter extends RecyclerView.Adapter<JobOfferAdapter.MyViewHolder> {
    private ArrayList<JobOfferModel> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView title;
        public TextView description;
        public TextView salary;
        public Button btn_retirer;

        public MyViewHolder(View v) {
            super(v);
            title = v.findViewById(R.id.txt_title);
            description = v.findViewById(R.id.txt_description);
            salary = v.findViewById(R.id.txt_salary);
            btn_retirer = v.findViewById(R.id.btn_retirer);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public JobOfferAdapter(ArrayList<JobOfferModel> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public JobOfferAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.job_offer_layout, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.title.setText(mDataset.get(position).getTitle());
        holder.description.setText(mDataset.get(position).getDescription());
        holder.salary.setText(mDataset.get(position).getSalary().toString() + " $");
        holder.btn_retirer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("1", "Retirer has been click");
                mDataset.remove(position);
                notifyDataSetChanged();
            }
        });

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}