package com.example.user.multiplebutton;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
private ImageView imageView;
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imageView=(ImageView) findViewById(R.id.imageId);
        textView=(TextView) findViewById(R.id.textId);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){

            String place=bundle.getString("name");
            showDetails(place);
        }
    }

    void showDetails(String place){
        if(place.equals("comilla")){
            //imageView.setImageResource(R.drawable.comillla);
            textView.setText(R.string.comilla_text);
            Resources res = getResources(); /** from an Activity */
            imageView.setImageDrawable(res.getDrawable(R.drawable.comillla));

        }
        if(place .equals("bard")){
            imageView.setImageResource(R.drawable.bard);
            textView.setText(R.string.bard_text);

        }
        if(place .equals("moynamoti")){
            imageView.setImageResource(R.drawable.moynamoti);
            textView.setText(R.string.moinamoti_text);

        }
        if(place .equals("lalmoy")){
            imageView.setImageResource(R.drawable.lalmoy);
            textView.setText(R.string.lalmoy_text);
        }
    }
}
