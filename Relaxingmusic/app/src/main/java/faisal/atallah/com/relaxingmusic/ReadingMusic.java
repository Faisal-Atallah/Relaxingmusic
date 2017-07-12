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



public class ReadingMusic extends AppCompatActivity implements View.OnClickListener{

    Button bt1,bt2,bt3,bt4,bt5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_music);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        /************ Mobile ads ***************************************/


        MobileAds.initialize(getApplicationContext(), "ca-app-pub-1267284177738956/3202998021");


        AdView mAdView = (AdView) findViewById(R.id.adView_3);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        bt1 = (Button) findViewById(R.id.reading_music_one_button);
        bt1.setOnClickListener(this);


        bt2 = (Button) findViewById(R.id.reading_music_two_button);
        bt2.setOnClickListener(this);

        bt3 = (Button) findViewById(R.id.reading_music_three_button);

        bt3.setOnClickListener(this);

        bt4 = (Button) findViewById(R.id.reading_music_four_button);

        bt4.setOnClickListener(this);

        bt5 = (Button) findViewById(R.id.reading_music_five_button);

        bt5.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        // Perform action on click
        switch(v.getId()) {
            case R.id.reading_music_one_button:
                Intent i = new Intent(ReadingMusic.this, ReadinMusicOne.class);

                startActivity(i);


                break;
            case R.id.reading_music_two_button:

                Intent iA = new Intent(ReadingMusic.this, ReadingMusicTwo.class);

                startActivity(iA);
                break;

            case R.id.reading_music_three_button:
                Intent iB = new Intent(ReadingMusic.this, ReadingMusicThree.class);

                startActivity(iB);
                break;



            case R.id.reading_music_four_button:
                Intent iC = new Intent(ReadingMusic.this, ReadingMusicFour.class);

                startActivity(iC);
                break;


            case R.id.reading_music_five_button:

                Intent iD = new Intent(ReadingMusic.this, ReadingMusicFive.class);

                startActivity(iD);
                break;
        }

    }


}

/*
*
*
*
*
*  ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, songs){

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view =super.getView(position, convertView, parent);

                //textview of listview
                TextView textView=(TextView) view.findViewById(android.R.id.text1);

                ///get font



                //set font
                textView.setTypeface(custom_font);
                // set divider listView color
                listView.setDivider(new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, dividerColor));
                listView.setDividerHeight(1);


                // set textColor of listView
                textView.setTextColor(Color.WHITE);

                return view;
            }
        };


        //listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                                switch (position)

                                                {


                                                    case 0:
                                                        Intent i = new Intent(ReadingMusic.this, ReadinMusicOne.class);

                                                       startActivity(i);

                                                        break;


                                                    case 1:
                                                        Intent iA = new Intent(ReadingMusic.this, ReadingMusicTwo.class);

                                                         startActivity(iA);
                                                        break;

                                                    case 2:
                                                         Intent iB = new Intent(ReadingMusic.this, ReadingMusicThree.class);

                                                         startActivity(iB);
                                                        break;

                                                    case 3:
                                                        Intent iC = new Intent(ReadingMusic.this, ReadingMusicFour.class);

                                                        startActivity(iC);
                                                        break;

                                                    case 4:
                                                        Intent iD = new Intent(ReadingMusic.this, ReadingMusicFive.class);

                                                        startActivity(iD);


                                                        break;
                                                }
                                            }
                                        }
        );

*/