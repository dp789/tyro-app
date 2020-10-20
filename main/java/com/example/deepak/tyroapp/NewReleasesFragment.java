package com.example.deepak.tyroapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewReleasesFragment extends Fragment {


    List<MusicGetterSetter> listNewRelease;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_new_releases, container, false);


        listNewRelease = new ArrayList<>();

        listNewRelease.add(new MusicGetterSetter("Tareefan",R.drawable.tareefan));
        listNewRelease.add(new MusicGetterSetter("O Saathi",R.drawable.o_saathi));
        listNewRelease.add(new MusicGetterSetter("Buzz",R.drawable.buzz));
        listNewRelease.add(new MusicGetterSetter("Raat Kamaal Hai",R.drawable.raat_kamaal_hai));
        listNewRelease.add(new MusicGetterSetter("Bom Diggy Diggy",R.drawable.bom_diggy));
        listNewRelease.add(new MusicGetterSetter("Dil Chori",R.drawable.dil_chori));
        listNewRelease.add(new MusicGetterSetter("Dil Diyan Gallan",R.drawable.dil_diyaan_gallan));
        listNewRelease.add(new MusicGetterSetter("Tareefan",R.drawable.tareefan));
        listNewRelease.add(new MusicGetterSetter("O Saathi",R.drawable.o_saathi));
        listNewRelease.add(new MusicGetterSetter("Buzz",R.drawable.buzz));
        listNewRelease.add(new MusicGetterSetter("Raat Kamaal Hai",R.drawable.raat_kamaal_hai));
        listNewRelease.add(new MusicGetterSetter("Bom Diggy Diggy",R.drawable.bom_diggy));
        listNewRelease.add(new MusicGetterSetter("Dil Chori",R.drawable.dil_chori));
        listNewRelease.add(new MusicGetterSetter("Dil Diyan Gallan",R.drawable.dil_diyaan_gallan));

        //Setting the recycler view
        RecyclerView recyclerView = v.findViewById(R.id.newrelease_recyclerview);
        MusicRecyclerView adapter = new MusicRecyclerView(getActivity(),listNewRelease);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(4,1));
        recyclerView.setAdapter(adapter);
        return v;
    }

}
