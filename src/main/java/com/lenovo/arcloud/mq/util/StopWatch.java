package com.lenovo.arcloud.mq.util;

/***
 * Description
 *
 * @author zhulc1@lenovo.com
 * @since 2017/3/29
 *
 */
public class StopWatch {
    private long start;

    public void start(){
        this.start = System.currentTimeMillis();
    }

    public long stop(){
        return System.currentTimeMillis() - this.start;

    }
}