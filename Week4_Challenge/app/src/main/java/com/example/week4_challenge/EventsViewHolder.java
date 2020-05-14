package com.example.androidfundamentals_1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EventsViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewName;
    private TextView textViewAddress;
    private ImageView imageViewEvent;

    public EventsViewHolder(@NonNull View itemView) {
        super(itemView);

        textViewName = itemView.findViewById(R.id.textViewName); //itemView preia contextul activitatii;
        textViewAddress = itemView.findViewById(R.id.textViewAddress);
        imageViewEvent = itemView.findViewById(R.id.imageViewEvent);
    }

    public TextView getTextViewName() {
        return textViewName;
    }

    public TextView getTextViewAddress() {
        return textViewAddress;
    }

    public ImageView getImageViewEvent() {
        return imageViewEvent;
    }
}
