package com.example.deepak.tyroapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class TopSongsFragment extends Fragment {

    List<MusicGetterSetter> listMusic;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_top_songs, container, false);

        listMusic = new ArrayList<>();

        listMusic.add(new MusicGetterSetter("Tareefan",R.drawable.tareefan));
        listMusic.add(new MusicGetterSetter("O Saathi",R.drawable.o_saathi));
        listMusic.add(new MusicGetterSetter("Buzz",R.drawable.buzz));
        listMusic.add(new MusicGetterSetter("Raat Kamaal Hai",R.drawable.raat_kamaal_hai));
        listMusic.add(new MusicGetterSetter("Bom Diggy Diggy",R.drawable.bom_diggy));
        listMusic.add(new MusicGetterSetter("Dil Chori",R.drawable.dil_chori));
        listMusic.add(new MusicGetterSetter("Dil Diyan Gallan",R.drawable.dil_diyaan_gallan));
        listMusic.add(new MusicGetterSetter("Tareefan",R.drawable.tareefan));
        listMusic.add(new MusicGetterSetter("O Saathi",R.drawable.o_saathi));
        listMusic.add(new MusicGetterSetter("Buzz",R.drawable.buzz));
        listMusic.add(new MusicGetterSetter("Raat Kamaal Hai",R.drawable.raat_kamaal_hai));
        listMusic.add(new MusicGetterSetter("Bom Diggy Diggy",R.drawable.bom_diggy));
        listMusic.add(new MusicGetterSetter("Dil Chori",R.drawable.dil_chori));
        listMusic.add(new MusicGetterSetter("Dil Diyan Gallan",R.drawable.dil_diyaan_gallan));

        //Setting the recycler view
        RecyclerView recyclerView = v.findViewById(R.id.topsong_recyclerview);
        MusicRecyclerView adapter = new MusicRecyclerView(getActivity(),listMusic);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),3));
        recyclerView.setAdapter(adapter);

        return v;
    }

}
