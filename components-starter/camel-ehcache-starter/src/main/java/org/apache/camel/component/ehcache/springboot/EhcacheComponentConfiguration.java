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
package org.apache.camel.component.ehcache.springboot;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.component.ehcache.EhcacheComponent;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.ehcache.CacheManager;
import org.ehcache.config.CacheConfiguration;
import org.ehcache.config.Configuration;
import org.ehcache.event.EventFiring;
import org.ehcache.event.EventOrdering;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Perform caching operations using Ehcache.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.ehcache")
public class EhcacheComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the ehcache component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * The cache manager. The option is a org.ehcache.CacheManager type.
     */
    private CacheManager cacheManager;
    /**
     * The cache manager configuration. The option is a
     * org.ehcache.config.Configuration type.
     */
    private Configuration cacheManagerConfiguration;
    /**
     * URI pointing to the Ehcache XML configuration file's location
     */
    private String configurationUri;
    /**
     * Configure if a cache need to be created if it does exist or can't be
     * pre-configured.
     */
    private Boolean createCacheIfNotExist = true;
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
     * Set the delivery mode (synchronous, asynchronous)
     */
    private EventFiring eventFiring = EventFiring.ASYNCHRONOUS;
    /**
     * Set the delivery mode (ordered, unordered)
     */
    private EventOrdering eventOrdering = EventOrdering.ORDERED;
    /**
     * Set the type of events to listen for
     * (EVICTED,EXPIRED,REMOVED,CREATED,UPDATED). You can specify multiple
     * entries separated by comma.
     */
    private String eventTypes;
    /**
     * To configure the default cache action. If an action is set in the message
     * header, then the operation from the header takes precedence.
     */
    private String action;
    /**
     * To configure the default action key. If a key is set in the message
     * header, then the key from the header takes precedence. The option is a
     * java.lang.Object type.
     */
    private Object key;
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
     * The default cache configuration to be used to create caches. The option
     * is a org.ehcache.config.CacheConfiguration type.
     */
    private CacheConfiguration configuration;
    /**
     * A map of cache configuration to be used to create caches.
     */
    private Map<String, CacheConfiguration> configurations;
    /**
     * The cache key type, default java.lang.Object
     */
    private String keyType;
    /**
     * The cache value type, default java.lang.Object
     */
    private String valueType;

    public CacheManager getCacheManager() {
        return cacheManager;
    }

    public void setCacheManager(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    public Configuration getCacheManagerConfiguration() {
        return cacheManagerConfiguration;
    }

    public void setCacheManagerConfiguration(
            Configuration cacheManagerConfiguration) {
        this.cacheManagerConfiguration = cacheManagerConfiguration;
    }

    public String getConfigurationUri() {
        return configurationUri;
    }

    public void setConfigurationUri(String configurationUri) {
        this.configurationUri = configurationUri;
    }

    public Boolean getCreateCacheIfNotExist() {
        return createCacheIfNotExist;
    }

    public void setCreateCacheIfNotExist(Boolean createCacheIfNotExist) {
        this.createCacheIfNotExist = createCacheIfNotExist;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public EventFiring getEventFiring() {
        return eventFiring;
    }

    public void setEventFiring(EventFiring eventFiring) {
        this.eventFiring = eventFiring;
    }

    public EventOrdering getEventOrdering() {
        return eventOrdering;
    }

    public void setEventOrdering(EventOrdering eventOrdering) {
        this.eventOrdering = eventOrdering;
    }

    public String getEventTypes() {
        return eventTypes;
    }

    public void setEventTypes(String eventTypes) {
        this.eventTypes = eventTypes;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
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

    public CacheConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(CacheConfiguration configuration) {
        this.configuration = configuration;
    }

    public Map<String, CacheConfiguration> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(Map<String, CacheConfiguration> configurations) {
        this.configurations = configurations;
    }

    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }
}