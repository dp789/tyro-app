package com.example.deepak.tyroapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.deepak.tyroapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class result_fragment extends Fragment {


    public result_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container ,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate ( R.layout.fragment_result_fragment , container , false );
    }

}
