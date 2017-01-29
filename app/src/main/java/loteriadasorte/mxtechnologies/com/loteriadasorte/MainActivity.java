package loteriadasorte.mxtechnologies.com.loteriadasorte;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.unity3d.ads.android.IUnityAdsListener;
import com.unity3d.ads.android.UnityAds;

public class MainActivity extends AppCompatActivity {
    //InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        UnityAds.init(this, "1074691", new UnityAdsListener());


        //mInterstitialAd = new InterstitialAd(this);
        //mInterstitialAd.setAdUnitId("ca-app-pub-6303877676651382/6798505355");

        //mInterstitialAd.setAdListener(new AdListener() {
            //@Override
            //public void onAdClosed() {
                //requestNewInterstitial();
            //}
        //});
        //requestNewInterstitial();

        ImageButton megasena = (ImageButton) findViewById(R.id.imageButton);
        megasena.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(v.getContext(), MegaSena.class);
                        startActivity(i);
                        //if (mInterstitialAd.isLoaded()) {
                            //mInterstitialAd.show();
                        //}
                        if ( UnityAds.canShow() )
                        {
                            UnityAds.show();
                        }
                    }
                });
        ImageButton quina = (ImageButton) findViewById(R.id.imageButton2);
        quina.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        Intent i = new Intent(v.getContext(),Quina.class);
                        startActivity(i);
                        //if (mInterstitialAd.isLoaded()) {
                        //mInterstitialAd.show();
                        //}
                        if ( UnityAds.canShow() )
                        {
                            UnityAds.show();
                        }
                    }
                });
        ImageButton lotofacil = (ImageButton) findViewById(R.id.imageButton3);
        lotofacil.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        Intent i = new Intent(v.getContext(),LotoFacil.class);
                        startActivity(i);
                        //if (mInterstitialAd.isLoaded()) {
                        //mInterstitialAd.show();
                        //}
                        if ( UnityAds.canShow() )
                        {
                            UnityAds.show();
                        }
                    }
                });
        ImageButton lotomania = (ImageButton) findViewById(R.id.imageButton4);
        lotomania.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        Intent i = new Intent(v.getContext(),LotoMania.class);
                        startActivity(i);
                        //if (mInterstitialAd.isLoaded()) {
                        //mInterstitialAd.show();
                        //}
                        if ( UnityAds.canShow() )
                        {
                            UnityAds.show();
                        }
                    }
                });
        ImageButton duplasena = (ImageButton) findViewById(R.id.imageButton5);
        duplasena.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        Intent i = new Intent(v.getContext(),DuplaSena.class);
                        startActivity(i);
                        //if (mInterstitialAd.isLoaded()) {
                        //mInterstitialAd.show();
                        //}
                        if ( UnityAds.canShow() )
                        {
                            UnityAds.show();
                        }
                    }
                });
    }

    //private void requestNewInterstitial() {
      //  AdRequest adRequest = new AdRequest.Builder().build();
        //mInterstitialAd.loadAd(adRequest);
    //}

    @Override
    public void onResume()
    {
        super.onResume();
        UnityAds.changeActivity(this);
    }
}
class UnityAdsListener implements IUnityAdsListener {

    @Override
    public void onHide() {

    }

    @Override
    public void onShow() {

    }

    @Override
    public void onVideoStarted() {

    }

    @Override
    public void onVideoCompleted(String s, boolean b) {

    }

    @Override
    public void onFetchCompleted() {
        if(UnityAds.canShow()) {
            UnityAds.show();
        }
    }

    @Override
    public void onFetchFailed() {

    }
}

