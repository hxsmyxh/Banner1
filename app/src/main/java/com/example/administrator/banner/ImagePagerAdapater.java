package com.example.administrator.banner;

import android.support.v4.view.PagerAdapter;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by Administrator on 10/16/2017.
 */

class ImagePagerAdapater extends PagerAdapter {
    public ImagePagerAdapater(Banner banner, ArrayList<GoodsInfo> goodsList) {
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
