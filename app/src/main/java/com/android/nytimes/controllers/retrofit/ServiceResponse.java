package com.android.nytimes.controllers.retrofit;


public interface ServiceResponse {
    void onSuccess(Object object);

    void onFail(Object object);

    void onError(Object object);
}
