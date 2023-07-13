package com.example.hanif;

import android.content.Context;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.Viewholder> {
   private List<ModelClass>modelClassList;
  TextToSpeech textToSpeech;

    public Adapter(List<ModelClass> modelClassList) {
        this.modelClassList = modelClassList;
    }

    @NonNull
    @Override
    public Adapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        return new Viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.Viewholder holder, int position) {
     String name=modelClassList.get(position).getName();

     holder.setData(name);
        holder.itemView.startAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(),R.anim.hanif_ani));
        textToSpeech=new TextToSpeech(holder.itemView.getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {



            }
        });





    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder  {
        private TextView personName;
        public Viewholder(@NonNull View itemView) {
            super(itemView);

            personName=itemView.findViewById(R.id.textViewIDChild);
        }
        private void setData(String name){
            personName.setText(name);

        }
    }
}
