package com.example.roushan.ecommerse.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.roushan.ecommerse.Adapter.HomeCategeryAdapter;
import com.example.roushan.ecommerse.Model.HomeCategrayModel;
import com.example.roushan.ecommerse.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    RecyclerView recyclerView;

    HomeCategeryAdapter homeCategeryAdapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         View view=  inflater.inflate(R.layout.fragment_main, container, false);

         recyclerView = view.findViewById(R.id.home_rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);


        //Top icon categrey

        List<HomeCategrayModel> homeCategrayModelList = new ArrayList<HomeCategrayModel>();
        homeCategrayModelList.add(new HomeCategrayModel("link","home"));
        homeCategrayModelList.add(new HomeCategrayModel("link","home"));
        homeCategrayModelList.add(new HomeCategrayModel("link","home"));
        homeCategrayModelList.add(new HomeCategrayModel("link","home"));
        homeCategrayModelList.add(new HomeCategrayModel("link","home"));
        homeCategrayModelList.add(new HomeCategrayModel("link","home"));
        homeCategrayModelList.add(new HomeCategrayModel("link","home"));
        homeCategrayModelList.add(new HomeCategrayModel("link","home"));
        homeCategrayModelList.add(new HomeCategrayModel("link","home"));
        homeCategrayModelList.add(new HomeCategrayModel("link","home"));
        homeCategrayModelList.add(new HomeCategrayModel("link","home"));
        homeCategrayModelList.add(new HomeCategrayModel("link","home"));
        homeCategrayModelList.add(new HomeCategrayModel("link","home"));
        homeCategrayModelList.add(new HomeCategrayModel("link","home"));
        homeCategeryAdapter = new HomeCategeryAdapter(homeCategrayModelList);
        recyclerView.setAdapter(homeCategeryAdapter);
        homeCategeryAdapter.notifyDataSetChanged();

        ///////////////////



        return view;

    }

}
