package com.irit.androidcollectibleguide.seriesfragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.irit.androidcollectibleguide.bugdroids.AbstractBugdroid;
import com.irit.androidcollectibleguide.utils.Utils;

import java.util.List;

/**
 * Created by Nicolas on 22/06/2014.
 */
public class DisplaySeriesGridFragment extends Fragment{

    private String TAG;
    private FragmentManager mFragmentManager;
    private List<AbstractBugdroid> mBugdroidList;

    public static DisplaySeriesGridFragment newInstance(String tag,FragmentManager manager) {
        DisplaySeriesGridFragment gridFragment = new DisplaySeriesGridFragment();
        gridFragment.mFragmentManager = manager;
        gridFragment.TAG = tag;
        gridFragment.mBugdroidList = Utils.getSeriesByTag(tag);
        return gridFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
