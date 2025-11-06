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

public class RiskRegisterMessageMarshaller implements MessageMarshaller<riskregister.model.RiskRegister> {

    public java.lang.Class<riskregister.model.RiskRegister> getJavaClass() {
        return riskregister.model.RiskRegister.class;
    }

    public String getTypeName() {
        return "org.kie.kogito.app.RiskRegister";
    }

    public riskregister.model.RiskRegister readFrom(ProtoStreamReader reader) throws IOException {
        riskregister.model.RiskRegister value = new riskregister.model.RiskRegister();
        value.setPrimaryRiskInfo(reader.readObject("primaryRiskInfo", riskregister.model.PrimaryRiskInfo.class));
        value.setReason(reader.readObject("reason", riskregister.model.Reason.class));
        value.setResidualRisk(reader.readObject("residualRisk", riskregister.model.ResidualRisk.class));
        value.setRiskCategory(reader.readObject("riskCategory", riskregister.model.RiskCategory.class));
        value.setRiskControlMeasure(reader.readObject("riskControlMeasure", riskregister.model.RiskControlMeasure.class));
        return value;
    }

    public void writeTo(ProtoStreamWriter writer, riskregister.model.RiskRegister t) throws IOException {
        writer.writeObject("primaryRiskInfo", t.getPrimaryRiskInfo(), riskregister.model.PrimaryRiskInfo.class);
        writer.writeObject("reason", t.getReason(), riskregister.model.Reason.class);
        writer.writeObject("residualRisk", t.getResidualRisk(), riskregister.model.ResidualRisk.class);
        writer.writeObject("riskCategory", t.getRiskCategory(), riskregister.model.RiskCategory.class);
        writer.writeObject("riskControlMeasure", t.getRiskControlMeasure(), riskregister.model.RiskControlMeasure.class);
    }
}
