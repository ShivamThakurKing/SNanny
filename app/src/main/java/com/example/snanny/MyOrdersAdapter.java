package com.example.snanny;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyOrdersAdapter extends RecyclerView.Adapter<HorizontalPersonOrderAdapter.OrderViewHolder> {



    @NonNull
    @Override
    public HorizontalPersonOrderAdapter.OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalPersonOrderAdapter.OrderViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    //MAKING THE VIEWHOLDER CLASS FOR THE MYORDERS
    class MyOderViewHolder extends RecyclerView.ViewHolder{
        ImageView profileimageview,foodimageview;
        TextView nameofperson,locationofperson,nameoffood,timeofdelivery;
        Button confirmOrder,cancelOrder;
        RatingBar ratingBarfood;

        public MyOderViewHolder(@NonNull View itemView) {
            super(itemView);
            findIds();

        }

        private void findIds() {

            profileimageview = itemView.findViewById(R.id.imageviewperson);
            foodimageview = itemView.findViewById(R.id.productimageview);
            nameofperson = itemView.findViewById(R.id.nametextview);
            locationofperson = itemView.findViewById(R.id.locationtextview);
            nameoffood = itemView.findViewById(R.id.foodnametextview);
            timeofdelivery = itemView.findViewById(R.id.deliverymonthtextview);
            confirmOrder = itemView.findViewById(R.id.confirmbutton);
            cancelOrder = itemView.findViewById(R.id.cancelorderbutton);
            ratingBarfood = itemView.findViewById(R.id.personratingbar);


        }
    }
}
