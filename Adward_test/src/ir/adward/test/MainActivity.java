package ir.adward.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import ir.adward.Adward;

public class MainActivity extends Activity 
{
    private String TAG = MainActivity.class.getName();
    private Activity activity;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		activity = this;
		
		//init Adward
		Adward.getInstance().init("11122233344455566677788899900000", getApplicationContext());
        Adward.getInstance().setTestMode(true);
        
        //show video ad
        Button bt_video = (Button)findViewById(R.id.bt_video);
        bt_video.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            	Adward.getInstance().showVideoAd(activity);
            }
        });

        //show interstitial ad
        Button bt_interstitial = (Button)findViewById(R.id.bt_interstitial);
        bt_interstitial.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            	Adward.getInstance().showInterstitialAd(activity);
            }
        });
	}
}