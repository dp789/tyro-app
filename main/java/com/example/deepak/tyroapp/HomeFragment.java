package com.example.deepak.tyroapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment implements View.OnClickListener{
    private CardView cardView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater , @Nullable ViewGroup container , @Nullable Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );


        View v = inflater.inflate ( R.layout.activity_home_fragment , container , false );
        cardView = (CardView) v.findViewById ( R.id.card_zest );
        cardView.setOnClickListener ( this );
        return v;


    }

    @Override
    public void onClick(View view) {
        zestActivity();

    }

    private void zestActivity()
    {
        Intent intent =new Intent ( getActivity (), zest.class );
        startActivity ( intent );
    }
}
