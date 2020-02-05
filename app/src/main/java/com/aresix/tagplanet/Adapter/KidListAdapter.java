package com.aresix.tagplanet.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aresix.tagplanet.R;

public class KidListAdapter extends RecyclerView.Adapter<KidListAdapter.KLViewHolder> {

    private Context mContext;
    public KidListAdapter(Context context){
        this.mContext=context;
    }

    @NonNull
    @Override
    public KLViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new KLViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_kid_list_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull KLViewHolder holder, int position) {
        String kn="宝宝"+position+"号";
        holder.name.setText(kn);
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class KLViewHolder extends RecyclerView.ViewHolder{

        private TextView name;

        public KLViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.KidName);
        }
    }
}
