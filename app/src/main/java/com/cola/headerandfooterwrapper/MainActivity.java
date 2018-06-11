package com.cola.headerandfooterwrapper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        HeaderAndFooterWrapper wrapper = new HeaderAndFooterWrapper(new RecyclerViewAdapter());
        TextView headView1 = new TextView(getApplicationContext());
        headView1.setText("I am headerView1");
        TextView headView2 = new TextView(getApplicationContext());
        headView2.setText("I am headerView2");
        TextView footView1 = new TextView(getApplicationContext());
        footView1.setText("I am footerView1");
        TextView footView2 = new TextView(getApplicationContext());
        footView2.setText("I am footerView2");
        wrapper.addHeaderView(headView1);
        wrapper.addHeaderView(headView2);
        wrapper.addFooterView(footView1);
        wrapper.addFooterView(footView2);
        mRecyclerView.setAdapter(wrapper);
    }


}
