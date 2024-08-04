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
package org.apache.camel.component.http.springboot;

import javax.net.ssl.HostnameVerifier;
import org.apache.camel.component.http.HttpClientConfigurer;
import org.apache.camel.http.common.HttpBinding;
import org.apache.camel.http.common.HttpConfiguration;
import org.apache.camel.spi.HeaderFilterStrategy;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.apache.camel.support.jsse.SSLContextParameters;
import org.apache.hc.client5.http.cookie.CookieStore;
import org.apache.hc.client5.http.io.HttpClientConnectionManager;
import org.apache.hc.core5.http.protocol.HttpContext;
import org.apache.hc.core5.util.Timeout;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Send requests to external HTTP servers using Apache HTTP Client 5.x.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.http")
public class HttpComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the http component. This is
     * enabled by default.
     */
    private Boolean enabled;
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
     * Whether to skip mapping all the Camel headers as HTTP request headers. If
     * there are no data from Camel headers needed to be included in the HTTP
     * request then this can avoid parsing overhead with many object allocations
     * for the JVM garbage collector.
     */
    private Boolean skipRequestHeaders = false;
    /**
     * Whether to skip mapping all the HTTP response headers to Camel headers.
     * If there are no data needed from HTTP headers then this can avoid parsing
     * overhead with many object allocations for the JVM garbage collector.
     */
    private Boolean skipResponseHeaders = false;
    /**
     * To use a custom org.apache.hc.client5.http.cookie.CookieStore. By default
     * the org.apache.hc.client5.http.cookie.BasicCookieStore is used which is
     * an in-memory only cookie store. Notice if bridgeEndpoint=true then the
     * cookie store is forced to be a noop cookie store as cookie shouldn't be
     * stored as we are just bridging (eg acting as a proxy). The option is a
     * org.apache.hc.client5.http.cookie.CookieStore type.
     */
    private CookieStore cookieStore;
    /**
     * If this option is true then IN exchange headers will be copied to OUT
     * exchange headers according to copy strategy. Setting this to false,
     * allows to only include the headers from the HTTP response (not
     * propagating IN headers).
     */
    private Boolean copyHeaders = true;
    /**
     * Whether to the HTTP request should follow redirects. By default the HTTP
     * request does not follow redirects
     */
    private Boolean followRedirects = false;
    /**
     * This threshold in bytes controls whether the response payload should be
     * stored in memory as a byte array or be streaming based. Set this to -1 to
     * always use streaming mode.
     */
    private Integer responsePayloadStreamingThreshold = 8192;
    /**
     * Whether to allow java serialization when a request uses
     * context-type=application/x-java-serialized-object. This is by default
     * turned off. If you enable this then be aware that Java will deserialize
     * the incoming data from the request to Java and that can be a potential
     * security risk.
     */
    private Boolean allowJavaSerializedObject = false;
    /**
     * Disables authentication scheme caching
     */
    private Boolean authCachingDisabled = false;
    /**
     * Disables automatic request recovery and re-execution
     */
    private Boolean automaticRetriesDisabled = false;
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
     * To use a custom and shared HttpClientConnectionManager to manage
     * connections. If this has been configured then this is always used for all
     * endpoints created by this component. The option is a
     * org.apache.hc.client5.http.io.HttpClientConnectionManager type.
     */
    private HttpClientConnectionManager clientConnectionManager;
    /**
     * The maximum number of connections per route.
     */
    private Integer connectionsPerRoute = 20;
    /**
     * Disables connection state tracking
     */
    private Boolean connectionStateDisabled = false;
    /**
     * The time for connection to live, the time unit is millisecond, the
     * default value is always keepAlive.
     */
    private Long connectionTimeToLive;
    /**
     * Disables automatic content decompression
     */
    private Boolean contentCompressionDisabled = false;
    /**
     * Disables state (cookie) management
     */
    private Boolean cookieManagementDisabled = false;
    /**
     * Disables the default user agent set by this builder if none has been
     * provided by the user
     */
    private Boolean defaultUserAgentDisabled = false;
    /**
     * To use a custom HttpBinding to control the mapping between Camel message
     * and HttpClient. The option is a org.apache.camel.http.common.HttpBinding
     * type.
     */
    private HttpBinding httpBinding;
    /**
     * To use the custom HttpClientConfigurer to perform configuration of the
     * HttpClient that will be used. The option is a
     * org.apache.camel.component.http.HttpClientConfigurer type.
     */
    private HttpClientConfigurer httpClientConfigurer;
    /**
     * To use the shared HttpConfiguration as base configuration. The option is
     * a org.apache.camel.http.common.HttpConfiguration type.
     */
    private HttpConfiguration httpConfiguration;
    /**
     * To use a custom org.apache.hc.core5.http.protocol.HttpContext when
     * executing requests. The option is a
     * org.apache.hc.core5.http.protocol.HttpContext type.
     */
    private HttpContext httpContext;
    /**
     * The maximum number of connections.
     */
    private Integer maxTotalConnections = 200;
    /**
     * Disables automatic redirect handling
     */
    private Boolean redirectHandlingDisabled = false;
    /**
     * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
     * header to and from Camel message. The option is a
     * org.apache.camel.spi.HeaderFilterStrategy type.
     */
    private HeaderFilterStrategy headerFilterStrategy;
    /**
     * Proxy authentication domain to use
     */
    private String proxyAuthDomain;
    /**
     * Proxy authentication host
     */
    private String proxyAuthHost;
    /**
     * Proxy authentication method to use
     */
    private String proxyAuthMethod;
    /**
     * Proxy authentication domain (workstation name) to use with NTML
     */
    private String proxyAuthNtHost;
    /**
     * Proxy authentication password
     */
    private String proxyAuthPassword;
    /**
     * Proxy authentication port
     */
    private Integer proxyAuthPort;
    /**
     * Proxy authentication protocol scheme
     */
    private String proxyAuthScheme;
    /**
     * Proxy authentication username
     */
    private String proxyAuthUsername;
    /**
     * To configure security using SSLContextParameters. Important: Only one
     * instance of org.apache.camel.support.jsse.SSLContextParameters is
     * supported per HttpComponent. If you need to use 2 or more different
     * instances, you need to define a new HttpComponent per instance you need.
     * The option is a org.apache.camel.support.jsse.SSLContextParameters type.
     */
    private SSLContextParameters sslContextParameters;
    /**
     * Enable usage of global SSL context parameters.
     */
    private Boolean useGlobalSslContextParameters = false;
    /**
     * To use a custom X509HostnameVerifier such as DefaultHostnameVerifier or
     * NoopHostnameVerifier. The option is a javax.net.ssl.HostnameVerifier
     * type.
     */
    private HostnameVerifier x509HostnameVerifier;
    /**
     * Returns the connection lease request timeout used when requesting a
     * connection from the connection manager. A timeout value of zero is
     * interpreted as a disabled timeout. The option is a
     * org.apache.hc.core5.util.Timeout type.
     */
    private Timeout connectionRequestTimeout;
    /**
     * Determines the timeout until a new connection is fully established. A
     * timeout value of zero is interpreted as an infinite timeout. The option
     * is a org.apache.hc.core5.util.Timeout type.
     */
    private Timeout connectTimeout;
    /**
     * Determines the timeout until arrival of a response from the opposite
     * endpoint. A timeout value of zero is interpreted as an infinite timeout.
     * Please note that response timeout may be unsupported by HTTP transports
     * with message multiplexing. The option is a
     * org.apache.hc.core5.util.Timeout type.
     */
    private Timeout responseTimeout;
    /**
     * Determines the default socket timeout value for blocking I/O operations.
     * The option is a org.apache.hc.core5.util.Timeout type.
     */
    private Timeout soTimeout;

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getSkipRequestHeaders() {
        return skipRequestHeaders;
    }

    public void setSkipRequestHeaders(Boolean skipRequestHeaders) {
        this.skipRequestHeaders = skipRequestHeaders;
    }

    public Boolean getSkipResponseHeaders() {
        return skipResponseHeaders;
    }

    public void setSkipResponseHeaders(Boolean skipResponseHeaders) {
        this.skipResponseHeaders = skipResponseHeaders;
    }

    public CookieStore getCookieStore() {
        return cookieStore;
    }

    public void setCookieStore(CookieStore cookieStore) {
        this.cookieStore = cookieStore;
    }

    public Boolean getCopyHeaders() {
        return copyHeaders;
    }

    public void setCopyHeaders(Boolean copyHeaders) {
        this.copyHeaders = copyHeaders;
    }

    public Boolean getFollowRedirects() {
        return followRedirects;
    }

    public void setFollowRedirects(Boolean followRedirects) {
        this.followRedirects = followRedirects;
    }

    public Integer getResponsePayloadStreamingThreshold() {
        return responsePayloadStreamingThreshold;
    }

    public void setResponsePayloadStreamingThreshold(
            Integer responsePayloadStreamingThreshold) {
        this.responsePayloadStreamingThreshold = responsePayloadStreamingThreshold;
    }

    public Boolean getAllowJavaSerializedObject() {
        return allowJavaSerializedObject;
    }

    public void setAllowJavaSerializedObject(Boolean allowJavaSerializedObject) {
        this.allowJavaSerializedObject = allowJavaSerializedObject;
    }

    public Boolean getAuthCachingDisabled() {
        return authCachingDisabled;
    }

    public void setAuthCachingDisabled(Boolean authCachingDisabled) {
        this.authCachingDisabled = authCachingDisabled;
    }

    public Boolean getAutomaticRetriesDisabled() {
        return automaticRetriesDisabled;
    }

    public void setAutomaticRetriesDisabled(Boolean automaticRetriesDisabled) {
        this.automaticRetriesDisabled = automaticRetriesDisabled;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }

    public HttpClientConnectionManager getClientConnectionManager() {
        return clientConnectionManager;
    }

    public void setClientConnectionManager(
            HttpClientConnectionManager clientConnectionManager) {
        this.clientConnectionManager = clientConnectionManager;
    }

    public Integer getConnectionsPerRoute() {
        return connectionsPerRoute;
    }

    public void setConnectionsPerRoute(Integer connectionsPerRoute) {
        this.connectionsPerRoute = connectionsPerRoute;
    }

    public Boolean getConnectionStateDisabled() {
        return connectionStateDisabled;
    }

    public void setConnectionStateDisabled(Boolean connectionStateDisabled) {
        this.connectionStateDisabled = connectionStateDisabled;
    }

    public Long getConnectionTimeToLive() {
        return connectionTimeToLive;
    }

    public void setConnectionTimeToLive(Long connectionTimeToLive) {
        this.connectionTimeToLive = connectionTimeToLive;
    }

    public Boolean getContentCompressionDisabled() {
        return contentCompressionDisabled;
    }

    public void setContentCompressionDisabled(Boolean contentCompressionDisabled) {
        this.contentCompressionDisabled = contentCompressionDisabled;
    }

    public Boolean getCookieManagementDisabled() {
        return cookieManagementDisabled;
    }

    public void setCookieManagementDisabled(Boolean cookieManagementDisabled) {
        this.cookieManagementDisabled = cookieManagementDisabled;
    }

    public Boolean getDefaultUserAgentDisabled() {
        return defaultUserAgentDisabled;
    }

    public void setDefaultUserAgentDisabled(Boolean defaultUserAgentDisabled) {
        this.defaultUserAgentDisabled = defaultUserAgentDisabled;
    }

    public HttpBinding getHttpBinding() {
        return httpBinding;
    }

    public void setHttpBinding(HttpBinding httpBinding) {
        this.httpBinding = httpBinding;
    }

    public HttpClientConfigurer getHttpClientConfigurer() {
        return httpClientConfigurer;
    }

    public void setHttpClientConfigurer(
            HttpClientConfigurer httpClientConfigurer) {
        this.httpClientConfigurer = httpClientConfigurer;
    }

    public HttpConfiguration getHttpConfiguration() {
        return httpConfiguration;
    }

    public void setHttpConfiguration(HttpConfiguration httpConfiguration) {
        this.httpConfiguration = httpConfiguration;
    }

    public HttpContext getHttpContext() {
        return httpContext;
    }

    public void setHttpContext(HttpContext httpContext) {
        this.httpContext = httpContext;
    }

    public Integer getMaxTotalConnections() {
        return maxTotalConnections;
    }

    public void setMaxTotalConnections(Integer maxTotalConnections) {
        this.maxTotalConnections = maxTotalConnections;
    }

    public Boolean getRedirectHandlingDisabled() {
        return redirectHandlingDisabled;
    }

    public void setRedirectHandlingDisabled(Boolean redirectHandlingDisabled) {
        this.redirectHandlingDisabled = redirectHandlingDisabled;
    }

    public HeaderFilterStrategy getHeaderFilterStrategy() {
        return headerFilterStrategy;
    }

    public void setHeaderFilterStrategy(
            HeaderFilterStrategy headerFilterStrategy) {
        this.headerFilterStrategy = headerFilterStrategy;
    }

    public String getProxyAuthDomain() {
        return proxyAuthDomain;
    }

    public void setProxyAuthDomain(String proxyAuthDomain) {
        this.proxyAuthDomain = proxyAuthDomain;
    }

    public String getProxyAuthHost() {
        return proxyAuthHost;
    }

    public void setProxyAuthHost(String proxyAuthHost) {
        this.proxyAuthHost = proxyAuthHost;
    }

    public String getProxyAuthMethod() {
        return proxyAuthMethod;
    }

    public void setProxyAuthMethod(String proxyAuthMethod) {
        this.proxyAuthMethod = proxyAuthMethod;
    }

    public String getProxyAuthNtHost() {
        return proxyAuthNtHost;
    }

    public void setProxyAuthNtHost(String proxyAuthNtHost) {
        this.proxyAuthNtHost = proxyAuthNtHost;
    }

    public String getProxyAuthPassword() {
        return proxyAuthPassword;
    }

    public void setProxyAuthPassword(String proxyAuthPassword) {
        this.proxyAuthPassword = proxyAuthPassword;
    }

    public Integer getProxyAuthPort() {
        return proxyAuthPort;
    }

    public void setProxyAuthPort(Integer proxyAuthPort) {
        this.proxyAuthPort = proxyAuthPort;
    }

    public String getProxyAuthScheme() {
        return proxyAuthScheme;
    }

    public void setProxyAuthScheme(String proxyAuthScheme) {
        this.proxyAuthScheme = proxyAuthScheme;
    }

    public String getProxyAuthUsername() {
        return proxyAuthUsername;
    }

    public void setProxyAuthUsername(String proxyAuthUsername) {
        this.proxyAuthUsername = proxyAuthUsername;
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

    public HostnameVerifier getX509HostnameVerifier() {
        return x509HostnameVerifier;
    }

    public void setX509HostnameVerifier(HostnameVerifier x509HostnameVerifier) {
        this.x509HostnameVerifier = x509HostnameVerifier;
    }

    public Timeout getConnectionRequestTimeout() {
        return connectionRequestTimeout;
    }

    public void setConnectionRequestTimeout(Timeout connectionRequestTimeout) {
        this.connectionRequestTimeout = connectionRequestTimeout;
    }

    public Timeout getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Timeout connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public Timeout getResponseTimeout() {
        return responseTimeout;
    }

    public void setResponseTimeout(Timeout responseTimeout) {
        this.responseTimeout = responseTimeout;
    }

    public Timeout getSoTimeout() {
        return soTimeout;
    }

    public void setSoTimeout(Timeout soTimeout) {
        this.soTimeout = soTimeout;
    }
}