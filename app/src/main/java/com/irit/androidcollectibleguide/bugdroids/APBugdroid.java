package com.irit.androidcollectibleguide.bugdroids;

import android.graphics.Bitmap;

import java.util.GregorianCalendar;

/**
 * Created by Nicolas on 18/06/2014.
 */
public class APBugdroid extends AbstractBugdroid
{
    private int mAPNumber;
    private Bitmap mModifiedDisplayablePicture;

    public APBugdroid(int mID, String mName, String mSeries, String mArtist, String mDescription,
                         GregorianCalendar mReleaseDate,float buyingPrice,float mWishedPrice, int mSimplePicture,
                         int mLargePicture) {
        super(mID, mName, mSeries, mArtist, mDescription, mReleaseDate,mWishedPrice, mSimplePicture, mLargePicture);
        mBuyingPrice = buyingPrice;
    }

    public int getAPNumber() {
        return mAPNumber;
    }

    public void setAPNumber(int APNumber) {
        mAPNumber = APNumber;
    }

    public Bitmap getModifiedDisplayablePicture() {
        return mModifiedDisplayablePicture;
    }

    public void setModifiedDisplayablePicture(Bitmap ModifiedDisplayablePicture) {
        mModifiedDisplayablePicture = ModifiedDisplayablePicture;
    }
}
