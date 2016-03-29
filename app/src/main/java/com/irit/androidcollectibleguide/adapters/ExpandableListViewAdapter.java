package com.irit.androidcollectibleguide.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.irit.androidcollectibleguide.R;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Nicolas on 22/06/2014.
 */
public class ExpandableListViewAdapter extends BaseExpandableListAdapter {

    private HashMap<String,List<String>> mListDataChild;
    private String mDataHeader;
    private LayoutInflater mInflater;

    public ExpandableListViewAdapter(LayoutInflater inflater,String header,HashMap<String,List<String>> childs) {
        mInflater = inflater;
        mDataHeader = header;
        mListDataChild = childs;
    }
    @Override
    public int getGroupCount() {
        return 1;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return mListDataChild.get(mDataHeader).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return mDataHeader;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return mListDataChild.get(mDataHeader).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        View headerView = (LinearLayout) mInflater.inflate(R.layout.expandable_list_header,null);
        TextView text = (TextView) headerView.findViewById(R.id.expandable_list_header);
        text.setText(mDataHeader);
        return headerView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        View childView = (LinearLayout) mInflater.inflate(R.layout.expandable_list_child,null);
        String childTitle = mListDataChild.get(mDataHeader).get(childPosition);
        TextView text = (TextView) childView.findViewById(R.id.expandable_list_child);
        text.setText(childTitle);
        return childView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
