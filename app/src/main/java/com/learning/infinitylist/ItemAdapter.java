package com.learning.infinitylist;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    final String kTag = "Infinity";
    private ArrayList<Item> itemList;

    public ItemAdapter(ArrayList<Item> itemList){
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ItemAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.i(kTag, "Create ViewHolder");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position){
        Log.i(kTag, "Bind ViewHolder");
        Item item = itemList.get(position);
        holder.titleTextView.setText(item.getTitle());
        holder.descriptionTextView.setText(item.getDescription());
    }

    @Override
    public int getItemCount(){
        Log.i(kTag, "Get Item Count");
        return itemList.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder{
        TextView titleTextView;
        TextView descriptionTextView;

        public ItemViewHolder(View itemView){
            super(itemView);
            titleTextView = itemView.findViewById(R.id.title_text_view);
            descriptionTextView = itemView.findViewById(R.id.description_text_view);
        }
    }
}
