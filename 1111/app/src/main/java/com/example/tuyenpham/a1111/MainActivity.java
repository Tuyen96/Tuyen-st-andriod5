package com.example.tuyenpham.a1111;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.imv1)
    ImageView imv1;
    @BindView(R.id.imv2) ImageView imv2;
    @BindView(R.id.imv3) ImageView imv3;
    @BindView(R.id.imv4) ImageView imv4;
    @BindView(R.id.imv5) ImageView imv5;
    @BindView(R.id.imv6) ImageView imv6;
    @BindView(R.id.imv7) ImageView imv7;
    @BindView(R.id.imv8) ImageView imv8;
    @BindView(R.id.imv9) ImageView imv9;
    @BindView(R.id.imv10) ImageView imv10;
    @BindView(R.id.imv11) ImageView imv11;
    @BindView(R.id.imv12) ImageView imv12;
    @BindView(R.id.imv13) ImageView imv13;
    @BindView(R.id.imv15) ImageView imv15;
    @BindView(R.id.imv16) ImageView imv16;
   // @BindView(R.id.imv111) ImageView imv111;
   // @BindView(R.id.imv1112) ImageView imv1112;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setupUI();
    }

    private void setupUI() {
//        imv2.setImageResource(R.drawable.bitmap1);
//        imv3.setImageResource(R.drawable.bitmap4);
//        imv4.setImageResource(R.drawable.bitmap3);
//        imv5.setImageResource(R.drawable.bitmap6);
//        imv6.setImageResource(R.drawable.bitmap11);
//        imv7.setImageResource(R.drawable.bitmap2);
//        imv8.setImageResource(R.drawable.bitmap8);
//        imv9.setImageResource(R.drawable.bitmap7);
//        imv10.setImageResource(R.drawable.bitmap10);
//        imv11.setImageResource(R.drawable.bitmap12);
//      //  imv111.setImageResource(R.drawable.bitmap7);
//       // imv1112.setImageResource(R.drawable.bitmap3);
//        imv1.setImageResource(R.drawable.ovalavatar);
//        imv12.setImageResource(R.drawable.playicongroup);
//        imv13.setImageResource(R.drawable.musicnote);
//        imv15.setImageResource(R.drawable.ten);
//        imv16.setImageResource(R.drawable.tim);
    }


}
