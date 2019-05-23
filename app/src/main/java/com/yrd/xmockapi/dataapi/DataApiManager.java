package com.yrd.xmockapi.dataapi;

import com.yrd.xmockapi.BuildConfig;
import com.yrd.xmockapi.dataapi.task.ITaskApi;
import com.yrd.xmockapi.dataapi.task.NetTaskApi;
import com.yrd.xmockapi.mockapi.MockApiManager;

/**
 * All DataApi instance will be fetched through here.
 */
public class DataApiManager {
    /**
     * As simple example, when in debug build, we can use mock.
     */
    private static final boolean MOCK_ENABLE = BuildConfig.DEBUG;

    /**
     * Get a DataApi instance of Task.
     * @return ITaskApi instance, could be a mock instance.
     */
    public static ITaskApi ofTask() {
        if (MOCK_ENABLE) {
            ITaskApi api = MockApiManager.getMockApi(ITaskApi.class);
            if (api != null) return api;
        }

        return new NetTaskApi();
    }
}
