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
package org.apache.camel.component.minio.springboot;

import java.time.ZonedDateTime;
import io.minio.MinioClient;
import io.minio.ServerSideEncryption;
import io.minio.ServerSideEncryptionCustomerKey;
import okhttp3.OkHttpClient;
import org.apache.camel.component.minio.MinioConfiguration;
import org.apache.camel.component.minio.MinioOperations;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Store and retrieve objects from Minio Storage Service using Minio SDK.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.minio")
public class MinioComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the minio component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Setting the autocreation of the bucket if bucket name not exist.
     */
    private Boolean autoCreateBucket = true;
    /**
     * The component configuration. The option is a
     * org.apache.camel.component.minio.MinioConfiguration type.
     */
    private MinioConfiguration configuration;
    /**
     * Set custom HTTP client for authenticated access. The option is a
     * okhttp3.OkHttpClient type.
     */
    private OkHttpClient customHttpClient;
    /**
     * Endpoint can be an URL, domain name, IPv4 address or IPv6 address.
     */
    private String endpoint;
    /**
     * Reference to a Minio Client object in the registry. The option is a
     * io.minio.MinioClient type.
     */
    private MinioClient minioClient;
    /**
     * Set when creating new bucket.
     */
    private Boolean objectLock = false;
    /**
     * The policy for this queue to set in the method.
     */
    private String policy;
    /**
     * TCP/IP port number. 80 and 443 are used as defaults for HTTP and HTTPS.
     */
    private Integer proxyPort;
    /**
     * The region in which Minio client needs to work. When using this
     * parameter, the configuration will expect the lowercase name of the region
     * (for example ap-east-1). You'll need to use the name
     * Region.EU_WEST_1.id()
     */
    private String region;
    /**
     * Flag to indicate to use secure connection to minio service or not.
     */
    private Boolean secure = false;
    /**
     * Server-side encryption. The option is a io.minio.ServerSideEncryption
     * type.
     */
    private ServerSideEncryption serverSideEncryption;
    /**
     * Server-side encryption for source object while copy/move objects. The
     * option is a io.minio.ServerSideEncryptionCustomerKey type.
     */
    private ServerSideEncryptionCustomerKey serverSideEncryptionCustomerKey;
    /**
     * If this option is true and includeBody is true, then the
     * MinioObject.close() method will be called on exchange completion. This
     * option is strongly related to includeBody option. In case of setting
     * includeBody to true and autocloseBody to false, it will be up to the
     * caller to close the MinioObject stream. Setting autocloseBody to true,
     * will close the MinioObject stream automatically.
     */
    private Boolean autoCloseBody = true;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions (if possible) occurred while the Camel consumer
     * is trying to pickup incoming messages, or the likes, will now be
     * processed as a message and handled by the routing Error Handler.
     * Important: This is only possible if the 3rd party component allows Camel
     * to be alerted if an exception was thrown. Some components handle this
     * internally only, and therefore bridgeErrorHandler is not possible. In
     * other situations we may improve the Camel component to hook into the 3rd
     * party component and make this possible for future releases. By default
     * the consumer will use the org.apache.camel.spi.ExceptionHandler to deal
     * with exceptions, that will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;
    /**
     * Set this flag if you want to bypassGovernanceMode when deleting a
     * particular object.
     */
    private Boolean bypassGovernanceMode = false;
    /**
     * Delete objects from Minio after they have been retrieved. The delete is
     * only performed if the Exchange is committed. If a rollback occurs, the
     * object is not deleted. If this option is false, then the same objects
     * will be retrieve over and over again on the polls. Therefore you need to
     * use the Idempotent Consumer EIP in the route to filter out duplicates.
     * You can filter using the MinioConstants#BUCKET_NAME and
     * MinioConstants#OBJECT_NAME headers, or only the
     * MinioConstants#OBJECT_NAME header.
     */
    private Boolean deleteAfterRead = true;
    /**
     * The delimiter which is used in the ListObjectsRequest to only consume
     * objects we are interested in.
     */
    private String delimiter;
    /**
     * Destination bucket name.
     */
    private String destinationBucketName;
    /**
     * Destination object name.
     */
    private String destinationObjectName;
    /**
     * If it is true, the exchange body will be set to a stream to the contents
     * of the file. If false, the headers will be set with the Minio object
     * metadata, but the body will be null. This option is strongly related to
     * autocloseBody option. In case of setting includeBody to true and
     * autocloseBody to false, it will be up to the caller to close the
     * MinioObject stream. Setting autocloseBody to true, will close the
     * MinioObject stream automatically.
     */
    private Boolean includeBody = true;
    /**
     * The flag which is used in the ListObjectsRequest to set include folders.
     */
    private Boolean includeFolders = false;
    /**
     * The flag which is used in the ListObjectsRequest to get objects with user
     * meta data.
     */
    private Boolean includeUserMetadata = false;
    /**
     * The flag which is used in the ListObjectsRequest to get objects with
     * versioning.
     */
    private Boolean includeVersions = false;
    /**
     * Number of bytes of object data from offset.
     */
    private Long length;
    /**
     * Set match ETag parameter for get object(s).
     */
    private String matchETag;
    /**
     * Set the maxConnections parameter in the minio client configuration
     */
    private Integer maxConnections = 60;
    /**
     * Gets the maximum number of messages as a limit to poll at each polling.
     * Gets the maximum number of messages as a limit to poll at each polling.
     * The default value is 10. Use 0 or a negative number to set it as
     * unlimited.
     */
    private Integer maxMessagesPerPoll = 10;
    /**
     * Set modified since parameter for get object(s).
     */
    private ZonedDateTime modifiedSince;
    /**
     * Move objects from bucket to a different bucket after they have been
     * retrieved. To accomplish the operation the destinationBucket option must
     * be set. The copy bucket operation is only performed if the Exchange is
     * committed. If a rollback occurs, the object is not moved.
     */
    private Boolean moveAfterRead = false;
    /**
     * Set not match ETag parameter for get object(s).
     */
    private String notMatchETag;
    /**
     * To get the object from the bucket with the given object name.
     */
    private String objectName;
    /**
     * Start byte position of object data.
     */
    private Long offset;
    /**
     * Object name starts with prefix.
     */
    private String prefix;
    /**
     * List recursively than directory structure emulation.
     */
    private Boolean recursive = false;
    /**
     * list objects in bucket after this object name.
     */
    private String startAfter;
    /**
     * Set un modified since parameter for get object(s).
     */
    private ZonedDateTime unModifiedSince;
    /**
     * when true, version 1 of REST API is used.
     */
    private Boolean useVersion1 = false;
    /**
     * Set specific version_ID of a object when deleting the object.
     */
    private String versionId;
    /**
     * Delete file object after the Minio file has been uploaded.
     */
    private Boolean deleteAfterWrite = false;
    /**
     * Setting the key name for an element in the bucket through endpoint
     * parameter.
     */
    private String keyName;
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
     * The operation to do in case the user don't want to do only an upload.
     */
    private MinioOperations operation;
    /**
     * If we want to use a POJO request as body or not.
     */
    private Boolean pojoRequest = false;
    /**
     * The storage class to set in the request.
     */
    private String storageClass;
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
     * Used for enabling or disabling all consumer based health checks from this
     * component
     */
    private Boolean healthCheckConsumerEnabled = true;
    /**
     * Used for enabling or disabling all producer based health checks from this
     * component. Notice: Camel has by default disabled all producer based
     * health-checks. You can turn on producer checks globally by setting
     * camel.health.producersEnabled=true.
     */
    private Boolean healthCheckProducerEnabled = true;
    /**
     * Amazon AWS Secret Access Key or Minio Access Key. If not set camel will
     * connect to service for anonymous access.
     */
    private String accessKey;
    /**
     * Amazon AWS Access Key Id or Minio Secret Key. If not set camel will
     * connect to service for anonymous access.
     */
    private String secretKey;

    public Boolean getAutoCreateBucket() {
        return autoCreateBucket;
    }

    public void setAutoCreateBucket(Boolean autoCreateBucket) {
        this.autoCreateBucket = autoCreateBucket;
    }

    public MinioConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(MinioConfiguration configuration) {
        this.configuration = configuration;
    }

    public OkHttpClient getCustomHttpClient() {
        return customHttpClient;
    }

    public void setCustomHttpClient(OkHttpClient customHttpClient) {
        this.customHttpClient = customHttpClient;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public MinioClient getMinioClient() {
        return minioClient;
    }

    public void setMinioClient(MinioClient minioClient) {
        this.minioClient = minioClient;
    }

    public Boolean getObjectLock() {
        return objectLock;
    }

    public void setObjectLock(Boolean objectLock) {
        this.objectLock = objectLock;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public Integer getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Boolean getSecure() {
        return secure;
    }

    public void setSecure(Boolean secure) {
        this.secure = secure;
    }

    public ServerSideEncryption getServerSideEncryption() {
        return serverSideEncryption;
    }

    public void setServerSideEncryption(
            ServerSideEncryption serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption;
    }

    public ServerSideEncryptionCustomerKey getServerSideEncryptionCustomerKey() {
        return serverSideEncryptionCustomerKey;
    }

    public void setServerSideEncryptionCustomerKey(
            ServerSideEncryptionCustomerKey serverSideEncryptionCustomerKey) {
        this.serverSideEncryptionCustomerKey = serverSideEncryptionCustomerKey;
    }

    public Boolean getAutoCloseBody() {
        return autoCloseBody;
    }

    public void setAutoCloseBody(Boolean autoCloseBody) {
        this.autoCloseBody = autoCloseBody;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public Boolean getBypassGovernanceMode() {
        return bypassGovernanceMode;
    }

    public void setBypassGovernanceMode(Boolean bypassGovernanceMode) {
        this.bypassGovernanceMode = bypassGovernanceMode;
    }

    public Boolean getDeleteAfterRead() {
        return deleteAfterRead;
    }

    public void setDeleteAfterRead(Boolean deleteAfterRead) {
        this.deleteAfterRead = deleteAfterRead;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public String getDestinationBucketName() {
        return destinationBucketName;
    }

    public void setDestinationBucketName(String destinationBucketName) {
        this.destinationBucketName = destinationBucketName;
    }

    public String getDestinationObjectName() {
        return destinationObjectName;
    }

    public void setDestinationObjectName(String destinationObjectName) {
        this.destinationObjectName = destinationObjectName;
    }

    public Boolean getIncludeBody() {
        return includeBody;
    }

    public void setIncludeBody(Boolean includeBody) {
        this.includeBody = includeBody;
    }

    public Boolean getIncludeFolders() {
        return includeFolders;
    }

    public void setIncludeFolders(Boolean includeFolders) {
        this.includeFolders = includeFolders;
    }

    public Boolean getIncludeUserMetadata() {
        return includeUserMetadata;
    }

    public void setIncludeUserMetadata(Boolean includeUserMetadata) {
        this.includeUserMetadata = includeUserMetadata;
    }

    public Boolean getIncludeVersions() {
        return includeVersions;
    }

    public void setIncludeVersions(Boolean includeVersions) {
        this.includeVersions = includeVersions;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public String getMatchETag() {
        return matchETag;
    }

    public void setMatchETag(String matchETag) {
        this.matchETag = matchETag;
    }

    public Integer getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(Integer maxConnections) {
        this.maxConnections = maxConnections;
    }

    public Integer getMaxMessagesPerPoll() {
        return maxMessagesPerPoll;
    }

    public void setMaxMessagesPerPoll(Integer maxMessagesPerPoll) {
        this.maxMessagesPerPoll = maxMessagesPerPoll;
    }

    public ZonedDateTime getModifiedSince() {
        return modifiedSince;
    }

    public void setModifiedSince(ZonedDateTime modifiedSince) {
        this.modifiedSince = modifiedSince;
    }

    public Boolean getMoveAfterRead() {
        return moveAfterRead;
    }

    public void setMoveAfterRead(Boolean moveAfterRead) {
        this.moveAfterRead = moveAfterRead;
    }

    public String getNotMatchETag() {
        return notMatchETag;
    }

    public void setNotMatchETag(String notMatchETag) {
        this.notMatchETag = notMatchETag;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Boolean getRecursive() {
        return recursive;
    }

    public void setRecursive(Boolean recursive) {
        this.recursive = recursive;
    }

    public String getStartAfter() {
        return startAfter;
    }

    public void setStartAfter(String startAfter) {
        this.startAfter = startAfter;
    }

    public ZonedDateTime getUnModifiedSince() {
        return unModifiedSince;
    }

    public void setUnModifiedSince(ZonedDateTime unModifiedSince) {
        this.unModifiedSince = unModifiedSince;
    }

    public Boolean getUseVersion1() {
        return useVersion1;
    }

    public void setUseVersion1(Boolean useVersion1) {
        this.useVersion1 = useVersion1;
    }

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public Boolean getDeleteAfterWrite() {
        return deleteAfterWrite;
    }

    public void setDeleteAfterWrite(Boolean deleteAfterWrite) {
        this.deleteAfterWrite = deleteAfterWrite;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public MinioOperations getOperation() {
        return operation;
    }

    public void setOperation(MinioOperations operation) {
        this.operation = operation;
    }

    public Boolean getPojoRequest() {
        return pojoRequest;
    }

    public void setPojoRequest(Boolean pojoRequest) {
        this.pojoRequest = pojoRequest;
    }

    public String getStorageClass() {
        return storageClass;
    }

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }

    public Boolean getHealthCheckConsumerEnabled() {
        return healthCheckConsumerEnabled;
    }

    public void setHealthCheckConsumerEnabled(Boolean healthCheckConsumerEnabled) {
        this.healthCheckConsumerEnabled = healthCheckConsumerEnabled;
    }

    public Boolean getHealthCheckProducerEnabled() {
        return healthCheckProducerEnabled;
    }

    public void setHealthCheckProducerEnabled(Boolean healthCheckProducerEnabled) {
        this.healthCheckProducerEnabled = healthCheckProducerEnabled;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}