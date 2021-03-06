package com.pinca.clarisse;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = new Intent(this, MyCustomService.class);
        startService(i);
    }

    public void process (View v) {
        Intent i = null, chooser = null;

        if(v.getId() == R.id.activity1) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);

        }else if(v.getId() == R.id.btnmap1) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.623808,121.0024458,19z"));
            chooser = Intent.createChooser(i,"Choose your map app:");
            startActivity(chooser);
        }
    }
}
