package com.lenovo.arcloud.mq.util;

/***
 * Description
 *
 * @author zhulc1@lenovo.com
 * @since 2017/3/30
 *
 */
public class ArSystemException extends RuntimeException {
    public ArSystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArSystemException() {

    }

    public ArSystemException(String message) {
        super(message);
    }
}