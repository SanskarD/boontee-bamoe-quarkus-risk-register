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
package org.kie.kogito.app;

import java.io.IOException;
import org.infinispan.protostream.MessageMarshaller;

public class PrimaryRiskInfoMessageMarshaller implements MessageMarshaller<riskregister.model.PrimaryRiskInfo> {

    public java.lang.Class<riskregister.model.PrimaryRiskInfo> getJavaClass() {
        return riskregister.model.PrimaryRiskInfo.class;
    }

    public String getTypeName() {
        return "org.kie.kogito.app.PrimaryRiskInfo";
    }

    public riskregister.model.PrimaryRiskInfo readFrom(ProtoStreamReader reader) throws IOException {
        riskregister.model.PrimaryRiskInfo value = new riskregister.model.PrimaryRiskInfo();
        value.setDepartment(reader.readString("department"));
        value.setDivision(reader.readString("division"));
        value.setFinancialYear((java.time.LocalDate) (reader.readObject("financialYear", java.io.Serializable.class)));
        value.setObjectiveOfProcess(reader.readString("objectiveOfProcess"));
        value.setProcessName(reader.readString("processName"));
        value.setProcessType(reader.readString("processType"));
        value.setRiskDescriptionPerceivedInherentRisk(reader.readString("riskDescriptionPerceivedInherentRisk"));
        value.setRiskReportedBy(reader.readString("riskReportedBy"));
        return value;
    }

    public void writeTo(ProtoStreamWriter writer, riskregister.model.PrimaryRiskInfo t) throws IOException {
        writer.writeString("department", t.getDepartment());
        writer.writeString("division", t.getDivision());
        writer.writeObject("financialYear", (java.time.LocalDate) (t.getFinancialYear()), java.io.Serializable.class);
        writer.writeString("objectiveOfProcess", t.getObjectiveOfProcess());
        writer.writeString("processName", t.getProcessName());
        writer.writeString("processType", t.getProcessType());
        writer.writeString("riskDescriptionPerceivedInherentRisk", t.getRiskDescriptionPerceivedInherentRisk());
        writer.writeString("riskReportedBy", t.getRiskReportedBy());
    }
}
