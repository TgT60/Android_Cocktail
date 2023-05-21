package com.example.recipebookfinal.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipebookfinal.R;
import com.example.recipebookfinal.model.Shot;

import java.util.List;

public class ShotsAdapter extends RecyclerView.Adapter<ShotsAdapter.ShotsViewFolder> {

    Context context;
    List<Shot> shots;

    public ShotsAdapter(Context context, List<Shot> shots) {
        this.context = context;
        this.shots = shots;
    }

    @NonNull
    @Override
    public ShotsViewFolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View shotItems = LayoutInflater.from(context).inflate(R.layout.shot_item, parent, false);
        return new ShotsAdapter.ShotsViewFolder(shotItems);
    }

    @Override
    public void onBindViewHolder(@NonNull ShotsViewFolder holder, int position) {
        holder.shotBg.setBackgroundColor(Color.parseColor(shots.get(position).getColor()));

        int imageId = context.getResources().getIdentifier("ic_"+shots.get(position).getImg(), "drawable", context.getPackageName());
        holder.shotImage.setImageResource(imageId);

        holder.shotDescription.setText(shots.get(position).getTitle());
        holder.shotTitle.setText(shots.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return shots.size();
    }

    public static final class ShotsViewFolder extends RecyclerView.ViewHolder{

        LinearLayout shotBg;
        ImageView shotImage;
        TextView shotDescription, shotTitle;
        public ShotsViewFolder(@NonNull View itemView) {
            super(itemView);

            shotBg = itemView.findViewById(R.id.shotBg);
            shotImage = itemView.findViewById(R.id.shotImage);
            shotDescription = itemView.findViewById(R.id.descriptionDate);
            shotTitle = itemView.findViewById(R.id.strengthData);
        }
    }

}
