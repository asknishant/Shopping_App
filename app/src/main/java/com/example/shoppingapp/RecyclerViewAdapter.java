package com.example.shoppingapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> itemNames = new ArrayList<>();
    private ArrayList<Integer> mImageUrls = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(ArrayList<String> itemNames ,ArrayList<Integer> mImageUrls,  Context context) {
        this.itemNames = itemNames;
        this.mImageUrls = mImageUrls;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.toplist,parent,false);
        return new ViewHolder(view);

    }

    //Binding each of the items of the recyclerView with data.
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        
        holder.imageButton.setImageResource(mImageUrls.get(position));
         holder.textView.setText(itemNames.get(position));

         holder.imageButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

             }
         });
    }

    @Override
    public int getItemCount() {
        return itemNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageButton imageButton;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageButton=itemView.findViewById(R.id.imageButton);
            textView=itemView.findViewById(R.id.textonbutton);
        }
    }
}
