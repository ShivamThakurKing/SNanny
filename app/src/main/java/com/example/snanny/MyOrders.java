package com.example.snanny;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MyOrders extends Fragment {
    // VARIABLES OF THE CLASS
    RecyclerView  myorder;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.my_orders,container,false);
        //GETTING THE ID OF RECYCLERVIEW AND ADDING THE LAYOUT MANAGER AND ADAPTER
        myorder = v.findViewById(R.id.recyclerviewmyorder);
        myorder.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));

        return v;
    }
}
