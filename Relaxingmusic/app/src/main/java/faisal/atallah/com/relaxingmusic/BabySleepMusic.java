package faisal.atallah.com.relaxingmusic;

import android.content.Intent;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;



import android.widget.Button;



import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;




public class BabySleepMusic extends AppCompatActivity implements View.OnClickListener {



    Button bt1,bt2,bt3,bt4,bt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby_sleep_music);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bt1 = (Button) findViewById(R.id.baby_music_one_button);
        bt1.setOnClickListener(this);


        bt2 = (Button) findViewById(R.id.baby_music_two_button);
        bt2.setOnClickListener(this);

        bt3 = (Button) findViewById(R.id.baby_music_three_button);

        bt3.setOnClickListener(this);

        bt4 = (Button) findViewById(R.id.baby_music_four_button);

        bt4.setOnClickListener(this);

        bt5 = (Button) findViewById(R.id.baby_music_five_button);

        bt5.setOnClickListener(this);



        /*********************** Mobile ads ***************************************/

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-1267284177738956/2064342023");


        AdView mAdView = (AdView) findViewById(R.id.adView_2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }



    @Override
    public void onClick(View v) {
        // Perform action on click
        switch(v.getId()) {
            case R.id.baby_music_one_button:
                Intent i = new Intent(BabySleepMusic.this, BabyMusicOne.class);

                startActivity(i);

                break;
            case R.id.baby_music_two_button:
                Intent iA = new Intent(BabySleepMusic.this, BabyMusicTwo.class);

                startActivity(iA);

                break;

            case R.id.baby_music_three_button:
                Intent iB = new Intent(BabySleepMusic.this,BabyMusicThree.class);

                startActivity(iB);
                break;

            case R.id.baby_music_four_button:
                Intent iC = new Intent(BabySleepMusic.this, BabyMusicFour.class);

                startActivity(iC);
                break;


            case R.id.baby_music_five_button:
                Intent iD = new Intent(BabySleepMusic.this, BabyMusicFive.class);

                startActivity(iD);

                break;
        }

    }



}
