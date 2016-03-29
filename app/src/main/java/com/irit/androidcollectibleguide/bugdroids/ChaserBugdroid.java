package com.irit.androidcollectibleguide.bugdroids;

import com.irit.androidcollectibleguide.R;

import java.util.GregorianCalendar;

/**
 * Created by Nicolas on 18/06/2014.
 */
public class ChaserBugdroid extends AbstractBugdroid
{

    private final int mChaserPicture = R.drawable.android_chaser;

    public ChaserBugdroid(int mID, String mName, String mSeries, String mArtist,
                             String mDescription, GregorianCalendar mReleaseDate,float mWishedPrice,
                             int mSimplePicture,int mLargePicture) {

        super(mID, mName, mSeries, mArtist, mDescription, mReleaseDate,mWishedPrice, mSimplePicture, mLargePicture);
    }

    public int getChaserPicture() {
        return mChaserPicture;
    }
}
