package com.example.expendablerecyclerviewstatic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ExpandableAdapter extends RecyclerView.Adapter<ExpandableAdapter.MyViewHolder> {
   private List<ExpendModel> mylist;
   private Context context;

   private  static int currentPosition=0;

    public ExpandableAdapter(List<ExpendModel> mylist, Context context) {
        this.mylist = mylist;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.expendable_item, parent, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        ExpendModel expendModel=mylist.get(position);
        holder.title.setText(expendModel.getTitle());
        holder.chail_1.setText(expendModel.getChail_1());
        holder.chaid_2.setText(expendModel.getChaid_2());

        Glide.with(context).load(expendModel.getImage()).into(holder.image);
        holder.linearLayout.setVisibility(View.GONE);


        //if the position is equals to the item position which is to be expanded
        if (currentPosition == position) {
            //creating an animation
            Animation slideDown = AnimationUtils.loadAnimation(context, R.anim.slide_down);

            //toggling visibility
            holder.linearLayout.setVisibility(View.VISIBLE);

            //adding sliding effect
            holder.linearLayout.startAnimation(slideDown);
        }

        holder.title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //getting the position of the item to expand it
                currentPosition = position;

                //reloding the list
                notifyDataSetChanged();
            }
        });


    }

    @Override
    public int getItemCount() {
        return mylist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title,chail_1,chaid_2;
        ImageView image;
        LinearLayout linearLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title=itemView.findViewById(R.id.title_name_id);
            chail_1=itemView.findViewById(R.id.chaid_text1);
            chaid_2=itemView.findViewById(R.id.chaid_text2);
            image=itemView.findViewById(R.id.image_id);
            linearLayout=itemView.findViewById(R.id.linerlayout_id);


        }
    }
}
