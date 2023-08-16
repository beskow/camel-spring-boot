/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.stub.springboot;

import org.apache.camel.Exchange;
import org.apache.camel.component.seda.BlockingQueueFactory;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Stub out any physical endpoints while in development or testing.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.stub")
public class StubComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the stub component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * If shadow is enabled then the stub component will register a shadow
     * endpoint with the actual uri that refers to the stub endpoint, meaning
     * you can lookup the endpoint via both stub:kafka:cheese and kafka:cheese.
     */
    private Boolean shadow = false;
    /**
     * If shadow is enabled then this pattern can be used to filter which
     * components to match. Multiple patterns can be separated by comma.
     */
    private String shadowPattern;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;
    /**
     * Sets the default number of concurrent threads processing exchanges.
     */
    private Integer concurrentConsumers = 1;
    /**
     * The timeout (in milliseconds) used when polling. When a timeout occurs,
     * the consumer can check whether it is allowed to continue running. Setting
     * a lower value allows the consumer to react more quickly upon shutdown.
     */
    private Integer defaultPollTimeout = 1000;
    /**
     * Whether a thread that sends messages to a full SEDA queue will block
     * until the queue's capacity is no longer exhausted. By default, an
     * exception will be thrown stating that the queue is full. By enabling this
     * option, the calling thread will instead block and wait until the message
     * can be accepted.
     */
    private Boolean defaultBlockWhenFull = false;
    /**
     * Whether a thread that sends messages to a full SEDA queue will be
     * discarded. By default, an exception will be thrown stating that the queue
     * is full. By enabling this option, the calling thread will give up sending
     * and continue, meaning that the message was not sent to the SEDA queue.
     */
    private Boolean defaultDiscardWhenFull = false;
    /**
     * Whether a thread that sends messages to a full SEDA queue will block
     * until the queue's capacity is no longer exhausted. By default, an
     * exception will be thrown stating that the queue is full. By enabling this
     * option, where a configured timeout can be added to the block case.
     * Utilizing the .offer(timeout) method of the underlining java queue
     */
    private Long defaultOfferTimeout;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Whether autowiring is enabled. This is used for automatic autowiring
     * options (the option must be marked as autowired) by looking up in the
     * registry to find if there is a single instance of matching type, which
     * then gets configured on the component. This can be used for automatic
     * configuring JDBC data sources, JMS connection factories, AWS Clients,
     * etc.
     */
    private Boolean autowiredEnabled = true;
    /**
     * Sets the default queue factory. The option is a
     * org.apache.camel.component.seda.BlockingQueueFactory<org.apache.camel.Exchange> type.
     */
    private BlockingQueueFactory<Exchange> defaultQueueFactory;
    /**
     * Sets the default maximum capacity of the SEDA queue (i.e., the number of
     * messages it can hold).
     */
    private Integer queueSize = 1000;

    public Boolean getShadow() {
        return shadow;
    }

    public void setShadow(Boolean shadow) {
        this.shadow = shadow;
    }

    public String getShadowPattern() {
        return shadowPattern;
    }

    public void setShadowPattern(String shadowPattern) {
        this.shadowPattern = shadowPattern;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public Integer getConcurrentConsumers() {
        return concurrentConsumers;
    }

    public void setConcurrentConsumers(Integer concurrentConsumers) {
        this.concurrentConsumers = concurrentConsumers;
    }

    public Integer getDefaultPollTimeout() {
        return defaultPollTimeout;
    }

    public void setDefaultPollTimeout(Integer defaultPollTimeout) {
        this.defaultPollTimeout = defaultPollTimeout;
    }

    public Boolean getDefaultBlockWhenFull() {
        return defaultBlockWhenFull;
    }

    public void setDefaultBlockWhenFull(Boolean defaultBlockWhenFull) {
        this.defaultBlockWhenFull = defaultBlockWhenFull;
    }

    public Boolean getDefaultDiscardWhenFull() {
        return defaultDiscardWhenFull;
    }

    public void setDefaultDiscardWhenFull(Boolean defaultDiscardWhenFull) {
        this.defaultDiscardWhenFull = defaultDiscardWhenFull;
    }

    public Long getDefaultOfferTimeout() {
        return defaultOfferTimeout;
    }

    public void setDefaultOfferTimeout(Long defaultOfferTimeout) {
        this.defaultOfferTimeout = defaultOfferTimeout;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }

    public BlockingQueueFactory<Exchange> getDefaultQueueFactory() {
        return defaultQueueFactory;
    }

    public void setDefaultQueueFactory(
            BlockingQueueFactory<Exchange> defaultQueueFactory) {
        this.defaultQueueFactory = defaultQueueFactory;
    }

    public Integer getQueueSize() {
        return queueSize;
    }

    public void setQueueSize(Integer queueSize) {
        this.queueSize = queueSize;
    }
}