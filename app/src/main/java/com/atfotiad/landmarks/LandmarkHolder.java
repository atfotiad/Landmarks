package com.atfotiad.landmarks;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LandmarkHolder extends RecyclerView.ViewHolder {

    public  TextView nameField;
    public  TextView linkField;
    public  ImageView imageField;


    public LandmarkHolder(@NonNull View itemView) {
        super(itemView);

        nameField = itemView.findViewById(R.id.nameField);
        linkField = itemView.findViewById(R.id.linkField);
        imageField = itemView.findViewById(R.id.imageField);

    }
}
