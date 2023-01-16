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
package org.apache.camel.component.azure.storage.blob.springboot;

import java.time.Duration;
import java.time.OffsetDateTime;
import javax.annotation.Generated;
import com.azure.core.util.Context;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.models.BlockListType;
import com.azure.storage.common.StorageSharedKeyCredential;
import org.apache.camel.component.azure.storage.blob.BlobComponent;
import org.apache.camel.component.azure.storage.blob.BlobConfiguration;
import org.apache.camel.component.azure.storage.blob.BlobOperationsDefinition;
import org.apache.camel.component.azure.storage.blob.BlobType;
import org.apache.camel.component.azure.storage.blob.CredentialType;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Store and retrieve blobs from Azure Storage Blob Service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.azure-storage-blob")
public class BlobComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the azure-storage-blob component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * The blob name, to consume specific blob from a container. However, on
     * producer it is only required for the operations on the blob level
     */
    private String blobName;
    /**
     * Set the blob offset for the upload or download operations, default is 0
     */
    private Long blobOffset = 0L;
    /**
     * The blob type in order to initiate the appropriate settings for each blob
     * type
     */
    private BlobType blobType = BlobType.blockblob;
    /**
     * Close the stream after read or keep it open, default is true
     */
    private Boolean closeStreamAfterRead = true;
    /**
     * The component configurations. The option is a
     * org.apache.camel.component.azure.storage.blob.BlobConfiguration type.
     */
    private BlobConfiguration configuration;
    /**
     * StorageSharedKeyCredential can be injected to create the azure client,
     * this holds the important authentication information. The option is a
     * com.azure.storage.common.StorageSharedKeyCredential type.
     */
    private StorageSharedKeyCredential credentials;
    /**
     * Determines the credential strategy to adopt
     */
    private CredentialType credentialType = CredentialType.AZURE_IDENTITY;
    /**
     * How many bytes to include in the range. Must be greater than or equal to
     * 0 if specified.
     */
    private Long dataCount;
    /**
     * The file directory where the downloaded blobs will be saved to, this can
     * be used in both, producer and consumer
     */
    private String fileDir;
    /**
     * Specifies the maximum number of blobs to return, including all BlobPrefix
     * elements. If the request does not specify maxResultsPerPage or specifies
     * a value greater than 5,000, the server will return up to 5,000 items.
     */
    private Integer maxResultsPerPage;
    /**
     * Specifies the maximum number of additional HTTP Get requests that will be
     * made while reading the data from a response body.
     */
    private Integer maxRetryRequests = 0;
    /**
     * Filters the results to return only blobs whose names begin with the
     * specified prefix. May be null to return all blobs.
     */
    private String prefix;
    /**
     * Filters the results to return only blobs whose names match the specified
     * regular expression. May be null to return all if both prefix and regex
     * are set, regex takes the priority and prefix is ignored.
     */
    private String regex;
    /**
     * Client to a storage account. This client does not hold any state about a
     * particular storage account but is instead a convenient way of sending off
     * appropriate requests to the resource on the service. It may also be used
     * to construct URLs to blobs and containers. This client contains
     * operations on a service account. Operations on a container are available
     * on BlobContainerClient through
     * BlobServiceClient#getBlobContainerClient(String), and operations on a
     * blob are available on BlobClient through
     * BlobContainerClient#getBlobClient(String). The option is a
     * com.azure.storage.blob.BlobServiceClient type.
     */
    private BlobServiceClient serviceClient;
    /**
     * An optional timeout value beyond which a RuntimeException will be raised.
     * The option is a java.time.Duration type.
     */
    private Duration timeout;
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
     * A user-controlled value that you can use to track requests. The value of
     * the sequence number must be between 0 and 263 - 1.The default value is 0.
     */
    private Long blobSequenceNumber = 0L;
    /**
     * Specifies which type of blocks to return.
     */
    private BlockListType blockListType = BlockListType.COMMITTED;
    /**
     * When using getChangeFeed producer operation, this gives additional
     * context that is passed through the Http pipeline during the service call.
     * The option is a com.azure.core.util.Context type.
     */
    private Context changeFeedContext;
    /**
     * When using getChangeFeed producer operation, this filters the results to
     * return events approximately before the end time. Note: A few events
     * belonging to the next hour can also be returned. A few events belonging
     * to this hour can be missing; to ensure all events from the hour are
     * returned, round the end time up by an hour. The option is a
     * java.time.OffsetDateTime type.
     */
    private OffsetDateTime changeFeedEndTime;
    /**
     * When using getChangeFeed producer operation, this filters the results to
     * return events approximately after the start time. Note: A few events
     * belonging to the previous hour can also be returned. A few events
     * belonging to this hour can be missing; to ensure all events from the hour
     * are returned, round the start time down by an hour. The option is a
     * java.time.OffsetDateTime type.
     */
    private OffsetDateTime changeFeedStartTime;
    /**
     * Close the stream after write or keep it open, default is true
     */
    private Boolean closeStreamAfterWrite = true;
    /**
     * When is set to true, the staged blocks will not be committed directly.
     */
    private Boolean commitBlockListLater = true;
    /**
     * When is set to true, the append blocks will be created when committing
     * append blocks.
     */
    private Boolean createAppendBlob = true;
    /**
     * When is set to true, the page blob will be created when uploading page
     * blob.
     */
    private Boolean createPageBlob = true;
    /**
     * Override the default expiration (millis) of URL download link.
     */
    private Long downloadLinkExpiration;
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
     * The blob operation that can be used with this component on the producer
     */
    private BlobOperationsDefinition operation = BlobOperationsDefinition.listBlobContainers;
    /**
     * Specifies the maximum size for the page blob, up to 8 TB. The page blob
     * size must be aligned to a 512-byte boundary.
     */
    private Long pageBlobSize = 512L;
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
     * Access key for the associated azure account name to be used for
     * authentication with azure blob services
     */
    private String accessKey;
    /**
     * Source Blob Access Key: for copyblob operation, sadly, we need to have an
     * accessKey for the source blob we want to copy Passing an accessKey as
     * header, it's unsafe so we could set as key.
     */
    private String sourceBlobAccessKey;

    public String getBlobName() {
        return blobName;
    }

    public void setBlobName(String blobName) {
        this.blobName = blobName;
    }

    public Long getBlobOffset() {
        return blobOffset;
    }

    public void setBlobOffset(Long blobOffset) {
        this.blobOffset = blobOffset;
    }

    public BlobType getBlobType() {
        return blobType;
    }

    public void setBlobType(BlobType blobType) {
        this.blobType = blobType;
    }

    public Boolean getCloseStreamAfterRead() {
        return closeStreamAfterRead;
    }

    public void setCloseStreamAfterRead(Boolean closeStreamAfterRead) {
        this.closeStreamAfterRead = closeStreamAfterRead;
    }

    public BlobConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(BlobConfiguration configuration) {
        this.configuration = configuration;
    }

    public StorageSharedKeyCredential getCredentials() {
        return credentials;
    }

    public void setCredentials(StorageSharedKeyCredential credentials) {
        this.credentials = credentials;
    }

    public CredentialType getCredentialType() {
        return credentialType;
    }

    public void setCredentialType(CredentialType credentialType) {
        this.credentialType = credentialType;
    }

    public Long getDataCount() {
        return dataCount;
    }

    public void setDataCount(Long dataCount) {
        this.dataCount = dataCount;
    }

    public String getFileDir() {
        return fileDir;
    }

    public void setFileDir(String fileDir) {
        this.fileDir = fileDir;
    }

    public Integer getMaxResultsPerPage() {
        return maxResultsPerPage;
    }

    public void setMaxResultsPerPage(Integer maxResultsPerPage) {
        this.maxResultsPerPage = maxResultsPerPage;
    }

    public Integer getMaxRetryRequests() {
        return maxRetryRequests;
    }

    public void setMaxRetryRequests(Integer maxRetryRequests) {
        this.maxRetryRequests = maxRetryRequests;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public BlobServiceClient getServiceClient() {
        return serviceClient;
    }

    public void setServiceClient(BlobServiceClient serviceClient) {
        this.serviceClient = serviceClient;
    }

    public Duration getTimeout() {
        return timeout;
    }

    public void setTimeout(Duration timeout) {
        this.timeout = timeout;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public Long getBlobSequenceNumber() {
        return blobSequenceNumber;
    }

    public void setBlobSequenceNumber(Long blobSequenceNumber) {
        this.blobSequenceNumber = blobSequenceNumber;
    }

    public BlockListType getBlockListType() {
        return blockListType;
    }

    public void setBlockListType(BlockListType blockListType) {
        this.blockListType = blockListType;
    }

    public Context getChangeFeedContext() {
        return changeFeedContext;
    }

    public void setChangeFeedContext(Context changeFeedContext) {
        this.changeFeedContext = changeFeedContext;
    }

    public OffsetDateTime getChangeFeedEndTime() {
        return changeFeedEndTime;
    }

    public void setChangeFeedEndTime(OffsetDateTime changeFeedEndTime) {
        this.changeFeedEndTime = changeFeedEndTime;
    }

    public OffsetDateTime getChangeFeedStartTime() {
        return changeFeedStartTime;
    }

    public void setChangeFeedStartTime(OffsetDateTime changeFeedStartTime) {
        this.changeFeedStartTime = changeFeedStartTime;
    }

    public Boolean getCloseStreamAfterWrite() {
        return closeStreamAfterWrite;
    }

    public void setCloseStreamAfterWrite(Boolean closeStreamAfterWrite) {
        this.closeStreamAfterWrite = closeStreamAfterWrite;
    }

    public Boolean getCommitBlockListLater() {
        return commitBlockListLater;
    }

    public void setCommitBlockListLater(Boolean commitBlockListLater) {
        this.commitBlockListLater = commitBlockListLater;
    }

    public Boolean getCreateAppendBlob() {
        return createAppendBlob;
    }

    public void setCreateAppendBlob(Boolean createAppendBlob) {
        this.createAppendBlob = createAppendBlob;
    }

    public Boolean getCreatePageBlob() {
        return createPageBlob;
    }

    public void setCreatePageBlob(Boolean createPageBlob) {
        this.createPageBlob = createPageBlob;
    }

    public Long getDownloadLinkExpiration() {
        return downloadLinkExpiration;
    }

    public void setDownloadLinkExpiration(Long downloadLinkExpiration) {
        this.downloadLinkExpiration = downloadLinkExpiration;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public BlobOperationsDefinition getOperation() {
        return operation;
    }

    public void setOperation(BlobOperationsDefinition operation) {
        this.operation = operation;
    }

    public Long getPageBlobSize() {
        return pageBlobSize;
    }

    public void setPageBlobSize(Long pageBlobSize) {
        this.pageBlobSize = pageBlobSize;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSourceBlobAccessKey() {
        return sourceBlobAccessKey;
    }

    public void setSourceBlobAccessKey(String sourceBlobAccessKey) {
        this.sourceBlobAccessKey = sourceBlobAccessKey;
    }
}