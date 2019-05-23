package com.yrd.xmockapi.mockapi;

import com.yrd.xmockapi.dataapi.task.ITaskApi;
import com.yrd.xmockapi.mockapi.task.MockTaskApi;

import java.util.HashMap;

/**
 * All mock DataApi instance will be fetched through here.
 */
public class MockApiManager {

    /**
     * Always return null.  
     */
    public static <T> T getMockApi(Class<T> dataApiClass) {
        return null;
    }   
}
