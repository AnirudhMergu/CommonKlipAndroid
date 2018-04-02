package com.anirudhmergu.commonklip;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context mContext;
    private List<ClipboardItem> mData;

    public RecyclerViewAdapter(Context mContext, List<ClipboardItem> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;

        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_clipboarditem_text, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.clipboardText.setText(mData.get(position).getData());
        holder.arrivalTime.setText(mData.get(position).getTime());
        holder.deviceId.setText(mData.get(position).getDevice());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView clipboardText;
        TextView arrivalTime;
        TextView deviceId;

        public ViewHolder(View itemView) {
            super(itemView);

            clipboardText = itemView.findViewById(R.id.cardview_clipboard_text);
            arrivalTime = itemView.findViewById(R.id.cardview_arrival_time);
            deviceId = itemView.findViewById(R.id.cardview_device_info);

        }
    }
}
