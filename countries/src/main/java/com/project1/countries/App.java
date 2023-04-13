package com.project1.countries;

import com.project1.common.AppParent;
import com.project1.common.Question;
import com.project1.common.Utils;

public class App extends AppParent {
    @Override
    protected Question[] generateQuestions() {
        return Utils.readQuestions(this, "countriesQuestions.json");
    }

    @Override
    protected String getAdsId() {
        return BuildConfig.ADS_ID;
    }
}
