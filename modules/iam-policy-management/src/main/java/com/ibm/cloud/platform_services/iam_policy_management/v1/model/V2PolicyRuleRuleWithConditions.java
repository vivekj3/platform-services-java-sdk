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
package com.ibm.cloud.platform_services.iam_policy_management.v1.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Rule that specifies additional access granted (e.g., time-based condition) accross multiple conditions.
 */
public class V2PolicyRuleRuleWithConditions extends V2PolicyRule {

  /**
   * Operator to evaluate conditions.
   */
  public interface Operator {
    /** and. */
    String AND = "and";
    /** or. */
    String OR = "or";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String operator;
    private List<RuleAttribute> conditions;

    /**
     * Instantiates a new Builder from an existing V2PolicyRuleRuleWithConditions instance.
     *
     * @param v2PolicyRuleRuleWithConditions the instance to initialize the Builder with
     */
    public Builder(V2PolicyRule v2PolicyRuleRuleWithConditions) {
      this.operator = v2PolicyRuleRuleWithConditions.operator;
      this.conditions = v2PolicyRuleRuleWithConditions.conditions;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param operator the operator
     * @param conditions the conditions
     */
    public Builder(String operator, List<RuleAttribute> conditions) {
      this.operator = operator;
      this.conditions = conditions;
    }

    /**
     * Builds a V2PolicyRuleRuleWithConditions.
     *
     * @return the new V2PolicyRuleRuleWithConditions instance
     */
    public V2PolicyRuleRuleWithConditions build() {
      return new V2PolicyRuleRuleWithConditions(this);
    }

    /**
     * Adds an conditions to conditions.
     *
     * @param conditions the new conditions
     * @return the V2PolicyRuleRuleWithConditions builder
     */
    public Builder addConditions(RuleAttribute conditions) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(conditions,
        "conditions cannot be null");
      if (this.conditions == null) {
        this.conditions = new ArrayList<RuleAttribute>();
      }
      this.conditions.add(conditions);
      return this;
    }

    /**
     * Set the operator.
     *
     * @param operator the operator
     * @return the V2PolicyRuleRuleWithConditions builder
     */
    public Builder operator(String operator) {
      this.operator = operator;
      return this;
    }

    /**
     * Set the conditions.
     * Existing conditions will be replaced.
     *
     * @param conditions the conditions
     * @return the V2PolicyRuleRuleWithConditions builder
     */
    public Builder conditions(List<RuleAttribute> conditions) {
      this.conditions = conditions;
      return this;
    }
  }

  protected V2PolicyRuleRuleWithConditions() { }

  protected V2PolicyRuleRuleWithConditions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.operator,
      "operator cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.conditions,
      "conditions cannot be null");
    operator = builder.operator;
    conditions = builder.conditions;
  }

  /**
   * New builder.
   *
   * @return a V2PolicyRuleRuleWithConditions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

