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
package org.apache.camel.component.facebook.springboot;

import javax.annotation.Generated;
import org.apache.camel.component.facebook.config.FacebookConfiguration;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Send requests to Facebook APIs supported by Facebook4J.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.facebook")
public class FacebookComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the facebook component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Facebook4J API client URL
     */
    private String clientURL;
    /**
     * Facebook4J client API version
     */
    private String clientVersion;
    /**
     * Enables deubg output. Effective only with the embedded logger
     */
    private Boolean debugEnabled = false;
    /**
     * Use Facebook GZIP encoding
     */
    private Boolean gzipEnabled = true;
    /**
     * Http connection timeout in milliseconds
     */
    private Integer httpConnectionTimeout = 20000;
    /**
     * HTTP maximum connections per route
     */
    private Integer httpDefaultMaxPerRoute = 2;
    /**
     * HTTP maximum total connections
     */
    private Integer httpMaxTotalConnections = 20;
    /**
     * Http read timeout in milliseconds
     */
    private Integer httpReadTimeout = 120000;
    /**
     * Number of HTTP retries
     */
    private Integer httpRetryCount = 0;
    /**
     * HTTP retry interval in seconds
     */
    private Integer httpRetryIntervalSeconds = 5;
    /**
     * HTTP streaming read timeout in milliseconds
     */
    private Integer httpStreamingReadTimeout = 40000;
    /**
     * If set to true, raw JSON forms will be stored in DataObjectFactory
     */
    private Boolean jsonStoreEnabled = false;
    /**
     * If set to true, Facebook4J mbean will be registerd
     */
    private Boolean mbeanEnabled = false;
    /**
     * Prettify JSON debug output if set to true
     */
    private Boolean prettyDebugEnabled = false;
    /**
     * API base URL
     */
    private String restBaseURL = "https://graph.facebook.com/";
    /**
     * Use SSL
     */
    private Boolean useSSL = true;
    /**
     * Video API base URL
     */
    private String videoBaseURL = "https://graph-video.facebook.com/";
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
     * To use the shared configuration. The option is a
     * org.apache.camel.component.facebook.config.FacebookConfiguration type.
     */
    private FacebookConfiguration configuration;
    /**
     * HTTP proxy server host name
     */
    private String httpProxyHost;
    /**
     * HTTP proxy server password
     */
    private String httpProxyPassword;
    /**
     * HTTP proxy server port
     */
    private Integer httpProxyPort;
    /**
     * HTTP proxy server user name
     */
    private String httpProxyUser;
    /**
     * The user access token
     */
    private String oAuthAccessToken;
    /**
     * OAuth access token URL
     */
    private String oAuthAccessTokenURL = "https://graph.facebook.com/oauth/access_token";
    /**
     * The application Id
     */
    private String oAuthAppId;
    /**
     * The application Secret
     */
    private String oAuthAppSecret;
    /**
     * OAuth authorization URL
     */
    private String oAuthAuthorizationURL = "https://www.facebook.com/dialog/oauth";
    /**
     * Default OAuth permissions. Comma separated permission names. See
     * https://developers.facebook.com/docs/reference/login/#permissions for the
     * detail
     */
    private String oAuthPermissions;

    public String getClientURL() {
        return clientURL;
    }

    public void setClientURL(String clientURL) {
        this.clientURL = clientURL;
    }

    public String getClientVersion() {
        return clientVersion;
    }

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    public Boolean getDebugEnabled() {
        return debugEnabled;
    }

    public void setDebugEnabled(Boolean debugEnabled) {
        this.debugEnabled = debugEnabled;
    }

    public Boolean getGzipEnabled() {
        return gzipEnabled;
    }

    public void setGzipEnabled(Boolean gzipEnabled) {
        this.gzipEnabled = gzipEnabled;
    }

    public Integer getHttpConnectionTimeout() {
        return httpConnectionTimeout;
    }

    public void setHttpConnectionTimeout(Integer httpConnectionTimeout) {
        this.httpConnectionTimeout = httpConnectionTimeout;
    }

    public Integer getHttpDefaultMaxPerRoute() {
        return httpDefaultMaxPerRoute;
    }

    public void setHttpDefaultMaxPerRoute(Integer httpDefaultMaxPerRoute) {
        this.httpDefaultMaxPerRoute = httpDefaultMaxPerRoute;
    }

    public Integer getHttpMaxTotalConnections() {
        return httpMaxTotalConnections;
    }

    public void setHttpMaxTotalConnections(Integer httpMaxTotalConnections) {
        this.httpMaxTotalConnections = httpMaxTotalConnections;
    }

    public Integer getHttpReadTimeout() {
        return httpReadTimeout;
    }

    public void setHttpReadTimeout(Integer httpReadTimeout) {
        this.httpReadTimeout = httpReadTimeout;
    }

    public Integer getHttpRetryCount() {
        return httpRetryCount;
    }

    public void setHttpRetryCount(Integer httpRetryCount) {
        this.httpRetryCount = httpRetryCount;
    }

    public Integer getHttpRetryIntervalSeconds() {
        return httpRetryIntervalSeconds;
    }

    public void setHttpRetryIntervalSeconds(Integer httpRetryIntervalSeconds) {
        this.httpRetryIntervalSeconds = httpRetryIntervalSeconds;
    }

    public Integer getHttpStreamingReadTimeout() {
        return httpStreamingReadTimeout;
    }

    public void setHttpStreamingReadTimeout(Integer httpStreamingReadTimeout) {
        this.httpStreamingReadTimeout = httpStreamingReadTimeout;
    }

    public Boolean getJsonStoreEnabled() {
        return jsonStoreEnabled;
    }

    public void setJsonStoreEnabled(Boolean jsonStoreEnabled) {
        this.jsonStoreEnabled = jsonStoreEnabled;
    }

    public Boolean getMbeanEnabled() {
        return mbeanEnabled;
    }

    public void setMbeanEnabled(Boolean mbeanEnabled) {
        this.mbeanEnabled = mbeanEnabled;
    }

    public Boolean getPrettyDebugEnabled() {
        return prettyDebugEnabled;
    }

    public void setPrettyDebugEnabled(Boolean prettyDebugEnabled) {
        this.prettyDebugEnabled = prettyDebugEnabled;
    }

    public String getRestBaseURL() {
        return restBaseURL;
    }

    public void setRestBaseURL(String restBaseURL) {
        this.restBaseURL = restBaseURL;
    }

    public Boolean getUseSSL() {
        return useSSL;
    }

    public void setUseSSL(Boolean useSSL) {
        this.useSSL = useSSL;
    }

    public String getVideoBaseURL() {
        return videoBaseURL;
    }

    public void setVideoBaseURL(String videoBaseURL) {
        this.videoBaseURL = videoBaseURL;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
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

    public FacebookConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(FacebookConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getHttpProxyHost() {
        return httpProxyHost;
    }

    public void setHttpProxyHost(String httpProxyHost) {
        this.httpProxyHost = httpProxyHost;
    }

    public String getHttpProxyPassword() {
        return httpProxyPassword;
    }

    public void setHttpProxyPassword(String httpProxyPassword) {
        this.httpProxyPassword = httpProxyPassword;
    }

    public Integer getHttpProxyPort() {
        return httpProxyPort;
    }

    public void setHttpProxyPort(Integer httpProxyPort) {
        this.httpProxyPort = httpProxyPort;
    }

    public String getHttpProxyUser() {
        return httpProxyUser;
    }

    public void setHttpProxyUser(String httpProxyUser) {
        this.httpProxyUser = httpProxyUser;
    }

    public String getOAuthAccessToken() {
        return oAuthAccessToken;
    }

    public void setOAuthAccessToken(String oAuthAccessToken) {
        this.oAuthAccessToken = oAuthAccessToken;
    }

    public String getOAuthAccessTokenURL() {
        return oAuthAccessTokenURL;
    }

    public void setOAuthAccessTokenURL(String oAuthAccessTokenURL) {
        this.oAuthAccessTokenURL = oAuthAccessTokenURL;
    }

    public String getOAuthAppId() {
        return oAuthAppId;
    }

    public void setOAuthAppId(String oAuthAppId) {
        this.oAuthAppId = oAuthAppId;
    }

    public String getOAuthAppSecret() {
        return oAuthAppSecret;
    }

    public void setOAuthAppSecret(String oAuthAppSecret) {
        this.oAuthAppSecret = oAuthAppSecret;
    }

    public String getOAuthAuthorizationURL() {
        return oAuthAuthorizationURL;
    }

    public void setOAuthAuthorizationURL(String oAuthAuthorizationURL) {
        this.oAuthAuthorizationURL = oAuthAuthorizationURL;
    }

    public String getOAuthPermissions() {
        return oAuthPermissions;
    }

    public void setOAuthPermissions(String oAuthPermissions) {
        this.oAuthPermissions = oAuthPermissions;
    }
}