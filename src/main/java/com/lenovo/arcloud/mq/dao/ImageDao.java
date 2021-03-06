/*
 * Copyright 2009-2017 Lenovo Software, Inc. All rights reserved.
 */
package com.lenovo.arcloud.mq.dao;

import com.lenovo.arcloud.mq.model.ImageObj;

import java.util.List;

/***
 * Description
 *
 *
 * @since 2017/3/29
 *
 */
public interface ImageDao {

    void insert(ImageObj image);

    void insert(List<ImageObj> imageObjList);
}