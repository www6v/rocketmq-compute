/*
 * Copyright 2009-2017 Lenovo Software, Inc. All rights reserved.
 */
package com.lenovo.arcloud.mq.hbase;

import org.apache.hadoop.hbase.TableName;

import java.util.List;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.Increment;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.Scan;

/***
 * Description
 *
 *
 * @since 2017/3/29
 *
 */
public interface HbaseOperations {

    <T> T get(TableName tableName, final String rowName, final String familyName, final String qualifier,
        final RowMapper<T> mapper);

    <T> T get(TableName tableName, final Get get, final RowMapper<T> mapper);

    void put(TableName tableName, final byte[] rowName, final byte[] familyName, final byte[] qualifier,
        final Long timestamp, final byte[] value);

    void put(TableName tableName, final Put put);

    void put(TableName tableName, final List<Put> puts);

    List<Put> asyncPut(TableName tableName, final List<Put> puts);

    void delete(TableName tableName, final List<Delete> deletes);

    <T> List<T> find(TableName tableName, final List<Scan> scans, final ResultsExtractor<T> action);

    <T> List<T> findParallel(TableName tableName, final List<Scan> scans, final ResultsExtractor<T> action);

    Result increment(TableName tableName, final Increment increment);

    long incrementColumnValue(TableName tableName, final byte[] rowName, final byte[] familyName,
        final byte[] qualifier, final long amount, final boolean writeToWAL);

    <T> T execute(TableName tableName, TableCallback<T> action);

}