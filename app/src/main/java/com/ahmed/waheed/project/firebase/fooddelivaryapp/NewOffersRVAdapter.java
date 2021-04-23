package com.ahmed.waheed.project.firebase.fooddelivaryapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class NewOffersRVAdapter extends RecyclerView.Adapter<NewOffersRVAdapter.MyViewHolder>{
    ArrayList<newOffersModel> arrayList;
    Context context;

    public NewOffersRVAdapter(ArrayList<newOffersModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.new_offers_card_item,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        newOffersModel model = arrayList.get(position);

        Animation myFadeInAnimation = AnimationUtils.loadAnimation(context, R.anim.fadein);
        holder.offerImage.startAnimation(myFadeInAnimation);

        Picasso.with(context).load(model.getImageUrl()).fit().centerCrop()
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.placeholder)
                .into(holder.offerImage);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView offerImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            offerImage = itemView.findViewById(R.id.new_offers_image);


        }
    }
}
