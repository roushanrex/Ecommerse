package com.example.roushan.ecommerse.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.roushan.ecommerse.Model.HomeCategrayModel;
import com.example.roushan.ecommerse.R;

import java.util.List;


public class HomeCategeryAdapter extends RecyclerView.Adapter<HomeCategeryAdapter.MyViewholder> {

        List<HomeCategrayModel> homeCategrayModelList;

    public HomeCategeryAdapter(List<HomeCategrayModel> homeCategrayModelList) {
        this.homeCategrayModelList = homeCategrayModelList;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itemhomecard, viewGroup, false);


        return new MyViewholder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder myViewholder, int i) {

        myViewholder.name.setText(homeCategrayModelList.get(i).getName());
        myViewholder.name.setText(homeCategrayModelList.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return homeCategrayModelList.size();
    }

    public class MyViewholder extends RecyclerView.ViewHolder
    {
        ImageView icon;
        TextView name;


        public MyViewholder(@NonNull View itemView) {
            super(itemView);

            icon = itemView.findViewById(R.id.icon);
            name = itemView.findViewById(R.id.name);

            name.setText("Home");


        }
    }

}
