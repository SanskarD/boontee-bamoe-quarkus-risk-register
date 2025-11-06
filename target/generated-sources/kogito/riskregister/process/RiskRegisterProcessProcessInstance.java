package riskregister.process;

import riskregister.process.RiskRegisterProcessModel;

public class RiskRegisterProcessProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<RiskRegisterProcessModel> {

    public RiskRegisterProcessProcessInstance(riskregister.process.RiskRegisterProcessProcess process, RiskRegisterProcessModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public RiskRegisterProcessProcessInstance(riskregister.process.RiskRegisterProcessProcess process, RiskRegisterProcessModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public RiskRegisterProcessProcessInstance(riskregister.process.RiskRegisterProcessProcess process, RiskRegisterProcessModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public RiskRegisterProcessProcessInstance(riskregister.process.RiskRegisterProcessProcess process, RiskRegisterProcessModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public RiskRegisterProcessProcessInstance(riskregister.process.RiskRegisterProcessProcess process, RiskRegisterProcessModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(RiskRegisterProcessModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(RiskRegisterProcessModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
