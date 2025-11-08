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
package riskregister.process;

import org.kie.kogito.MapInput;
import org.kie.kogito.MapInputId;
import org.kie.kogito.MapOutput;
import java.util.Map;
import java.util.HashMap;
import org.kie.kogito.MappableToModel;
import org.kie.kogito.Model;
import org.kie.kogito.ProcessInput;

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "RiskRegisterProcess", name = "RiskRegisterProcess", hidden = true)
@ProcessInput(processName = "RiskRegisterProcess")
public class RiskRegisterProcessModelInput implements Model, MapInput, MapInputId, MapOutput, MappableToModel<RiskRegisterProcessModel> {

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "reason")
    @jakarta.validation.Valid()
    private riskregister.model.Reason reason;

    public riskregister.model.Reason getReason() {
        return reason;
    }

    public void setReason(riskregister.model.Reason reason) {
        this.reason = reason;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "sroUsers")
    @jakarta.validation.Valid()
    private java.lang.String sroUsers;

    public java.lang.String getSroUsers() {
        return sroUsers;
    }

    public void setSroUsers(java.lang.String sroUsers) {
        this.sroUsers = sroUsers;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "riskRegister")
    @jakarta.validation.Valid()
    private riskregister.model.RiskRegister riskRegister;

    public riskregister.model.RiskRegister getRiskRegister() {
        return riskRegister;
    }

    public void setRiskRegister(riskregister.model.RiskRegister riskRegister) {
        this.riskRegister = riskRegister;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "riskControlMeasure")
    @jakarta.validation.Valid()
    private riskregister.model.RiskControlMeasure riskControlMeasure;

    public riskregister.model.RiskControlMeasure getRiskControlMeasure() {
        return riskControlMeasure;
    }

    public void setRiskControlMeasure(riskregister.model.RiskControlMeasure riskControlMeasure) {
        this.riskControlMeasure = riskControlMeasure;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "residualRisk")
    @jakarta.validation.Valid()
    private riskregister.model.ResidualRisk residualRisk;

    public riskregister.model.ResidualRisk getResidualRisk() {
        return residualRisk;
    }

    public void setResidualRisk(riskregister.model.ResidualRisk residualRisk) {
        this.residualRisk = residualRisk;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "approval")
    @jakarta.validation.Valid()
    private riskregister.model.Approval approval;

    public riskregister.model.Approval getApproval() {
        return approval;
    }

    public void setApproval(riskregister.model.Approval approval) {
        this.approval = approval;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "rmdUsers")
    @jakarta.validation.Valid()
    private java.lang.String rmdUsers;

    public java.lang.String getRmdUsers() {
        return rmdUsers;
    }

    public void setRmdUsers(java.lang.String rmdUsers) {
        this.rmdUsers = rmdUsers;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "divHeadUsers")
    @jakarta.validation.Valid()
    private java.lang.String divHeadUsers;

    public java.lang.String getDivHeadUsers() {
        return divHeadUsers;
    }

    public void setDivHeadUsers(java.lang.String divHeadUsers) {
        this.divHeadUsers = divHeadUsers;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "jroUsers")
    @jakarta.validation.Valid()
    private java.lang.String jroUsers;

    public java.lang.String getJroUsers() {
        return jroUsers;
    }

    public void setJroUsers(java.lang.String jroUsers) {
        this.jroUsers = jroUsers;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "riskCategory")
    @jakarta.validation.Valid()
    private riskregister.model.RiskCategory riskCategory;

    public riskregister.model.RiskCategory getRiskCategory() {
        return riskCategory;
    }

    public void setRiskCategory(riskregister.model.RiskCategory riskCategory) {
        this.riskCategory = riskCategory;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "primaryRiskInfo")
    @jakarta.validation.Valid()
    private riskregister.model.PrimaryRiskInfo primaryRiskInfo;

    public riskregister.model.PrimaryRiskInfo getPrimaryRiskInfo() {
        return primaryRiskInfo;
    }

    public void setPrimaryRiskInfo(riskregister.model.PrimaryRiskInfo primaryRiskInfo) {
        this.primaryRiskInfo = primaryRiskInfo;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "makerUser")
    @jakarta.validation.Valid()
    private java.lang.String makerUser;

    public java.lang.String getMakerUser() {
        return makerUser;
    }

    public void setMakerUser(java.lang.String makerUser) {
        this.makerUser = makerUser;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "approvalLog")
    @jakarta.validation.Valid()
    private riskregister.model.ApprovalLog approvalLog;

    public riskregister.model.ApprovalLog getApprovalLog() {
        return approvalLog;
    }

    public void setApprovalLog(riskregister.model.ApprovalLog approvalLog) {
        this.approvalLog = approvalLog;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "divHeadUserGroup")
    @jakarta.validation.Valid()
    private java.lang.String divHeadUserGroup;

    public java.lang.String getDivHeadUserGroup() {
        return divHeadUserGroup;
    }

    public void setDivHeadUserGroup(java.lang.String divHeadUserGroup) {
        this.divHeadUserGroup = divHeadUserGroup;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "hodUsers")
    @jakarta.validation.Valid()
    private java.lang.String hodUsers;

    public java.lang.String getHodUsers() {
        return hodUsers;
    }

    public void setHodUsers(java.lang.String hodUsers) {
        this.hodUsers = hodUsers;
    }

    @Override()
    public RiskRegisterProcessModel toModel() {
        RiskRegisterProcessModel result = new RiskRegisterProcessModel();
        result.setReason(getReason());
        result.setSroUsers(getSroUsers());
        result.setRiskRegister(getRiskRegister());
        result.setRiskControlMeasure(getRiskControlMeasure());
        result.setResidualRisk(getResidualRisk());
        result.setApproval(getApproval());
        result.setRmdUsers(getRmdUsers());
        result.setDivHeadUsers(getDivHeadUsers());
        result.setJroUsers(getJroUsers());
        result.setRiskCategory(getRiskCategory());
        result.setPrimaryRiskInfo(getPrimaryRiskInfo());
        result.setMakerUser(getMakerUser());
        result.setApprovalLog(getApprovalLog());
        result.setDivHeadUserGroup(getDivHeadUserGroup());
        result.setHodUsers(getHodUsers());
        return result;
    }
}
