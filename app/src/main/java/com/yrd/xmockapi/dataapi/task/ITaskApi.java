package com.yrd.xmockapi.dataapi.task;

import com.yrd.xmockapi.data.Task;
import com.yrd.xmockapi.dataapi.DataApiCallback;

import java.util.List;

/**
 * interface for DataApi about a Task, include methods of accessing Task.
 */
public interface ITaskApi {

    /**
     * Get all Tasks (from server).
     * @param callback callback of data access (network) operation.
     */
    void getTasks(DataApiCallback<List<Task>> callback);
}
