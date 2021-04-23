package com.ahmed.waheed.project.firebase.fooddelivaryapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrderAgainRVAdapter extends RecyclerView.Adapter<OrderAgainRVAdapter.MyViewHolder>{
    ArrayList<orderAgainModel> arrayList;

    public OrderAgainRVAdapter(ArrayList<orderAgainModel> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_again_card_view_item,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        orderAgainModel model = arrayList.get(position);

        holder.RestaurantName.setText(model.getRestaurantName());
        holder.foodPrice.setText(model.getFoodPrice());
        holder.foodDetails.setText(model.getFoodDetails());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView RestaurantName;
        TextView foodPrice;
        TextView foodDetails;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            RestaurantName = itemView.findViewById(R.id.order_again_RestaurantName);
            foodPrice = itemView.findViewById(R.id.order_again_foodPrice);
            foodDetails = itemView.findViewById(R.id.order_again_foodDetails);

        }
    }
}
