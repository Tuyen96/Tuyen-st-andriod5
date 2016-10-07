package com.example.tuyenpham.turn01_05_10;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.lv_opition)
    ListView lvOpition;
//    @BindView(R.id.imageView)
//    ImageView imageView;
    private static final String ARRAY[] = new String[]{
        "07.02", "08.02", "08.05 ", "09.01", "09.02"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        addListeners();
        setupUI();
    }

    private void openFragment(Fragment fragment, boolean addToBackStack) {
        if(addToBackStack){
            getSupportFragmentManager().beginTransaction().replace(R.id.activity_main, fragment).addToBackStack(null).commit();
        }
        else  getSupportFragmentManager().beginTransaction().replace(R.id.activity_main, fragment).commit();
    }

    private void addListeners() {
        lvOpition.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0 :{
                        openFragment( new InFragment(), true);
                        break;
                    }
                    case 1 : {
                        openFragment(new BFragment(), true);
                        break;
                    }
                    case 2: {
                        openFragment(new CFragment(), true);
                        break;
                    }
                    case 3:{
                        openFragment(new DFragment(), true);
                        break;
                    }
                    case 4:{
                        openFragment(new EFragment(), true);
                        break;
                    }
                }
            }
        });
    }
    private void setupUI() {
      lvOpition.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Arrays.asList(ARRAY)));
    }
}
