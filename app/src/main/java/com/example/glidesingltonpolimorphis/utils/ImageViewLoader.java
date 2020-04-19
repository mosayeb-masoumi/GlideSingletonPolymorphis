package com.example.glidesingltonpolimorphis.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.bumptech.glide.Glide;

public class ImageViewLoader extends AppCompatImageView {

    public ImageViewLoader(Context context) {
        super(context);
    }

    public ImageViewLoader(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void load(Context context,String url){
        Glide.with(context).load(url).into(this);
    }

    public void load(Context context, Bitmap bitmap){
        Glide.with(context).load(bitmap).into(this);
    }
    public void load(Context context, int drawable){
        Glide.with(context).load(drawable).into(this);
    }
}
