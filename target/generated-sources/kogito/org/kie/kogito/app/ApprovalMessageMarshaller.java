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

public class ApprovalMessageMarshaller implements MessageMarshaller<riskregister.model.Approval> {

    public java.lang.Class<riskregister.model.Approval> getJavaClass() {
        return riskregister.model.Approval.class;
    }

    public String getTypeName() {
        return "org.kie.kogito.app.Approval";
    }

    public riskregister.model.Approval readFrom(ProtoStreamReader reader) throws IOException {
        riskregister.model.Approval value = new riskregister.model.Approval();
        value.setComment(reader.readString("comment"));
        value.setDate(reader.readObject("date", java.util.Date.class));
        value.setStatus(reader.readString("status"));
        value.setUserId(reader.readString("userId"));
        return value;
    }

    public void writeTo(ProtoStreamWriter writer, riskregister.model.Approval t) throws IOException {
        writer.writeString("comment", t.getComment());
        writer.writeObject("date", t.getDate(), java.util.Date.class);
        writer.writeString("status", t.getStatus());
        writer.writeString("userId", t.getUserId());
    }
}
