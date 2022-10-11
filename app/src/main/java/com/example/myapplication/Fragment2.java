package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Fragment2 extends Fragment {

    private RecyclerView recyclerView;
    private List<String> listname = new ArrayList<>();

    public Fragment2() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.tab02, container, false);
        recyclerView = view.findViewById(R.id.recy02);
        List<String> list = new ArrayList<>();

        for (int i = 1; i < 9; i++) {
            list.add("this is No." + i + "好友");
        }
        listname();
        Context context = getContext();
        Adapter_chat adapter = new Adapter_chat(context, listname, list);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return view;
    }

    private void listname() {
        listname.add("张三");
        listname.add("李四");
        listname.add("王五");
        listname.add("赵六");
    }

}