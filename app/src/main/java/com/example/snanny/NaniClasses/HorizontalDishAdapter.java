package com.example.snanny.NaniClasses;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.snanny.R;

import java.util.List;

public class HorizontalDishAdapter extends RecyclerView.Adapter<HorizontalDishAdapter.HorizontalViewHolder> {
    //VARIABLES OF THE CLASS
    Context context;
    List<FoodDetailsModel> personListWithFood;
    LayoutInflater minflater ;

    onClickOnFood clickOnFood;

    public HorizontalDishAdapter(Context context, List<FoodDetailsModel> personListWithFood,onClickOnFood onClickOnFood) {
        this.context = context;
        this.personListWithFood = personListWithFood;
        this.clickOnFood = onClickOnFood;
    }

    @NonNull
    @Override
    public HorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.recyler_view_items,parent,false);
        return new HorizontalViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalViewHolder holder, int position) {
        Log.d("abcde",personListWithFood.get(position).comments);
        holder.profileimageview.setImageResource(personListWithFood.get(position).personimage);
        holder.nameofperson.setText(personListWithFood.get(position).name);
        holder.locationofperson.setText(personListWithFood.get(position).Location);
        holder.ratingBarfood.setRating(personListWithFood.get(position).stars);
        holder.foodimageview.setImageResource(personListWithFood.get(position).foodimage);
        holder.nameoffood.setText(personListWithFood.get(position).foodName);
        holder.timeofdelivery.setText(personListWithFood.get(position).deliverydate);
        holder.commentsonfood.setText(personListWithFood.get(position).comments);
        holder.paymentmethod.setText(personListWithFood.get(position).deliveryTime);
    }

    @Override
    public int getItemCount() {
        return personListWithFood.size();
    }

    //CREATING A VIEW HOLDER CLASS THAT TELLS US ABOUT DIFFERENT VIEWS THAT ARE PRESENT INSIDE THE CLASS
    public class HorizontalViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        //VARIABLES OF THE CLASS
        ImageView profileimageview,foodimageview;
        TextView nameofperson,locationofperson,nameoffood,timeofdelivery,commentsonfood,paymentmethod;
        RatingBar ratingBarfood;
        public HorizontalViewHolder(@NonNull View itemView) {
            super(itemView);
            findids(itemView);
            foodimageview.setOnClickListener(this);
            foodimageview.setClipToOutline(true);

        }
        private void findids(View itemView) {
            //FINDING THE ID'S OF ALL VIEWS
            profileimageview = itemView.findViewById(R.id.imageviewperson);
            foodimageview = itemView.findViewById(R.id.productimageview1);
            nameofperson = itemView.findViewById(R.id.nametextview);
            locationofperson = itemView.findViewById(R.id.locationtextview);
            nameoffood = itemView.findViewById(R.id.foodnametextview);
            timeofdelivery = itemView.findViewById(R.id.deliverymonthtextview);
            commentsonfood = itemView.findViewById(R.id.foodreviewtextview);
            paymentmethod = itemView.findViewById(R.id.deliverytimetextview);
            ratingBarfood = itemView.findViewById(R.id.personratingbar);
        }

        @Override
        public void onClick(View view) {
            int id = view.getId();
            switch (id){
                case R.id.productimageview1:
                    Toast.makeText(itemView.getContext(), "Position is"+getAdapterPosition(), Toast.LENGTH_SHORT).show();
                    clickOnFood.foodItem(getAdapterPosition());

            }
        }
    }
    public interface onClickOnFood{
        void foodItem(int position);
    }
}
