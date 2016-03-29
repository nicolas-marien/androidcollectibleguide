package com.irit.androidcollectibleguide.bugdroids;

import java.util.GregorianCalendar;

/**
 * Created by Nicolas on 18/06/2014.
 */
public class SeriesBugdroid extends AbstractBugdroid
{

    private String mRatio;

    public SeriesBugdroid(int mID, String mName, String mSeries, String mArtist,
                             String mDescription, GregorianCalendar mReleaseDate,
                             float mWishedPrice, int mSimplePicture,int mLargePicture,String ratio) {

        super(mID, mName, mSeries, mArtist, mDescription, mReleaseDate,mWishedPrice, mSimplePicture, mLargePicture);
        mRatio = ratio;
    }
}
