package com.aresix.tagplanet.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aresix.tagplanet.R;


public class PlanetTypeAdapter extends RecyclerView.Adapter<PlanetTypeAdapter.PlanetViewHolder> {

    private Context mContext;
    private OnItemClickListener mListener;

    private int[] mDrawables = {R.drawable.testpicturedemo, R.drawable.testcat1, R.drawable.testcat2, R.drawable.testcat3,
            R.drawable.testcat4, R.drawable.testcat5,R.drawable.testcat6,R.drawable.testcat7,R.drawable.testcat8,R.drawable.testcat9};

    public PlanetTypeAdapter(Context context,OnItemClickListener listener){
        this.mContext=context;
        this.mListener=listener;
    }

    @NonNull
    @Override
    public PlanetTypeAdapter.PlanetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PlanetViewHolder(LayoutInflater.from(mContext).inflate(R.layout.activity_planet_type_adapter,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetTypeAdapter.PlanetViewHolder holder, final int position) {
        holder.tagListItem.setImageResource(mDrawables[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDrawables.length;
    }

    class PlanetViewHolder extends RecyclerView.ViewHolder{
        private ImageView tagListItem;
        public PlanetViewHolder(@NonNull View itemView) {
            super(itemView);
            tagListItem=itemView.findViewById(R.id.Pic);
        }
    }

    public interface OnItemClickListener{
        void onClick(int pos);
    }
}
