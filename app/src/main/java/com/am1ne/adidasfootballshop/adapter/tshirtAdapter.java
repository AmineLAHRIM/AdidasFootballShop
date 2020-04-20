package com.am1ne.adidasfootballshop.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.am1ne.adidasfootballshop.R;
import com.am1ne.adidasfootballshop.classes.Tshirt;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class tshirtAdapter extends RecyclerView.Adapter<tshirtAdapter.ViewHolder> {
    Context context;
    ArrayList<Tshirt> tshirts;
    LayoutInflater layoutInflater;
    private static final String DEVICE = "£";

    public tshirtAdapter(Context context, ArrayList<Tshirt> tshirts) {
        this.context = context;
        this.tshirts = tshirts;
        this.layoutInflater = LayoutInflater.from(context);
        ;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.photo_item, null, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d("tagini", "onBindViewHolder: " + this.tshirts.size());
        Tshirt currentTshirt = tshirts.get(position);
        Glide.with(context)
                .load(currentTshirt.getImg())
                .into(holder.img_photo);

        holder.price.setText(DEVICE + currentTshirt.getPrice());
        holder.item_title.setText(currentTshirt.getKit_name());

        Log.d("tagini", "onBindViewHolder: price" + currentTshirt.getPrice());
        holder.rl_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return tshirts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img_photo;
        RelativeLayout rl_photo;
        TextView item_title, price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_photo = itemView.findViewById(R.id.img_photo);
            rl_photo = itemView.findViewById(R.id.rl_photo);
            item_title = itemView.findViewById(R.id.item_title);
            price = itemView.findViewById(R.id.price);
            Log.d("tagini", "ViewHolder: ");
            itemView.setLayoutParams(new RecyclerView.LayoutParams(RecyclerView.LayoutParams.WRAP_CONTENT, RecyclerView.LayoutParams.MATCH_PARENT));

        }
    }
}
