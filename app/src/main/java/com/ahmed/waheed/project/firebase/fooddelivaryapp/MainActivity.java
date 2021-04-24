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
    ArrayList<sectionsOfMainContentModel> sectionsOfMainContentModels = new ArrayList<sectionsOfMainContentModel>();

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
        newOffersModels.add(new newOffersModel("https://miro.medium.com/max/2048/1*ERxnqwJLFqC0kLWvAs03gg.jpeg"));
        newOffersModels.add(new newOffersModel("https://h3s7d6c6.stackpathcdn.com/wp-content/webp-express/webp-images/uploads/2021/03/Post-4-Nuggets-Offer-website-1.png.webp"));
        newOffersModels.add(new newOffersModel("https://res.cloudinary.com/foodoplanet/images/f_auto,q_auto:low/v1577049657/McDonalds-Karachi-Deals-1_fiioi3/McDonalds-Karachi-Deals-1_fiioi3.webp"));
        newOffersModels.add(new newOffersModel("https://www.sizzlingpubs.co.uk/content/dam/sizzling-pubs/images/2020/deals/offerspage/sub-sizz-offers-banner-m-noCTA.jpg.asset/1602513771628.jpg"));

        NewOffersRVAdapter newOffersRVAdapter = new NewOffersRVAdapter(newOffersModels,getBaseContext());

        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        newOffersRecyclerView.setLayoutManager(layoutManager);

        newOffersRecyclerView.setAdapter(newOffersRVAdapter);


        // sections recyclerview setup
        RecyclerView MainContentRecyclerView = (RecyclerView)findViewById(R.id.main_content_recyclerView);

        // adding data to it
        ArrayList<inSectionsContentModel> section1 = new ArrayList<>();
        section1.add(new inSectionsContentModel("https://sm.mashable.com/mashable_in/photo/default/kfc-chicken_wnn1.jpg","KFC","Very good","Fast Food, Fried Chicken","EGP 15.00","Within 45 mins"));
        section1.add(new inSectionsContentModel("https://cdn1.matadornetwork.com/blogs/1/2018/09/McDonalds-menu-items-from-around-the-world-1200x900.jpeg","McDonald's","Very good","Fast Food","EGP 20.00","Within 35 mins"));
        section1.add(new inSectionsContentModel("https://thumbor.thedailymeal.com/swebZ-nHpovDM--B0b1nQiB9uq8=//https://www.thedailymeal.com/sites/default/files/2018/05/17/copy/Pizza%20Hut%20Hero.jpg","Pizza Hut","Good","Pizza","EGP 15.00","Within 45 mins"));

        ArrayList<inSectionsContentModel> section2 = new ArrayList<>();
        section2.add(new inSectionsContentModel("https://images.kidzapp.com/media/CACHE/images/venues/d73480a6-56c2-11e9-8ea7-960e731c160b/d526d88932f9465ec28965c2fec92479.jpg","Sale Sucre","Very good","Desserts","EGP 15.00","Within 45 mins"));
        section2.add(new inSectionsContentModel("https://i.ytimg.com/vi/UgV0seB-ETg/maxresdefault.jpg","Kunafa Hut","Very good","Desserts","EGP 10.00","Within 35 mins"));

        ArrayList<inSectionsContentModel> section3 = new ArrayList<>();
        section3.add(new inSectionsContentModel("https://prod-wolt-venue-images-cdn.wolt.com/5e8c7c1e2e8fcb7305b9a5cb/eedea972-1ae6-11eb-aa12-c27bd115b363_new_menu.jpg","Cinnabon","Very good","Desserts","EGP 15.00","Within 45 mins"));
        section3.add(new inSectionsContentModel("https://i.pinimg.com/originals/f7/10/8b/f7108b8936422b1487a7cb1c67f63585.jpg","Dunkin Donuts","Very good","Desserts, Drinks","EGP 20.00","Within 35 mins"));
        section3.add(new inSectionsContentModel("https://images.kidzapp.com/media/CACHE/images/venues/d73480a6-56c2-11e9-8ea7-960e731c160b/d526d88932f9465ec28965c2fec92479.jpg","Sale Sucre","Very good","Desserts","EGP 15.00","Within 45 mins"));

        sectionsOfMainContentModels.add(new sectionsOfMainContentModel("Fast Food",section1));
        sectionsOfMainContentModels.add(new sectionsOfMainContentModel("Ramadan Desserts",section2));
        sectionsOfMainContentModels.add(new sectionsOfMainContentModel("Desserts",section3));


        SectionsOfMainContentRVAdapter sectionsOfMainContentRVAdapter = new SectionsOfMainContentRVAdapter(sectionsOfMainContentModels,getBaseContext());

        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        MainContentRecyclerView.setLayoutManager(layoutManager);

        MainContentRecyclerView.setAdapter(sectionsOfMainContentRVAdapter);


    }


}