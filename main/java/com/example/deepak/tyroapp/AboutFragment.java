package com.example.deepak.tyroapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.deepak.tyroapp.MusicTabLayoutAdapter.MusicTabAdapter;

public class AboutFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    //For adding data in top songs fragment.


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_aboutfragment ,container,false);

/*
        tabLayout = v.findViewById(R.id.music_tablayout);
        viewPager = v.findViewById(R.id.music_viewpager_id);
        setUpViewPager();
        tabLayout.setupWithViewPager(viewPager);

  */      return v;
    }
/*
    private void setUpViewPager(){
        //Adding fragments
        MusicTabAdapter adapter = new MusicTabAdapter(getChildFragmentManager());
        adapter.addFragment(new TopSongsFragment(),"Top Songs");
        adapter.addFragment(new TopAlbumFragment(),"Top Albums");
        adapter.addFragment(new NewReleasesFragment(),"New Releases");

        //Setup the adapter to the view pager
        viewPager.setAdapter(adapter);
    }
*/

}
