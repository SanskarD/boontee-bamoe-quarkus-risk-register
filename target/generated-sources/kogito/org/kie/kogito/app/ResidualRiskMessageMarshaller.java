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

public class ResidualRiskMessageMarshaller implements MessageMarshaller<riskregister.model.ResidualRisk> {

    public java.lang.Class<riskregister.model.ResidualRisk> getJavaClass() {
        return riskregister.model.ResidualRisk.class;
    }

    public String getTypeName() {
        return "org.kie.kogito.app.ResidualRisk";
    }

    public riskregister.model.ResidualRisk readFrom(ProtoStreamReader reader) throws IOException {
        riskregister.model.ResidualRisk value = new riskregister.model.ResidualRisk();
        value.setFinancialRisk(reader.readString("financialRisk"));
        value.setLikelihoodScale(reader.readString("likelihoodScale"));
        value.setReputationalRiskImpact(reader.readString("reputationalRiskImpact"));
        return value;
    }

    public void writeTo(ProtoStreamWriter writer, riskregister.model.ResidualRisk t) throws IOException {
        writer.writeString("financialRisk", t.getFinancialRisk());
        writer.writeString("likelihoodScale", t.getLikelihoodScale());
        writer.writeString("reputationalRiskImpact", t.getReputationalRiskImpact());
    }
}
