package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//<>覆盖基类方法,自定义子类替代基类
public class Adapter_chat extends RecyclerView.Adapter<Adapter_chat.Myholder> {
    private View view;
    private Context context;
    private List<String> listname;
    private List<String> listdata;


    public Adapter_chat(Context context, List<String> listname, List<String> listdata) {
        this.context = context;
        this.listname = listname;
        this.listdata = listdata;
    }

    //    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //viewholder指向view的指针
        view = LayoutInflater.from(context).inflate(R.layout.item_chat, parent, false);
        Myholder holder;
        holder = new Myholder(view);
        return holder;
        //压缩出一个view
    }

    //
//    @Override
//    public void onBindViewHolder(@NonNull Myholder holder, int j) {
//        //视图里面放什么数据
//        //循环一一对应
//        //一个 holder 对应 一行
//        //不需要自己写for循环
////        holder.textView.setText(list.get(j));
//
//
//    }
    @SuppressLint("ClickableViewAccessibility")
    @Override
    public void onBindViewHolder(@NonNull Myholder holder, @SuppressLint("RecyclerView") int position) {
        holder.textView1.setText(listname.get(position));
        holder.textView2.setText(listdata.get(position));
        holder.linearLayout_item1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if ((event.getAction() & MotionEvent.ACTION_MASK) == MotionEvent.ACTION_UP) {
                    Intent intent = new Intent(holder.itemView.getContext(), chat_Activity.class);
                    intent.putExtra("msg", "好友:" + listname.get(position) + "\n" + listdata.get(position));
                    context.startActivity(intent);
                }
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        //告诉有多少行
        return listname.size();
    }


    class Myholder extends RecyclerView.ViewHolder {
        private TextView textView1, textView2;
        LinearLayout linearLayout_item1;

        public Myholder(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.textView_item1);
            textView2 = itemView.findViewById(R.id.textView_item2);
//            imageView_item1 = itemView.findViewById(R.id.imageView_item1);
            linearLayout_item1 = itemView.findViewById(R.id.linearLayout_item1);
        }
    }

    public Adapter_chat(Context context) {
        this.context = context;
    }

    public void listdata(List<String> listdata) {
        this.listdata = listdata;
    }

    public void listname(List<String> listname) {
        this.listname = listname;

    }

}
