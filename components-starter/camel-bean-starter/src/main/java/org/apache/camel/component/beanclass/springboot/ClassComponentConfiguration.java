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
package org.apache.camel.component.beanclass.springboot;

import javax.annotation.Generated;
import org.apache.camel.BeanScope;
import org.apache.camel.component.beanclass.ClassComponent;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;

/**
 * Invoke methods of Java beans specified by class name.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.class")
public class ClassComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the class component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Use singleton option instead.
     */
    @Deprecated
    private Boolean cache = true;
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
     * Scope of bean. When using singleton scope (default) the bean is created
     * or looked up only once and reused for the lifetime of the endpoint. The
     * bean should be thread-safe in case concurrent threads is calling the bean
     * at the same time. When using request scope the bean is created or looked
     * up once per request (exchange). This can be used if you want to store
     * state on a bean while processing a request and you want to call the same
     * bean instance multiple times while processing the request. The bean does
     * not have to be thread-safe as the instance is only called from the same
     * request. When using delegate scope, then the bean will be looked up or
     * created per call. However in case of lookup then this is delegated to the
     * bean registry such as Spring or CDI (if in use), which depends on their
     * configuration can act as either singleton or prototype scope. so when
     * using prototype then this depends on the delegated registry.
     */
    private BeanScope scope = BeanScope.Singleton;
    /**
     * Whether autowiring is enabled. This is used for automatic autowiring
     * options (the option must be marked as autowired) by looking up in the
     * registry to find if there is a single instance of matching type, which
     * then gets configured on the component. This can be used for automatic
     * configuring JDBC data sources, JMS connection factories, AWS Clients,
     * etc.
     */
    private Boolean autowiredEnabled = true;

    @Deprecated
    @DeprecatedConfigurationProperty
    public Boolean getCache() {
        return cache;
    }

    @Deprecated
    public void setCache(Boolean cache) {
        this.cache = cache;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public BeanScope getScope() {
        return scope;
    }

    public void setScope(BeanScope scope) {
        this.scope = scope;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }
}