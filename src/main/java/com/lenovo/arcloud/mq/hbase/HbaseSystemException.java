/*
 * Copyright 2009-2017 Lenovo Software, Inc. All rights reserved.
 */
package com.lenovo.arcloud.mq.hbase;

/***
 * Description
 *
 *
 * @since 2017/3/29
 *
 */
public class HbaseSystemException extends RuntimeException {
    public HbaseSystemException(Exception cause) {
        super(cause.getMessage(), cause);
    }
}