package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//<>覆盖基类方法,自定义子类替代基类
public class Adapter_old extends RecyclerView.Adapter<Adapter_old.Myholder> {
    private View view;
    private Context context;
    private List<String> list;

    public Adapter_old(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }

    //    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //viewholder指向view的指针
        view = LayoutInflater.from(context).inflate(R.layout.item_old, parent, false);
        Myholder holder;
        holder = new Myholder(view);
        return holder;
        //压缩出一个view
    }


    @Override
    public void onBindViewHolder(@NonNull Myholder holder, @SuppressLint("RecyclerView") int j) {
        //视图里面放什么数据
        //循环一一对应
        //一个 holder 对应 一行
        //不需要自己写for循环
        holder.textView.setText(list.get(j));
        holder.linearLayout_old.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(view.getContext(), list.get(j), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        //告诉有多少行
        return list.size();
    }

    class Myholder extends RecyclerView.ViewHolder {
        private TextView textView;
        private LinearLayout linearLayout_old;

        public Myholder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text1);
            linearLayout_old = itemView.findViewById(R.id.linearlayout_old);
        }
    }
}
