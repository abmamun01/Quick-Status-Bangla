package com.example.awesome_qoute_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.awesome_qoute_app.Adapter.RecyclerViewAdapter;
import com.example.awesome_qoute_app.RecyclerModel.RecyclerModel;

import java.util.ArrayList;
import java.util.List;

public class Quotes extends Fragment {

    RecyclerViewAdapter recyclerViewAdapter;
    RecyclerModel recyclerModel;
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_quotes, container, false);


        //Hooks

        recyclerView=view.findViewById(R.id.recyclerviewid);


        setRecyclerView();




        return view;
    }

    public void setRecyclerView(){

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));

        ArrayList<RecyclerModel> recyclerModelList=new ArrayList<>();

        recyclerModelList.add(new RecyclerModel(R.drawable.ic_menu_quote,R.drawable.ic_menu_quote,R.drawable.img2,"দুঃখগুলো মুছে দেবো সুরের মূর্ছনায়\n" +
                "সারাটি জনম রেখগো আমায়\n" +
                "তোমার মনের মন পিঞ্জারায় ।"));
        recyclerModelList.add(new RecyclerModel(R.drawable.ic_menu_quote,R.drawable.ic_menu_quote,R.drawable.img8,"আচ্ছা ,প্রেম আর ভালোবাসার মধ্যে পার্থক্যটা কি ?\n" +
                "কাউকে দেখে ভালোলাগা টা হলো প্রেম\n" +
                "আর তাকে ভুলতে না পারাটা হলো ভালোবাসা "));
        recyclerModelList.add(new RecyclerModel(R.drawable.ic_menu_quote,R.drawable.ic_menu_quote,R.drawable.img5,"অবশেষে তুমি আকাশের চাঁদ হয়েই রইলে\n" +
                "আর আমি ?\n" +
                "আমি কথিত সেই বামুন \n" +
                "চাঁদে হাত বাড়াতে বড়াবড়ই যার মানা । "));
        recyclerModelList.add(new RecyclerModel(R.drawable.ic_menu_quote,R.drawable.ic_menu_quote,R.drawable.img6,"না থাকতে চলে যাও ,\n" +
                "এসো না আর ফিরে ।\n" +
                "তোমায় নাহয় খুঁজে নেবো \n" +
                "মিথ্যে কল্পনার ভিড়ে ।"));
        recyclerModelList.add(new RecyclerModel(R.drawable.ic_menu_quote,R.drawable.ic_menu_quote,R.drawable.img2,"আবেগগুলো অসম্পূর্ণই থাক\n" +
                "কারণ আমি মধ্যবিত্ত । "));
        recyclerModelList.add(new RecyclerModel(R.drawable.ic_menu_quote,R.drawable.ic_menu_quote,R.drawable.img11,"হাজারো ভালোবাসার মাঝে \n" +
                "আমার টা হয়তো একটু ফিকে,\n" +
                "যদি সময় হয় তাকিও আমার দিকে ।"));
        recyclerModelList.add(new RecyclerModel(R.drawable.ic_menu_quote,R.drawable.ic_menu_quote,R.drawable.img12,"আচ্ছা ,প্রেম আর ভালোবাসার মধ্যে পার্থক্যটা কি ?\n" +
                "কাউকে দেখে ভালোলাগা টা হলো প্রেম\n" +
                "আর তাকে ভুলতে না পারাটা হলো ভালোবাসা "));


        recyclerViewAdapter=new RecyclerViewAdapter(getActivity().getApplicationContext(), recyclerModelList);
        recyclerView.setAdapter(recyclerViewAdapter);

    }

}