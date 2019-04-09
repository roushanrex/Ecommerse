package com.example.roushan.ecommerse.Adapter;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.roushan.ecommerse.Model.BannerModel;
import com.example.roushan.ecommerse.Model.HomeCategrayModel;
import com.example.roushan.ecommerse.R;

import java.util.List;

public class BannerAdapter extends PagerAdapter {

    List<BannerModel> bannerModelList;


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {


        View itemView = LayoutInflater.from(container.getContext()).inflate(R.layout.itemhomecard, container, false);


        ImageView imageView = (ImageView) itemView.findViewById(R.id.banner);
        imageView.setImageResource(bannerModelList.get(position).getBannar());
        container.addView(itemView,0);


        return itemView;

    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        super.destroyItem(container, position, object);
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return false;
    }
}
