package com.example.admin.facebook_interstitial_ads;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;

public class MyActivity extends Activity implements InterstitialAdListener {

     InterstitialAd interstitialAd;
     final String INTERSTITIAL_PLACEMENT_ID = "866948270010384_870642566307621";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        loadInterstitialAd();
        setContentView(R.layout.activity_my);
        Log.d("Facebook Interstitial_ads","I am in onCreate");
    }
    private void loadInterstitialAd()
    {
        interstitialAd = new InterstitialAd(this, INTERSTITIAL_PLACEMENT_ID);
        interstitialAd.setAdListener(MyActivity.this);
        AdSettings.addTestDevice("6b28461284353451629091633feab652");
        interstitialAd.loadAd();
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d("Facebook Interstitial_ads","I am in onRestart");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("Facebook Interstitial_ads","I am in onStart");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("Facebook Interstitial_ads","I am in onStop");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("Facebook Interstitial_ads","I am in onPause");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("Facebook Interstitial_ads","I am in onResume");
    }

    @Override
    public void onInterstitialDisplayed(Ad ad) {

    }

    @Override
    public void onInterstitialDismissed(Ad ad) {

        interstitialAd.destroy();
        interstitialAd = null;
    }

    @Override
    public void onError(Ad ad, AdError adError) {


    }

    @Override
    public void onAdLoaded(Ad ad) {

        interstitialAd.show();
    }

    @Override
    public void onAdClicked(Ad ad) {
    }

    @Override
    protected void onDestroy()
    {
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        super.onDestroy();
        Log.d("Facebook Interstitial_ads","I am in onDestroy");

    }
}
