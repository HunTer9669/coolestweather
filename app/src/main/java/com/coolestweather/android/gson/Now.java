package com.coolestweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HeTian on 2017/9/12.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
