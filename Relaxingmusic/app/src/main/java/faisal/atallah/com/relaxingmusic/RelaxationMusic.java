package faisal.atallah.com.relaxingmusic;

import android.content.Intent;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import android.widget.AdapterView;

import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class RelaxationMusic extends AppCompatActivity implements View.OnClickListener{



    Button bt1,bt2,bt3,bt4,bt5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relaxation_music);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);






        /*********************** Mobile ads ***************************************/


        MobileAds.initialize(getApplicationContext(), "ca-app-pub-1267284177738956/7493596826");


        AdView mAdView = (AdView) findViewById(R.id.adView_4);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        bt1 = (Button) findViewById(R.id.relaxation_music_one_button);
        bt1.setOnClickListener(this);


        bt2 = (Button) findViewById(R.id.relaxation_music_two_button);
        bt2.setOnClickListener(this);

        bt3 = (Button) findViewById(R.id.relaxation_music_three_button);

        bt3.setOnClickListener(this);

        bt4 = (Button) findViewById(R.id.relaxation_music_four_button);

        bt4.setOnClickListener(this);

        bt5 = (Button) findViewById(R.id.relaxation_music_five_button);

        bt5.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {
        // Perform action on click
        switch(v.getId()) {
            case R.id.relaxation_music_one_button:
                Intent i = new Intent(RelaxationMusic.this,RelaxationMusicOne.class);

                startActivity(i);

                break;
            case R.id.relaxation_music_two_button:

                Intent iA = new Intent(RelaxationMusic.this, RelaxationMusicTwo.class);

                startActivity(iA);
                break;



            case R.id.relaxation_music_three_button:
                Intent iB = new Intent(RelaxationMusic.this, RelaxationMusicThree.class);

                startActivity(iB);

                break;

            case R.id.relaxation_music_four_button:
                Intent iC = new Intent(RelaxationMusic.this,RelaxationMusicFour.class);

                startActivity(iC);
                break;


            case R.id.relaxation_music_five_button:

                Intent iD = new Intent(RelaxationMusic.this, RelaxationMusicFive.class);

                startActivity(iD);

                break;
        }

    }
}
