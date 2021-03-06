package com.study.xuan.xvolleyutil.request;


import com.android.volley.AuthFailureError;
import com.android.volley.Response;

import java.util.Map;

/**
 * Author : xuan.
 * Data : 2017/8/18.
 * Description :the post contains params
 */

public class PostRequest extends XStringRequest {
    private Map<String,String> mParams;

    public PostRequest(String url, Map<String, String> header, Map<String, String> params,
                       Response.Listener<String> listener,
                       Response.ErrorListener errorListener) {
        super(Method.POST, url, header, listener, errorListener);
        this.mParams = params;
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return mParams;
    }
}
