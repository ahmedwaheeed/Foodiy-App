package com.ahmed.waheed.project.firebase.fooddelivaryapp;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<orderAgainModel> orderAgainModels = new ArrayList<orderAgainModel>();
    ArrayList<newOffersModel> newOffersModels = new ArrayList<newOffersModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView browseImage= (ImageView)findViewById(R.id.browse_image);
        Animation myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein);
        browseImage.startAnimation(myFadeInAnimation);

        // order again recycler view setup
        RecyclerView orderAgainRecyclerView = (RecyclerView)findViewById(R.id.order_again_recyclerView);

        // adding data to the order again list here
        orderAgainModels.add(new orderAgainModel("Kunafa Hut","EGP 55.00","1x Rough Konafa Nabulsia"));
        orderAgainModels.add(new orderAgainModel("Kunafa Hut","EGP 130.00","4x Konafa Mango"));
        orderAgainModels.add(new orderAgainModel("Kunafa Hut","EGP 85.00","2x Konafa Nutella"));
        orderAgainModels.add(new orderAgainModel("Kunafa Hut","EGP 205.00","5x Konafa Mix"));

        OrderAgainRVAdapter orderAgainRVAdapter = new OrderAgainRVAdapter(orderAgainModels);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        orderAgainRecyclerView.setLayoutManager(layoutManager);

        orderAgainRecyclerView.setAdapter(orderAgainRVAdapter);






        // new offers recycler view setup
        RecyclerView newOffersRecyclerView = (RecyclerView)findViewById(R.id.new_offers_recyclerView);

        // adding data to the new offers list here
        newOffersModels.add(new newOffersModel("https://h3s7d6c6.stackpathcdn.com/wp-content/webp-express/webp-images/uploads/2021/03/Post-4-Nuggets-Offer-website-1.png.webp"));
        newOffersModels.add(new newOffersModel("https://res.cloudinary.com/foodoplanet/images/f_auto,q_auto:low/v1577049657/McDonalds-Karachi-Deals-1_fiioi3/McDonalds-Karachi-Deals-1_fiioi3.webp"));
        newOffersModels.add(new newOffersModel("https://www.sizzlingpubs.co.uk/content/dam/sizzling-pubs/images/2020/deals/offerspage/sub-sizz-offers-banner-m-noCTA.jpg.asset/1602513771628.jpg"));
        newOffersModels.add(new newOffersModel("https://miro.medium.com/max/2048/1*ERxnqwJLFqC0kLWvAs03gg.jpeg"));

        NewOffersRVAdapter newOffersRVAdapter = new NewOffersRVAdapter(newOffersModels,getBaseContext());

        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        newOffersRecyclerView.setLayoutManager(layoutManager);

        newOffersRecyclerView.setAdapter(newOffersRVAdapter);
    }


}