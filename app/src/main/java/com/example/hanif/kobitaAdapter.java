package com.example.hanif;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class kobitaAdapter extends RecyclerView.Adapter<kobitaAdapter.MyViewHolder> {

private Context context;
private ArrayList<Model>arrayList;
kobitaAdapter(Context context,ArrayList<Model>arrayList){
    this.context=context;
    this.arrayList=arrayList;
}
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(context);
     View v=layoutInflater.inflate(R.layout.kobitaitemrow,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(v);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


    holder.image.setImageResource(arrayList.get(position).foodimage);
    holder.foodname.setText(arrayList.get(position).foodname.toString());
    holder.itemView.startAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(),R.anim.hanif_ani));

    switch (position){

        case 0:
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(view.getContext(),KobitaActivity.class);
                    view.getContext().startActivity(intent);
                }
            });
            break;
        case 1:
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intentt=new Intent(view.getContext(),AyreActivity.class);
                    view.getContext().startActivity(intentt);
                }
            });
            break;
        case 2:
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intentt=new Intent(view.getContext(),AtagaceActivity.class);
                    view.getContext().startActivity(intentt);
                }
            });
            break;
        case 3:
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intentt=new Intent(view.getContext(),AyayChadActivity.class);
                    view.getContext().startActivity(intentt);
                }
            });
            break;
        case 4:
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intentt=new Intent(view.getContext(),Bakbakummactivity.class);
                    view.getContext().startActivity(intentt);
                }
            });
            break;
        case 5:
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intentt=new Intent(view.getContext(),HattitActivity.class);
                    view.getContext().startActivity(intentt);
                }
            });
            break;
        case 6:
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intentt=new Intent(view.getContext(),LotonActivity.class);
                    view.getContext().startActivity(intentt);
                }
            });
            break;
        case 7:
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intentt=new Intent(view.getContext(),GhumparaniActivity.class);
                    view.getContext().startActivity(intentt);
                }
            });
            break;
        case 8:
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intentt=new Intent(view.getContext(),ChaduteceActivity.class);
                    view.getContext().startActivity(intentt);
                }
            });
            break;
    }

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

    TextView foodname;
    ImageView image;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            foodname=itemView.findViewById(R.id.kobitaNametvID);
            image=itemView.findViewById(R.id.imageViewID);

        }
    }
}
