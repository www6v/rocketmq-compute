package com.lenovo.arcloud.mq.hbase;

/***
 * Description
 *
 * @author zhulc1@lenovo.com
 * @since 2017/3/29
 *
 */
public interface ValueMapper<T> {
    byte[] mapValue(T value);
}