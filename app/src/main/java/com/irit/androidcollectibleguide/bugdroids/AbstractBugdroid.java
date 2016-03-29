package com.irit.androidcollectibleguide.bugdroids;

import java.util.GregorianCalendar;

/**
 * Created by Nicolas on 18/06/2014.
 */
public abstract class AbstractBugdroid
{
    protected int mID;
    protected String mName;
    protected String mTag;
    protected String mArtist;
    protected String mDescription;
    protected GregorianCalendar mReleaseDate;
    protected float mBuyingPrice;
    protected float mWishedPrice;
    protected int mQuantity;
    protected int mSimplePicture;
    protected int mLargePicture;

    public AbstractBugdroid(int mID, String mName, String mTag,
                               String mArtist, String mDescription,
                               GregorianCalendar mReleaseDate, float mWishedPrice,
                               int mSimplePicture, int mLargePicture) {
        this.mID = mID;
        this.mName = mName;
        this.mTag = mTag;
        this.mArtist = mArtist;
        this.mDescription = mDescription;
        this.mReleaseDate = mReleaseDate;
        this.mBuyingPrice = 7.5f;
        this.mWishedPrice = mWishedPrice;
        this.mQuantity = 0;
        this.mSimplePicture = mSimplePicture;
        this.mLargePicture = mLargePicture;
    }

    public int getID() {
        return mID;
    }

    public void setID(int id) {
        this.mID = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getTag() {
        return mTag;
    }

    public void setTag(String tag) {
        this.mTag = tag;
    }

    public String getArtist() {
        return mArtist;
    }

    public void setArtist(String artist) {
        this.mArtist = artist;
    }

    public GregorianCalendar getReleaseDate() {
        return mReleaseDate;
    }

    public void setReleaseDate(GregorianCalendar releaseDate) {
        this.mReleaseDate = releaseDate;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public float getBuyingPrice() {
        return mBuyingPrice;
    }

    public void setBuyingPrice(float buyingPrice) {
        this.mBuyingPrice = buyingPrice;
    }

    public float getWishedPrice() {
        return mWishedPrice;
    }

    public void setWishedPrice(float wishedPrice) {
        this.mWishedPrice = wishedPrice;
    }

    public int getQuantity() {
        return mQuantity;
    }

    public void setQuantity(int quantity) {
        this.mQuantity = quantity;
    }

    public int getSimplePicture() {
        return mSimplePicture;
    }

    public void setSimplePicture(int simplePicture) {
        this.mSimplePicture = simplePicture;
    }

    public int getLargePicture() {
        return mLargePicture;
    }

    public void setLargePicture(int largePicture) {
        this.mLargePicture = largePicture;
    }
}