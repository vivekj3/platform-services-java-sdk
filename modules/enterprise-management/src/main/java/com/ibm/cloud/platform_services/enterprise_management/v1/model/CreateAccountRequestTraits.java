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
package com.ibm.cloud.platform_services.enterprise_management.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The traits object can be used to opt-out of Multi-Factor Authentication setting when creating a child account in the
 * enterprise. This is an optional field.
 */
public class CreateAccountRequestTraits extends GenericModel {

  protected String mfa;

  /**
   * Builder.
   */
  public static class Builder {
    private String mfa;

    /**
     * Instantiates a new Builder from an existing CreateAccountRequestTraits instance.
     *
     * @param createAccountRequestTraits the instance to initialize the Builder with
     */
    private Builder(CreateAccountRequestTraits createAccountRequestTraits) {
      this.mfa = createAccountRequestTraits.mfa;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateAccountRequestTraits.
     *
     * @return the new CreateAccountRequestTraits instance
     */
    public CreateAccountRequestTraits build() {
      return new CreateAccountRequestTraits(this);
    }

    /**
     * Set the mfa.
     *
     * @param mfa the mfa
     * @return the CreateAccountRequestTraits builder
     */
    public Builder mfa(String mfa) {
      this.mfa = mfa;
      return this;
    }
  }

  protected CreateAccountRequestTraits() { }

  protected CreateAccountRequestTraits(Builder builder) {
    mfa = builder.mfa;
  }

  /**
   * New builder.
   *
   * @return a CreateAccountRequestTraits builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the mfa.
   *
   * By default MFA will be set on the account. To opt out, pass the traits object with the mfa field set to empty
   * string.
   *
   * @return the mfa
   */
  public String mfa() {
    return mfa;
  }
}

