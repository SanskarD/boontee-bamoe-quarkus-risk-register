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

public class RiskCategoryMessageMarshaller implements MessageMarshaller<riskregister.model.RiskCategory> {

    public java.lang.Class<riskregister.model.RiskCategory> getJavaClass() {
        return riskregister.model.RiskCategory.class;
    }

    public String getTypeName() {
        return "org.kie.kogito.app.RiskCategory";
    }

    public riskregister.model.RiskCategory readFrom(ProtoStreamReader reader) throws IOException {
        riskregister.model.RiskCategory value = new riskregister.model.RiskCategory();
        value.setBusinessDisruptionRisk(reader.readString("businessDisruptionRisk"));
        value.setCause(reader.readString("cause"));
        value.setCauseSubClassification(reader.readString("causeSubClassification"));
        value.setFinancialRiskImpact(reader.readString("financialRiskImpact"));
        value.setLikelihoodScale(reader.readString("likelihoodScale"));
        value.setReputationRiskImpact(reader.readString("reputationRiskImpact"));
        value.setType(reader.readCollection("type", new java.util.ArrayList(), String.class));
        return value;
    }

    public void writeTo(ProtoStreamWriter writer, riskregister.model.RiskCategory t) throws IOException {
        writer.writeString("businessDisruptionRisk", t.getBusinessDisruptionRisk());
        writer.writeString("cause", t.getCause());
        writer.writeString("causeSubClassification", t.getCauseSubClassification());
        writer.writeString("financialRiskImpact", t.getFinancialRiskImpact());
        writer.writeString("likelihoodScale", t.getLikelihoodScale());
        writer.writeString("reputationRiskImpact", t.getReputationRiskImpact());
        writer.writeCollection("type", t.getType(), String.class);
    }
}
