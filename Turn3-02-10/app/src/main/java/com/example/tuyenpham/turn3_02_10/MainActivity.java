package com.example.tuyenpham.turn3_02_10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.lv_story_menu)
    public ListView lvStoryMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setupUI();
    }

    private void setupUI() {
        lvStoryMenu.setAdapter(new StoryAdapter(
                this, R.layout.list_item_story,
                Arrays.asList(StoryItem.ARRAY)
        ));
    }
}
