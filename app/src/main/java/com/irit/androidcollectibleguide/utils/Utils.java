package com.irit.androidcollectibleguide.utils;

import com.irit.androidcollectibleguide.MainActivity;
import com.irit.androidcollectibleguide.bugdroids.AbstractBugdroid;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicolas on 22/06/2014.
 */
public class Utils {

    public static List<AbstractBugdroid> getSeriesByTag(String tag) {
        List<AbstractBugdroid> allBugdroids = MainActivity.mBugdroidContainer.getBugdroids();
        ArrayList<AbstractBugdroid> resultSet = new ArrayList<AbstractBugdroid>();
        for(AbstractBugdroid bugdroid:allBugdroids) {
            if(bugdroid.getTag().compareTo(tag) == 0) {
                resultSet.add(bugdroid);
            }
        }
        return resultSet;
    }
}
