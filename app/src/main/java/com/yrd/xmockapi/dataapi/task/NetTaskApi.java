package com.yrd.xmockapi.dataapi.task;

import com.yrd.xmockapi.data.Task;
import com.yrd.xmockapi.dataapi.DataApiCallback;

import java.util.List;

/**
 * Real implement of ITaskApi.
 */
public class NetTaskApi implements ITaskApi {
    @Override
    public void getTasks(DataApiCallback<List<Task>> callback) {
        // for now, there is no actual server api, notify the error.
        callback.onError(new Exception("No Data Api."));
    }
}
