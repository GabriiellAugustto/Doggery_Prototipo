package com.example.doggery_prototipo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class HomeFragment extends Fragment {

    HomeFragment(){}



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ImageButton imageButton=(ImageButton) view.findViewById(R.id.btnpetsitter);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity().getApplicationContext(), PetsittersActivity.class));
            }
        });

        ImageButton imageButton2=(ImageButton) view.findViewById(R.id.btndogwalker);

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity().getApplicationContext(), DogwalkerActivity.class));
            }
        });


        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton imageButton3 = (ImageButton) view.findViewById(R.id.btnchat);

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity().getApplicationContext(), ChatActivity.class));
            }
        });


        return view;
    }
}