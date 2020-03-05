package com.atfotiad.landmarks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.atfotiad.landmarks.Model.Landmark;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.squareup.picasso.Picasso;

public class HistoryActivity extends AppCompatActivity {

    public HistoryActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);


        RecyclerView recyclerView  =findViewById(R.id.recyclerview);




        Query query = FirebaseDatabase.getInstance()
                .getReference()
                .child("landmark");

        FirebaseRecyclerOptions options = new FirebaseRecyclerOptions.Builder<Landmark>()
                .setQuery(query, Landmark.class)
                .setLifecycleOwner(this)
                .build();


        FirebaseRecyclerAdapter adapter = new FirebaseRecyclerAdapter<Landmark, LandmarkHolder>(options) {


            @NonNull
            @Override
            public LandmarkHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
                View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row,viewGroup,false);

                return new LandmarkHolder(view);
            }

            @Override
            protected void onBindViewHolder(@NonNull LandmarkHolder holder, int position, @NonNull Landmark model) {

                holder.nameField.setText(model.getName());
                holder.linkField.setText(model.getLink());
                //Picasso.get().load(model.getImage()).centerCrop().into(holder.imageField);


            }
        };


        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));
        recyclerView.setAdapter(adapter);


    }
}
