/*
 * (C) Copyright IBM Corp. 2023.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.platform_services.global_tagging.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The detachTag options.
 */
public class DetachTagOptions extends GenericModel {

  /**
   * The type of the tag. Supported values are `user`, `service` and `access`. `service` and `access` are not supported
   * for IMS resources.
   */
  public interface TagType {
    /** user. */
    String USER = "user";
    /** service. */
    String SERVICE = "service";
    /** access. */
    String ACCESS = "access";
  }

  protected List<Resource> resources;
  protected String tagName;
  protected List<String> tagNames;
  protected String transactionId;
  protected String impersonateUser;
  protected String accountId;
  protected String tagType;

  /**
   * Builder.
   */
  public static class Builder {
    private List<Resource> resources;
    private String tagName;
    private List<String> tagNames;
    private String transactionId;
    private String impersonateUser;
    private String accountId;
    private String tagType;

    /**
     * Instantiates a new Builder from an existing DetachTagOptions instance.
     *
     * @param detachTagOptions the instance to initialize the Builder with
     */
    private Builder(DetachTagOptions detachTagOptions) {
      this.resources = detachTagOptions.resources;
      this.tagName = detachTagOptions.tagName;
      this.tagNames = detachTagOptions.tagNames;
      this.transactionId = detachTagOptions.transactionId;
      this.impersonateUser = detachTagOptions.impersonateUser;
      this.accountId = detachTagOptions.accountId;
      this.tagType = detachTagOptions.tagType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param resources the resources
     */
    public Builder(List<Resource> resources) {
      this.resources = resources;
    }

    /**
     * Builds a DetachTagOptions.
     *
     * @return the new DetachTagOptions instance
     */
    public DetachTagOptions build() {
      return new DetachTagOptions(this);
    }

    /**
     * Adds an resources to resources.
     *
     * @param resources the new resources
     * @return the DetachTagOptions builder
     */
    public Builder addResources(Resource resources) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(resources,
        "resources cannot be null");
      if (this.resources == null) {
        this.resources = new ArrayList<Resource>();
      }
      this.resources.add(resources);
      return this;
    }

    /**
     * Adds an tagNames to tagNames.
     *
     * @param tagNames the new tagNames
     * @return the DetachTagOptions builder
     */
    public Builder addTagNames(String tagNames) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tagNames,
        "tagNames cannot be null");
      if (this.tagNames == null) {
        this.tagNames = new ArrayList<String>();
      }
      this.tagNames.add(tagNames);
      return this;
    }

    /**
     * Set the resources.
     * Existing resources will be replaced.
     *
     * @param resources the resources
     * @return the DetachTagOptions builder
     */
    public Builder resources(List<Resource> resources) {
      this.resources = resources;
      return this;
    }

    /**
     * Set the tagName.
     *
     * @param tagName the tagName
     * @return the DetachTagOptions builder
     */
    public Builder tagName(String tagName) {
      this.tagName = tagName;
      return this;
    }

    /**
     * Set the tagNames.
     * Existing tagNames will be replaced.
     *
     * @param tagNames the tagNames
     * @return the DetachTagOptions builder
     */
    public Builder tagNames(List<String> tagNames) {
      this.tagNames = tagNames;
      return this;
    }

    /**
     * Set the transactionId.
     *
     * @param transactionId the transactionId
     * @return the DetachTagOptions builder
     */
    public Builder transactionId(String transactionId) {
      this.transactionId = transactionId;
      return this;
    }

    /**
     * Set the impersonateUser.
     *
     * @param impersonateUser the impersonateUser
     * @return the DetachTagOptions builder
     */
    public Builder impersonateUser(String impersonateUser) {
      this.impersonateUser = impersonateUser;
      return this;
    }

    /**
     * Set the accountId.
     *
     * @param accountId the accountId
     * @return the DetachTagOptions builder
     */
    public Builder accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }

    /**
     * Set the tagType.
     *
     * @param tagType the tagType
     * @return the DetachTagOptions builder
     */
    public Builder tagType(String tagType) {
      this.tagType = tagType;
      return this;
    }
  }

  protected DetachTagOptions() { }

  protected DetachTagOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.resources,
      "resources cannot be null");
    resources = builder.resources;
    tagName = builder.tagName;
    tagNames = builder.tagNames;
    transactionId = builder.transactionId;
    impersonateUser = builder.impersonateUser;
    accountId = builder.accountId;
    tagType = builder.tagType;
  }

  /**
   * New builder.
   *
   * @return a DetachTagOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the resources.
   *
   * List of resources on which the tag or tags are detached.
   *
   * @return the resources
   */
  public List<Resource> resources() {
    return resources;
  }

  /**
   * Gets the tagName.
   *
   * The name of the tag to detach.
   *
   * @return the tagName
   */
  public String tagName() {
    return tagName;
  }

  /**
   * Gets the tagNames.
   *
   * An array of tag names to detach.
   *
   * @return the tagNames
   */
  public List<String> tagNames() {
    return tagNames;
  }

  /**
   * Gets the transactionId.
   *
   * An alphanumeric string that can be used to trace a request across services. If not specified, it automatically
   * generated with the prefix "gst-".
   *
   * @return the transactionId
   */
  public String transactionId() {
    return transactionId;
  }

  /**
   * Gets the impersonateUser.
   *
   * The user on whose behalf the detach operation must be performed (_for administrators only_).
   *
   * @return the impersonateUser
   */
  public String impersonateUser() {
    return impersonateUser;
  }

  /**
   * Gets the accountId.
   *
   * The ID of the billing account of the untagged resource.  It is a required parameter if `tag_type` is set to
   * `service`, otherwise it is inferred from the authorization IAM token.
   *
   * @return the accountId
   */
  public String accountId() {
    return accountId;
  }

  /**
   * Gets the tagType.
   *
   * The type of the tag. Supported values are `user`, `service` and `access`. `service` and `access` are not supported
   * for IMS resources.
   *
   * @return the tagType
   */
  public String tagType() {
    return tagType;
  }
}

