package com.example.a.recycler6;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    String data1[],data2[];
    Context ctx;
    int[] img;
    public Adapter(Context ct, String[] s1, String[] s2, int[] images)
    {
         ctx=ct;
         data1=s1;
         data2=s2;
         img=images;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(ctx);
        View v=inflater.inflate(R.layout.row_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tv1.setText(data1[position]);
        holder.tv2.setText(data2[position]);
        holder.im.setImageResource(img[position]);

    }

    @Override
    public int getItemCount() {

        return img.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView im;
        TextView tv1,tv2;
        public ViewHolder(View itemView) {
            super(itemView);
            im=itemView.findViewById(R.id.image1);
            tv1=itemView.findViewById(R.id.text1);
            tv2=itemView.findViewById(R.id.text3);
        }
    }
}
