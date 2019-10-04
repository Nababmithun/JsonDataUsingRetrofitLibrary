package com.androidlime.jsondatausingretrofitlibrary;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Mithun on 10/4/2019.
 */

public class DataViewHolder extends RecyclerView.ViewHolder {


    TextView name,email;



    public DataViewHolder(View itemView) {
        super(itemView);


        name=itemView.findViewById(R.id.name);
        email=itemView.findViewById(R.id.email);





    }



}
