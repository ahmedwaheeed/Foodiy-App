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

public class InSectionsContentRVAdapter extends RecyclerView.Adapter<InSectionsContentRVAdapter.MyViewHolder>{

    ArrayList<inSectionsContentModel> arrayList;
    Context context;

    public InSectionsContentRVAdapter(ArrayList<inSectionsContentModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public InSectionsContentRVAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.in_section_content_list_item,parent,false);

        return new InSectionsContentRVAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InSectionsContentRVAdapter.MyViewHolder holder, int position) {

        inSectionsContentModel model = arrayList.get(position);

        Animation myFadeInAnimation = AnimationUtils.loadAnimation(context, R.anim.fadein);
        holder.FoodImage.startAnimation(myFadeInAnimation);

        Picasso.with(context).load(model.getImageUrl()).fit().centerCrop()
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.placeholder)
                .into(holder.FoodImage);

        holder.RestaurantName.setText(model.getRestaurantName());
        holder.DeliveryFees.setText("Delivery : " + model.getDeliveryFees());
        holder.FoodType.setText(model.getTypeOfOrders());
        holder.Duration.setText(model.getDurationOfDelivery());
        holder.Rating.setText(model.getRating());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView FoodImage;
        TextView RestaurantName;
        TextView FoodType;
        TextView Duration;
        TextView Rating;
        TextView DeliveryFees;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            RestaurantName = (TextView)itemView.findViewById(R.id.restaurant_name_in_sections);
            FoodType = (TextView)itemView.findViewById(R.id.food_type_in_sections);
            Duration = (TextView)itemView.findViewById(R.id.food_duration_in_sections);
            Rating = (TextView)itemView.findViewById(R.id.food_rating_in_sections);
            DeliveryFees = (TextView)itemView.findViewById(R.id.delivery_fees_in_sections);
            FoodImage = (ImageView)itemView.findViewById(R.id.food_image_in_sections);


        }
    }
}
