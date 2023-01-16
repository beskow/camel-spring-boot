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
package org.apache.camel.language.tokenizer.springboot;

import org.apache.camel.spring.boot.LanguageConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Tokenize text payloads using delimiter patterns.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.language.tokenize")
public class TokenizeLanguageConfiguration
        extends
            LanguageConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the tokenize language. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Sets the delimiter to use when grouping. If this has not been set then
     * token will be used as the delimiter.
     */
    private String groupDelimiter;
    /**
     * Name of property to use as input, instead of the message body. It has a
     * lower precedent than the headerName if both are set.
     */
    private String propertyName;
    /**
     * Whether to trim the value to remove leading and trailing whitespaces and
     * line breaks
     */
    private Boolean trim = true;

    public String getGroupDelimiter() {
        return groupDelimiter;
    }

    public void setGroupDelimiter(String groupDelimiter) {
        this.groupDelimiter = groupDelimiter;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public Boolean getTrim() {
        return trim;
    }

    public void setTrim(Boolean trim) {
        this.trim = trim;
    }
}