/*
 * Copyright (c) 2014 xiaomaihd and/or its affiliates.All Rights Reserved.
 *            http://www.xiaomaihd.com
 */
package com.jh.applets.common.util.id;

/**
 * <p>
 * ID工具类
 */
public class IdUtil {

    private static IdWorker idWorker = new IdWorker(1);

    private IdUtil() {
    }

    public static long generateId() {
        return idWorker.nextId();
    }


}