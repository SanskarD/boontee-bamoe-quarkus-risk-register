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

public class RiskControlMeasureMessageMarshaller implements MessageMarshaller<riskregister.model.RiskControlMeasure> {

    public java.lang.Class<riskregister.model.RiskControlMeasure> getJavaClass() {
        return riskregister.model.RiskControlMeasure.class;
    }

    public String getTypeName() {
        return "org.kie.kogito.app.RiskControlMeasure";
    }

    public riskregister.model.RiskControlMeasure readFrom(ProtoStreamReader reader) throws IOException {
        riskregister.model.RiskControlMeasure value = new riskregister.model.RiskControlMeasure();
        value.setControlDescription(reader.readString("controlDescription"));
        value.setControlDocumentationAndDisseminationRiskImpact(reader.readString("controlDocumentationAndDisseminationRiskImpact"));
        value.setControlExecutionRiskImpact(reader.readString("controlExecutionRiskImpact"));
        value.setLevelsOfControlExecutionRiskImpact(reader.readString("levelsOfControlExecutionRiskImpact"));
        value.setMonitoringPeriodicityRiskImpact(reader.readString("monitoringPeriodicityRiskImpact"));
        value.setNatureOfControlsRiskImpact(reader.readString("natureOfControlsRiskImpact"));
        return value;
    }

    public void writeTo(ProtoStreamWriter writer, riskregister.model.RiskControlMeasure t) throws IOException {
        writer.writeString("controlDescription", t.getControlDescription());
        writer.writeString("controlDocumentationAndDisseminationRiskImpact", t.getControlDocumentationAndDisseminationRiskImpact());
        writer.writeString("controlExecutionRiskImpact", t.getControlExecutionRiskImpact());
        writer.writeString("levelsOfControlExecutionRiskImpact", t.getLevelsOfControlExecutionRiskImpact());
        writer.writeString("monitoringPeriodicityRiskImpact", t.getMonitoringPeriodicityRiskImpact());
        writer.writeString("natureOfControlsRiskImpact", t.getNatureOfControlsRiskImpact());
    }
}
