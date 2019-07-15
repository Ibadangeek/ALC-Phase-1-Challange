package com.work.tope.alcphase1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button button_alc;
    Button button_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button_alc = (Button) findViewById(R.id.button_alc);
        button_alc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openaboutAlc();
            }
        });

        button_profile = (Button) findViewById(R.id.button_profile);
        button_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMyProfile();
            }
        });

    }
    private void openaboutAlc() {
    Intent intent = new Intent (this, aboutAlc.class);
    startActivity(intent);
    }


    private void openMyProfile() {
        Intent intent = new Intent (this, MyProfile.class);
        startActivity(intent);
    }


}
