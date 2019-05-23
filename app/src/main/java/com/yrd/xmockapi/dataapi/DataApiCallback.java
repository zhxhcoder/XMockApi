package com.yrd.xmockapi.dataapi;

import rx.Subscriber;

/**
 * Callback of data access (network) operation，it is async.
 */
public interface DataApiCallback<T>  {

    void onSuccess(T data);

    void onError(Throwable e);

    void onStart();
}
