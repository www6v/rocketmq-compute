/*
 * Copyright 2009-2017 Lenovo Software, Inc. All rights reserved.
 */
package com.lenovo.arcloud.mq.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/***
 * Description
 *
 * @since 2017/3/30
 *
 */
@Configuration
@ConfigurationProperties(prefix = "rocketmq")
public class RocketMqConfig {
    @Setter @Getter
    private String namesrvAddr;

    @Setter @Getter
    private String defaultProducerGroup;

    @Setter @Getter
    private String defaultConsumerGroup;

    @Setter @Getter
    private String downVideoConsumerGroup;

    @Setter @Getter
    private String saveFeatureConsumerGroup;

    @Setter @Getter
    private String processFeatureConsumerGroup;

    @Setter @Getter
    private String evalAlgConsumerGroup;

    @Setter @Getter
    private String calctopic;

    @Setter @Getter
    private String downVideo;

    @Setter @Getter
    private String processFeature;

    @Setter @Getter
    private String dumpFeature;

    @Getter @Setter
    private String evalAlg;
}