package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvHello_world;
    Button btm1;
    ImageView iv_cat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btm1 = findViewById(R.id.btm1);
        final TextView tvHello_world = findViewById(R.id.tvHello_world);

        btm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvHello_world.setText(getResources().getString(R.string.after_click_btm1));
                Log.v("MainActivity","click button");
            }
        });
        TextView tv_username = findViewById(R.id.tv_username);
        TextView tv_password = findViewById(R.id.tv_password);

        Switch switch1 =(Switch)findViewById(R.id.switch1);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    //Toast.makeText(getContext(),"on1",Toast.LENGTH_SHORT).show();
                } else {
                    //Toast.makeText(getContext(),"off1",Toast.LENGTH_SHORT).show();
                }
            }
        });

        ImageView imageView_cat = (ImageView) findViewById(R.id.imageView_cat);


    }


}
