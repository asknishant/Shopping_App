package com.example.shoppingapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LaptopsRecyclerViewAdapter extends RecyclerView.Adapter<LaptopsRecyclerViewAdapter.LaptopsViewHolder> {

    private ArrayList<LaptopsRecyclerView> laptopList;

    public LaptopsRecyclerViewAdapter(ArrayList<LaptopsRecyclerView> laptopList) {
        this.laptopList = laptopList;
    }

    public  static class LaptopsViewHolder extends RecyclerView.ViewHolder{

        private ImageView mImageView;
        public TextView textView1,textView2;
        public Button button,rating;
        public LaptopsViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView=itemView.findViewById(R.id.laptopimage);
            textView1=itemView.findViewById(R.id.laptoptext);
            button=itemView.findViewById(R.id.addtocart);
            rating=itemView.findViewById(R.id.rating);
            textView2=itemView.findViewById(R.id.price);
        }
    }

    @NonNull
    @Override
    public LaptopsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.laptopslayout, parent, false);
        LaptopsViewHolder viewHolder = new LaptopsViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LaptopsViewHolder holder, int position) {
        LaptopsRecyclerView laptopsRecyclerView = laptopList.get(position);
        holder.mImageView.setImageResource(laptopsRecyclerView.getmImageResource());
        holder.textView1.setText(laptopsRecyclerView.getText1());
        holder.button.setText(laptopsRecyclerView.getText2());
        holder.rating.setText(laptopsRecyclerView.getmText3());
        holder.textView2.setText(laptopsRecyclerView.getmText4());

    }
    @Override
    public int getItemCount() {
        return laptopList.size();
    }



}
