package com.example.tuyenpham.turn2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getReferences();
        addListeners();
    }

    private void addListeners() {
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager =  getSupportFragmentManager();
                AddFragment dress = new AddFragment();
                dress.show(fragmentManager, "fragment_name");
            }
        });
    }
    private void getReferences() {
        bt = (Button) findViewById(R.id.bt_add);
    }
}
