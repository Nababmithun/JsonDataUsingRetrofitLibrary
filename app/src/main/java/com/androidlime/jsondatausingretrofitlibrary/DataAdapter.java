package com.androidlime.jsondatausingretrofitlibrary;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Mithun on 10/4/2019.
 */

public class DataAdapter extends RecyclerView.Adapter<DataViewHolder> {


    private List<OurDataSet>list;
    private Context context;

    public DataAdapter(List<OurDataSet> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view= LayoutInflater.from(context).inflate(R.layout.row,parent,false);


        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataViewHolder holder, int position) {



        OurDataSet currentdata=list.get(position);

        holder.name.setText(currentdata.getName());
        holder.email.setText(currentdata.getEmail());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
