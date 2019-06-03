package com.example.smartrefreshlayout;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MeAdapter extends RecyclerView.Adapter<MeAdapter.VHolder> {


    @NonNull
    @Override
    public VHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);

        return new VHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull VHolder vHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 15;
    }

    class VHolder extends RecyclerView.ViewHolder{

        public VHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
