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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class SectionsOfMainContentRVAdapter extends RecyclerView.Adapter<SectionsOfMainContentRVAdapter.MyViewHolder> {
    ArrayList<sectionsOfMainContentModel> arrayList;
    Context context;

    public SectionsOfMainContentRVAdapter(ArrayList<sectionsOfMainContentModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public SectionsOfMainContentRVAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_content_recyclerview_list_item,parent,false);

        return new SectionsOfMainContentRVAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SectionsOfMainContentRVAdapter.MyViewHolder holder, int position) {

        sectionsOfMainContentModel model = arrayList.get(position);

        holder.sectionName.setText(model.getSectionName());
        InSectionsContentRVAdapter inSectionsContentRVAdapter = new InSectionsContentRVAdapter(model.getInSectionsContentModelArrayList(),context);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);

        holder.inSectionRV.setLayoutManager(layoutManager);

        holder.inSectionRV.setAdapter(inSectionsContentRVAdapter);


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView sectionName;
        RecyclerView inSectionRV;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            sectionName = (TextView) itemView.findViewById(R.id.section_name_main_content);
            inSectionRV = (RecyclerView) itemView.findViewById(R.id.section_recyclerView);

        }
    }
}
