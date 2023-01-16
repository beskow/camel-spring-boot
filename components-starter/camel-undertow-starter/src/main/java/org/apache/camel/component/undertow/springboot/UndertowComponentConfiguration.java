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
package org.apache.camel.component.undertow.springboot;

import javax.annotation.Generated;
import org.apache.camel.component.undertow.UndertowHostOptions;
import org.apache.camel.component.undertow.UndertowHttpBinding;
import org.apache.camel.component.undertow.spi.UndertowSecurityProvider;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.apache.camel.support.jsse.SSLContextParameters;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Expose HTTP and WebSocket endpoints and access external HTTP/WebSocket
 * servers.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.undertow")
public class UndertowComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the undertow component. This is
     * enabled by default.
     */
    private Boolean enabled;
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
     * If enabled and an Exchange failed processing on the consumer side the
     * response's body won't contain the exception's stack trace.
     */
    private Boolean muteException = false;
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
     * To configure common options, such as thread pools. The option is a
     * org.apache.camel.component.undertow.UndertowHostOptions type.
     */
    private UndertowHostOptions hostOptions;
    /**
     * To use a custom HttpBinding to control the mapping between Camel message
     * and HttpClient. The option is a
     * org.apache.camel.component.undertow.UndertowHttpBinding type.
     */
    private UndertowHttpBinding undertowHttpBinding;
    /**
     * Configuration used by UndertowSecurityProvider. Comma separated list of
     * allowed roles.
     */
    private String allowedRoles;
    /**
     * Configuration used by UndertowSecurityProvider. Security configuration
     * object for use from UndertowSecurityProvider. Configuration is
     * UndertowSecurityProvider specific. Each provider decides, whether it
     * accepts configuration. The option is a java.lang.Object type.
     */
    private Object securityConfiguration;
    /**
     * Security provider allows plug in the provider, which will be used to
     * secure requests. SPI approach could be used too (component then finds
     * security provider using SPI). The option is a
     * org.apache.camel.component.undertow.spi.UndertowSecurityProvider type.
     */
    private UndertowSecurityProvider securityProvider;
    /**
     * To configure security using SSLContextParameters. The option is a
     * org.apache.camel.support.jsse.SSLContextParameters type.
     */
    private SSLContextParameters sslContextParameters;
    /**
     * Enable usage of global SSL context parameters.
     */
    private Boolean useGlobalSslContextParameters = false;

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public Boolean getMuteException() {
        return muteException;
    }

    public void setMuteException(Boolean muteException) {
        this.muteException = muteException;
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

    public UndertowHostOptions getHostOptions() {
        return hostOptions;
    }

    public void setHostOptions(UndertowHostOptions hostOptions) {
        this.hostOptions = hostOptions;
    }

    public UndertowHttpBinding getUndertowHttpBinding() {
        return undertowHttpBinding;
    }

    public void setUndertowHttpBinding(UndertowHttpBinding undertowHttpBinding) {
        this.undertowHttpBinding = undertowHttpBinding;
    }

    public String getAllowedRoles() {
        return allowedRoles;
    }

    public void setAllowedRoles(String allowedRoles) {
        this.allowedRoles = allowedRoles;
    }

    public Object getSecurityConfiguration() {
        return securityConfiguration;
    }

    public void setSecurityConfiguration(Object securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    public UndertowSecurityProvider getSecurityProvider() {
        return securityProvider;
    }

    public void setSecurityProvider(UndertowSecurityProvider securityProvider) {
        this.securityProvider = securityProvider;
    }

    public SSLContextParameters getSslContextParameters() {
        return sslContextParameters;
    }

    public void setSslContextParameters(
            SSLContextParameters sslContextParameters) {
        this.sslContextParameters = sslContextParameters;
    }

    public Boolean getUseGlobalSslContextParameters() {
        return useGlobalSslContextParameters;
    }

    public void setUseGlobalSslContextParameters(
            Boolean useGlobalSslContextParameters) {
        this.useGlobalSslContextParameters = useGlobalSslContextParameters;
    }
}