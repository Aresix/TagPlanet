package com.aresix.tagplanet.MyActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.aresix.tagplanet.Adapter.KidListAdapter;
import com.aresix.tagplanet.R;

public class KidListActivity extends AppCompatActivity {

    private RecyclerView mKidList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kid_list);

        mKidList=findViewById(R.id.KidList);
        mKidList.setLayoutManager(new LinearLayoutManager(KidListActivity.this));
        mKidList.setAdapter(new KidListAdapter(KidListActivity.this));
    }
}
