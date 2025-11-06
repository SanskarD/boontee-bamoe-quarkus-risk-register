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

import org.kie.kogito.process.workitem.TaskModel;

public class RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskModel implements TaskModel<riskregister.process.RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskInput, riskregister.process.RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskOutput> {

    private String id;

    private String name;

    private int state;

    private String phase;

    private String phaseStatus;

    private riskregister.process.RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskInput parameters;

    private riskregister.process.RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskOutput results;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getPhaseStatus() {
        return phaseStatus;
    }

    public void setPhaseStatus(String phaseStatus) {
        this.phaseStatus = phaseStatus;
    }

    public riskregister.process.RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskInput getParameters() {
        return parameters;
    }

    public void setParameters(riskregister.process.RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskInput parameters) {
        this.parameters = parameters;
    }

    public riskregister.process.RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskOutput getResults() {
        return results;
    }

    public void setParams(riskregister.process.RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskOutput results) {
        this.results = results;
    }

    public static riskregister.process.RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskModel from(org.kie.kogito.process.WorkItem workItem) {
        riskregister.process.RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskModel taskModel = new riskregister.process.RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskModel();
        taskModel.id = workItem.getId();
        taskModel.name = workItem.getName();
        taskModel.state = workItem.getState();
        taskModel.phaseStatus = workItem.getPhaseStatus();
        taskModel.phase = workItem.getPhase();
        taskModel.parameters = riskregister.process.RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskInput.fromMap(workItem.getParameters());
        taskModel.results = riskregister.process.RiskRegisterProcess__86C40E52_AF78_4A55_BD9A_1FA862FAAEA6_TaskOutput.fromMap(workItem.getResults());
        return taskModel;
    }
}
//Task model for user task 'HOD Approve' in process 'RiskRegisterProcess'
