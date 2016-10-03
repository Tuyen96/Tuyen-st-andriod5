package com.example.tuyenpham.turn1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
@BindView(R.id.view_compound)
    ViewCompound viewCompound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
       // updateUI();
    }

//    private void updateUI() {
//    viewCompound.setTvProgess(0);
//    }
}
