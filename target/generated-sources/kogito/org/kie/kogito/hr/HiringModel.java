/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.kie.kogito.hr;

import org.kie.kogito.MapInput;
import org.kie.kogito.MapInputId;
import org.kie.kogito.MapOutput;
import java.util.Map;
import java.util.HashMap;
import org.kie.kogito.MappableToModel;
import org.kie.kogito.Model;

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "hiring", name = "Hiring", hidden = false)
public class HiringModel implements org.kie.kogito.Model, MapInput, MapInputId, MapOutput, MappableToModel<HiringModelOutput> {

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "output")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "offer")
    @jakarta.validation.Valid()
    private java.lang.Integer offer;

    public java.lang.Integer getOffer() {
        return offer;
    }

    public void setOffer(java.lang.Integer offer) {
        this.offer = offer;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "input")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "skills")
    @jakarta.validation.Valid()
    private java.lang.String skills;

    public java.lang.String getSkills() {
        return skills;
    }

    public void setSkills(java.lang.String skills) {
        this.skills = skills;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "input")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "candidate")
    @jakarta.validation.Valid()
    private java.lang.String candidate;

    public java.lang.String getCandidate() {
        return candidate;
    }

    public void setCandidate(java.lang.String candidate) {
        this.candidate = candidate;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "output")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "bonus")
    @jakarta.validation.Valid()
    private java.lang.Integer bonus;

    public java.lang.Integer getBonus() {
        return bonus;
    }

    public void setBonus(java.lang.Integer bonus) {
        this.bonus = bonus;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "itGroup")
    @jakarta.validation.Valid()
    private java.lang.String itGroup;

    public java.lang.String getItGroup() {
        return itGroup;
    }

    public void setItGroup(java.lang.String itGroup) {
        this.itGroup = itGroup;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "hrGroup")
    @jakarta.validation.Valid()
    private java.lang.String hrGroup;

    public java.lang.String getHrGroup() {
        return hrGroup;
    }

    public void setHrGroup(java.lang.String hrGroup) {
        this.hrGroup = hrGroup;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "input")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "experience")
    @jakarta.validation.Valid()
    private java.lang.Integer experience;

    public java.lang.Integer getExperience() {
        return experience;
    }

    public void setExperience(java.lang.Integer experience) {
        this.experience = experience;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "output")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "category")
    @jakarta.validation.Valid()
    private java.lang.String category;

    public java.lang.String getCategory() {
        return category;
    }

    public void setCategory(java.lang.String category) {
        this.category = category;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "output")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "salary")
    @jakarta.validation.Valid()
    private java.lang.Integer salary;

    public java.lang.Integer getSalary() {
        return salary;
    }

    public void setSalary(java.lang.Integer salary) {
        this.salary = salary;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "user")
    @jakarta.validation.Valid()
    private java.lang.String user;

    public java.lang.String getUser() {
        return user;
    }

    public void setUser(java.lang.String user) {
        this.user = user;
    }

    @Override()
    public HiringModelOutput toModel() {
        HiringModelOutput result = new HiringModelOutput();
        result.setId(getId());
        result.setOffer(getOffer());
        result.setBonus(getBonus());
        result.setItGroup(getItGroup());
        result.setHrGroup(getHrGroup());
        result.setCategory(getCategory());
        result.setSalary(getSalary());
        result.setUser(getUser());
        return result;
    }
}
