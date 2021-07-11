package com.android.animationbasic;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.animationbasic.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ImageView me;
    private ImageView didi;
    private boolean pic1 = true;

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        me=binding.firstImage;
        didi=binding.secondImage;
    }
    public void onClickMe(View v){
        if(pic1){
            pic1=false;
            fade(me,didi);
        }
        else{
            pic1=true;
            fade(didi,me);
        }
    }
    private void fade(ImageView i1,ImageView i2){
        i1.animate().alpha(0).setDuration(1500);
        i2.animate().alpha(1).setDuration(1500);
    }
}