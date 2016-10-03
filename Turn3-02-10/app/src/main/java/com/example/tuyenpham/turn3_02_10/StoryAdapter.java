package com.example.tuyenpham.turn3_02_10;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by Tuyen Pham on 02/10/2016.
 */

public class StoryAdapter extends ArrayAdapter<StoryItem> {
    public StoryAdapter(Context context, int resource, List<StoryItem> objects) {
        super(context, resource, objects);
    }
    @NonNull
    @Override
    public View getView(int posion , View convertView, ViewGroup parent){
        LayoutInflater layoutInflater =  LayoutInflater.from(this.getContext());
        if(convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item_story, parent, false);
        }
            new StoryViewHolder(convertView).setData(getItem(posion));
            return convertView;

    }
}
