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

        private static final float MIN_SCALE = 0.5f;

        @Override
        public void transformPage(@NonNull View view, float position) {
            int pageWidth = view.getWidth();

            float temp=Math.abs(position);

            float scale = (float) (1-0.2*temp);

            view.setScaleX(scale);
            view.setScaleY(scale);
            view.setTranslationX(-50*position);
//            if (position < -1) { // [-Infinity,-1)
//                // This page is way off-screen to the left.
//                view.setAlpha(0);
//
//            } else if (position <= 0) { // [-1,0]
//                // Use the default slide transition when moving to the left page
//                view.setAlpha(1);
//                view.setTranslationX(0);
//                view.setScaleX(1);
//                view.setScaleY(1);
//
//            } else if (position <= 1) { // (0,1]
//                // Fade the page out.
//                view.setAlpha(1 - position);
//
//                // Counteract the default slide transition
//                view.setTranslationX(pageWidth * -position);
//
//                // Scale the page down (between MIN_SCALE and 1)
//                float scaleFactor = MIN_SCALE
//                        + (1 - MIN_SCALE) * (1 - Math.abs(position));
//                view.setScaleX(scaleFactor);
//                view.setScaleY(scaleFactor);
//
//            } else { // (1,+Infinity]
//                // This page is way off-screen to the right.
//                view.setAlpha(0);
//            }

        }
    }
}
