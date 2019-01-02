package com.example.sys.recycler_view1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerAdapter  extends RecyclerView.Adapter<RecyclerAdapter.ViewHolderClass> {
    Context context;
    int[] images1;
    int[] images;
    String[] arr;
    String[] arr1;
    String[] arr2;
    String[] arr3;
    String[] button;

    public RecyclerAdapter( Context MainActivity, int[] images,String[] arr,String[] button){
        context = MainActivity;
        this.images1 = images1;
        this.images = images;
        this.arr=arr;
        this.arr=arr1;
        this.arr=arr2;
        this.arr=arr3;
        this.button = button;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolderClass onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.recycle,viewGroup,false );
        ViewHolderClass viewHolderClass=new ViewHolderClass(view);
        return viewHolderClass;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolderClass viewHolderClass, int i) {
        viewHolderClass.textView.setText( arr[i] );
        viewHolderClass.textView1.setText( arr1[i] );
        viewHolderClass.textView2.setText( arr2[i] );
        viewHolderClass.textView3.setText( arr3[i] );
        viewHolderClass.button.setText( button[i] );
        viewHolderClass.imageView.setImageResource( images[i] );
        viewHolderClass.imageView.setImageResource( images1[i] );

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    class ViewHolderClass extends RecyclerView.ViewHolder {
        ImageView imageView;
        ImageView imageView1;
        TextView textView;
        TextView textView1;
        TextView textView2;
        TextView textView3;
        Button button;
        public ViewHolderClass(@NonNull View itemView) {
            super( itemView );
            imageView1 = itemView.findViewById(R.id.imageView);
            imageView = itemView.findViewById(R.id.img);
            textView=itemView.findViewById(R.id.txt);
            textView1=itemView.findViewById(R.id.textView);
            textView2=itemView.findViewById(R.id.textView1);
            textView3=itemView.findViewById(R.id.txtview);
            button=itemView.findViewById(R.id.btn);


        }
}
}