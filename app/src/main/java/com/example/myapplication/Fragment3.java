package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Fragment3 extends Fragment {

    private RecyclerView recyclerView;

    public Fragment3() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view=inflater.inflate(R.layout.tab03, container, false);
        recyclerView=view.findViewById(R.id.recy03);
        List<String> list=new ArrayList<>();

        for (int i=1;i<19;i++){
            list.add("小程序"+i+"  ");
        }

        Context context=getContext();
        Adapter_old adapter=new Adapter_old(context,list);

//        LinearLayoutManager layoutManager=new LinearLayoutManager(context);
//        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 2));

        recyclerView.setAdapter(adapter);

        return view;
    }
}