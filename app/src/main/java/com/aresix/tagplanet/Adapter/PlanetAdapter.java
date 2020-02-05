package com.aresix.tagplanet.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aresix.tagplanet.R;

import static com.aresix.tagplanet.R.drawable.tag1;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder> {

    private Context mContext;
    private OnItemClickListener mListener;
    public PlanetAdapter(Context context,OnItemClickListener listener) {
        this.mContext = context;
        this.mListener=listener;
    }

    @NonNull
    @Override
    public PlanetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PlanetViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_planet_tag, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetViewHolder holder, final int position) {
        holder.imageView.setImageResource(tag1);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 8;
    }

    class PlanetViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;

        public PlanetViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.icon_btn);
        }
    }

    public interface OnItemClickListener{
        void onClick(int pos);
    }
}
