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
package org.apache.camel.dataformat.any23.springboot;

import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.dataformat.any23.Any23DataFormat;
import org.apache.camel.dataformat.any23.Any23OutputFormat;
import org.apache.camel.model.PropertyDefinition;
import org.apache.camel.spring.boot.DataFormatConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Extract RDF data from HTML documents.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.dataformat.any23")
public class Any23DataFormatConfiguration
        extends
            DataFormatConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the any23 data format. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * What RDF syntax to unmarshal as, can be: NTRIPLES, TURTLE, NQUADS,
     * RDFXML, JSONLD, RDFJSON, RDF4JMODEL. It is by default: RDF4JMODEL.
     */
    private Any23OutputFormat outputFormat = Any23OutputFormat.RDF4JMODEL;
    /**
     * The URI to use as base for building RDF entities if only relative paths
     * are provided.
     */
    private String baseUri;
    /**
     * Configurations for Apache Any23 as key-value pairs in order to customize
     * the extraction process. The list of supported parameters can be found
     * here. If not provided, a default configuration is used.
     */
    private List<PropertyDefinition> configuration;
    /**
     * List of Any23 extractors to be used in the unmarshal operation. A list of
     * the available extractors can be found here here. If not provided, all the
     * available extractors are used.
     */
    private List<String> extractors;

    public Any23OutputFormat getOutputFormat() {
        return outputFormat;
    }

    public void setOutputFormat(Any23OutputFormat outputFormat) {
        this.outputFormat = outputFormat;
    }

    public String getBaseUri() {
        return baseUri;
    }

    public void setBaseUri(String baseUri) {
        this.baseUri = baseUri;
    }

    public List<PropertyDefinition> getConfiguration() {
        return configuration;
    }

    public void setConfiguration(List<PropertyDefinition> configuration) {
        this.configuration = configuration;
    }

    public List<String> getExtractors() {
        return extractors;
    }

    public void setExtractors(List<String> extractors) {
        this.extractors = extractors;
    }
}