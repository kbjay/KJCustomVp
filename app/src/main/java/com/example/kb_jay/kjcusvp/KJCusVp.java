package com.example.kb_jay.kjcusvp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;

public class KJCusVp extends ViewPager {
    public KJCusVp(@NonNull Context context) {
        super(context);
    }

    public KJCusVp(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    public static class KJTransformer implements PageTransformer {

        private static final float SCALE = 0.8f;//表示放缩的倍数
        private static final int TRANS=50;//表示平移的px数

        @Override
        public void transformPage(@NonNull View view, float position) {
            float temp=Math.abs(position);
            float scale = (1-(1- SCALE)*temp);
            view.setScaleX(scale);
            view.setScaleY(scale);

            view.setTranslationX(-TRANS*position);

        }
    }
}
