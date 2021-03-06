// Copyright (c) 2014 blinkbox Entertainment Limited. All rights reserved.
package com.blinkboxbooks.android.ui;

import android.support.v4.app.Fragment;
import android.text.TextUtils;

import com.blinkboxbooks.android.util.AnalyticsHelper;

/**
 * Base class for fragments.
 */
public class BaseFragment extends Fragment {

    protected String mFragmentName;

    @Override
    public void onStart() {
        super.onStart();

        if (!TextUtils.isEmpty(mFragmentName)) {
            AnalyticsHelper.getInstance().startTrackingUIComponent(mFragmentName);
        }
    }

    @Override
    public void onStop() {
        super.onStop();

        if (!TextUtils.isEmpty(mFragmentName)) {
            AnalyticsHelper.getInstance().stopTrackingUIComponent(mFragmentName);
        }
    }
}
