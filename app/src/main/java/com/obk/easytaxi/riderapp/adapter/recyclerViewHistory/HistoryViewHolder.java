package com.obk.easytaxi.riderapp.adapter.recyclerViewHistory;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.obk.easytaxi.riderapp.R;
import com.obk.easytaxi.riderapp.adapter.ClickListener;

public class HistoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView tvDriverName, tvTripDate;
    ClickListener listener;

    public HistoryViewHolder(View itemView, ClickListener listener) {
        super(itemView);
        tvDriverName=itemView.findViewById(R.id.tvDriverName);
        tvTripDate=itemView.findViewById(R.id.tvTripDate);
        this.listener=listener;

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
            this.listener.onClick(view, getAdapterPosition());
        }

}
