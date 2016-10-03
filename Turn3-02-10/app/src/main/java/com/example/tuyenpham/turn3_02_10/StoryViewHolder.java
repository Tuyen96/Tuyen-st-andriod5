package com.example.tuyenpham.turn3_02_10;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Tuyen Pham on 02/10/2016.
 */

public class StoryViewHolder {
    @BindView(R.id.iv_image)
    public ImageView ivImage;
    @BindView(R.id.tv_time)
    public TextView tvTime;
    @BindView(R.id.tv_title)
    public TextView tvTitle;
    public StoryViewHolder(View rootView){
        ButterKnife.bind(this, rootView);
    }
    public void setData(StoryItem storyItem){
        tvTime.setText(storyItem.getTime());
        tvTitle.setText(storyItem.getTitle());
        ivImage.setImageResource(storyItem.getImageResId());
    }
}
