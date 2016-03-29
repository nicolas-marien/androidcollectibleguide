package com.irit.androidcollectibleguide.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.irit.androidcollectibleguide.R;
import com.irit.androidcollectibleguide.bugdroids.APBugdroid;
import com.irit.androidcollectibleguide.bugdroids.AbstractBugdroid;
import com.irit.androidcollectibleguide.bugdroids.ChaserBugdroid;
import com.irit.androidcollectibleguide.utils.Utils;

import java.util.List;

/**
 * Created by Nicolas on 23/06/2014.
 */
public class DefaultGridViewAdapter extends BaseAdapter{

    private LayoutInflater mLayoutInflater;
    private String mTag;
    private List<AbstractBugdroid> mBugdroidList;

    public DefaultGridViewAdapter(String tag,LayoutInflater inflater) {
        mTag = tag;
        mLayoutInflater = inflater;
        mBugdroidList = Utils.getSeriesByTag(mTag);
    }

    @Override
    public int getCount() {
        return mBugdroidList.size();
    }

    @Override
    public Object getItem(int position) {
        return mBugdroidList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mBugdroidList.get(position).getID();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;
        if(convertView == null){
            view = mLayoutInflater.inflate(R.layout.default_grid_layout_item,parent,false);
        } else {
            view = convertView;
        }

        //LinearLayout gridItemContainer = (LinearLayout) view.findViewById(R.id.grid_item_container);
        TextView gridItemName = (TextView) view.findViewById(R.id.grid_item_name);
        ImageView gridItemPicture = (ImageView) view.findViewById(R.id.grid_item_picture);

        gridItemName.setText(mBugdroidList.get(position).getName());

        if (mBugdroidList.get(position) instanceof ChaserBugdroid) {
            gridItemPicture.setImageResource( ((ChaserBugdroid) mBugdroidList.get(position)).getChaserPicture() );
        } else if (mBugdroidList.get(position) instanceof APBugdroid) {
            gridItemPicture.setImageBitmap( ((APBugdroid) mBugdroidList.get(position)).getModifiedDisplayablePicture());
        } else {
            gridItemPicture.setImageResource(mBugdroidList.get(position).getSimplePicture());
        }
        return view;
    }
}
