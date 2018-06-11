package com.cola.headerandfooterwrapper;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.CustomViewHolder> {

    private ArrayList<String> mStringList;
    public RecyclerViewAdapter(){
        mStringList = mockData();
    }


    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.item_recycler_view, null);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.textView.setText(mStringList.get(position));
    }

    @Override
    public int getItemCount() {
        return mStringList.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{

        private TextView textView;
        public CustomViewHolder(View itemView) {
            super(itemView);
            textView = (TextView)itemView.findViewById(R.id.desc_tv);
        }
    }

    private ArrayList<String> mockData(){
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 0; i < 40; i++){
            arrayList.add("第" + i + "个元素");
        }
        return arrayList;
    }

}
