package com.future.utspmopro;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {

    Button bHP, bSsmd, bLks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        bHP = (Button) findViewById(R.id.bHP);
        bSsmd = (Button) findViewById(R.id.bSsmd);
        bLks = (Button) findViewById(R.id.bLks);

        bHP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:089609214064"));
                startActivity(intent);
            }
        });

        bSsmd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://www.instagram.com/invites/contact/?i=kyaf18it8yvg&utm_content=62c0n4n"));
                startActivity(intent);
            }
        });

        bLks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://goo.gl/maps/1cQ6gppsMdrMyQN37"));
                startActivity(intent);
            }
        });
    }
}
