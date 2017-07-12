package faisal.atallah.com.relaxingmusic;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        setSupportActionBar(toolbar);


 /*********************** Mobile ads ***************************************/


        MobileAds.initialize(getApplicationContext(), "ca-app-pub-1267284177738956/1425213621");


        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        /**************** Circle menu ********************/

        CircleMenu circleMenu=(CircleMenu)findViewById(R.id.circle_menu);



        circleMenu.setMainMenu(Color.parseColor("#222222"), R.mipmap.menu_, R.mipmap.icon_cancel)



                .addSubMenu(Color.parseColor("#E8175D"), R.mipmap.person_sleep)

                .addSubMenu(Color.parseColor("#2F9599"), R.mipmap.person_work)

                .addSubMenu(Color.parseColor("#F46825"), R.mipmap.baby_sleep)

                .addSubMenu(Color.parseColor("#22a7f0"), R.mipmap.person_reading)

                .addSubMenu(Color.parseColor("#f1c40f"), R.mipmap.resting)


                /** activites  */

                .setOnMenuSelectedListener(new OnMenuSelectedListener(){

                    @Override
                    public void onMenuSelected(int index) {

                        switch(index){

                            case 0:

                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        Intent i=new Intent(MainActivity.this,SleepMusic.class);

                                        startActivity(i);
                                    }
                                }, 1000);



                                break;


                            case 1:


                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        Intent iA=new Intent(MainActivity.this,WorkMusic.class);

                                        startActivity(iA);
                                    }
                                }, 1000);


                                break;


                            case 2:


                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        Intent iB=new Intent(MainActivity.this,BabySleepMusic.class);

                                        startActivity(iB);
                                    }
                                }, 1000);



                                break;


                            case 3:

                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        Intent iC=new Intent(MainActivity.this,ReadingMusic.class);

                                        startActivity(iC);
                                    }
                                }, 1000);


                                break;
                            case 4:

                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        Intent iD=new Intent(MainActivity.this,RelaxationMusic.class);

                                        startActivity(iD);
                                    }
                                }, 1000);




                        }

                    }

                }).setOnMenuStatusChangeListener(new OnMenuStatusChangeListener() {

            @Override
            public void onMenuOpened() {



            }

            @Override
            public void onMenuClosed() {}

        });



    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        /*  SHARE BUTTON  **/

         if(id==R.id.action_share){





             try {
                 Context context = this;
                 Uri uri = Uri.parse("market://details?id=" + context.getPackageName());
                 Intent i = new Intent(Intent.ACTION_SEND);
                 i.setType("text/plain");
                 i.putExtra(Intent.EXTRA_SUBJECT, "RelaxingMusic");
                 String sAux = "\nThis is a great App, you should try it out\n\n";

                 sAux = sAux + "https://play.google.com/store/apps/details?id=" + context.getPackageName();

                 i.putExtra(Intent.EXTRA_TEXT, sAux);
                 startActivity(Intent.createChooser(i, "Share via"));
             } catch(Exception e) {
                 //e.toString();
             }

         }
         /*  RATE BUTTON */
        else if(id==R.id.action_rate){
            Context context = this;
            Uri uri = Uri.parse("market://details?id=" + context.getPackageName());
            Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
            // To count with Play market backstack, After pressing back button,
            // to taken back to our application, we need to add following flags to intent.
            goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                    Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                    Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
            try {
                startActivity(goToMarket);
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://play.google.com/store/apps/details?id=" + context.getPackageName())));
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
