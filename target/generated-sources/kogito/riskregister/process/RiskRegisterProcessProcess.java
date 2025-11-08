package riskregister.process;

import riskregister.process.RiskRegisterProcessModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.StringDataType;

@jakarta.enterprise.context.ApplicationScoped()
@jakarta.inject.Named("RiskRegisterProcess")
@io.quarkus.runtime.Startup()
public class RiskRegisterProcessProcess extends org.kie.kogito.process.impl.AbstractProcess<riskregister.process.RiskRegisterProcessModel> {

    @jakarta.inject.Inject()
    public RiskRegisterProcessProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.process.ProcessInstancesFactory factory) {
        super(app, java.util.Arrays.asList(), correlations, factory);
        activate();
    }

    public RiskRegisterProcessProcess() {
    }

    @Override()
    public riskregister.process.RiskRegisterProcessProcessInstance createInstance(riskregister.process.RiskRegisterProcessModel value) {
        return new riskregister.process.RiskRegisterProcessProcessInstance(this, value, this.createProcessRuntime());
    }

    public riskregister.process.RiskRegisterProcessProcessInstance createInstance(java.lang.String businessKey, riskregister.process.RiskRegisterProcessModel value) {
        return new riskregister.process.RiskRegisterProcessProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public riskregister.process.RiskRegisterProcessProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, riskregister.process.RiskRegisterProcessModel value) {
        return new riskregister.process.RiskRegisterProcessProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public riskregister.process.RiskRegisterProcessModel createModel() {
        return new riskregister.process.RiskRegisterProcessModel();
    }

    public riskregister.process.RiskRegisterProcessProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((riskregister.process.RiskRegisterProcessModel) value);
    }

    public riskregister.process.RiskRegisterProcessProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (riskregister.process.RiskRegisterProcessModel) value);
    }

    public riskregister.process.RiskRegisterProcessProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new riskregister.process.RiskRegisterProcessProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public riskregister.process.RiskRegisterProcessProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new riskregister.process.RiskRegisterProcessProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("RiskRegisterProcess", true);
        factory.variable("riskRegister", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(riskregister.model.RiskRegister.class), java.util.Map.of("riskRegister", "riskRegister", "_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "ItemSubjectRef", "_4517EF33-52BA-4429-A6E1-BEBCA977125F"));
        factory.variable("primaryRiskInfo", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(riskregister.model.PrimaryRiskInfo.class), java.util.Map.of("primaryRiskInfo", "primaryRiskInfo", "_9C76E890-16B7-413F-B9F9-7E697E5B70BF", "primaryRiskInfo", "ItemSubjectRef", "_6C5D2510-468F-414A-91AE-9A6FE97734D6"));
        factory.variable("riskCategory", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(riskregister.model.RiskCategory.class), java.util.Map.of("_3FE9C905-0BBB-4887-A55A-8ACA062BFDDC", "riskCategory", "riskCategory", "riskCategory", "ItemSubjectRef", "_DD40C460-10C4-479D-B82D-A47C168BF80F"));
        factory.variable("riskControlMeasure", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(riskregister.model.RiskControlMeasure.class), java.util.Map.of("riskControlMeasure", "riskControlMeasure", "_D3C41DB6-FF52-4AAA-940E-736542D25E51", "riskControlMeasure", "ItemSubjectRef", "_3D8E57F5-4029-433D-BBA4-0C4C64A25508"));
        factory.variable("residualRisk", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(riskregister.model.ResidualRisk.class), java.util.Map.of("residualRisk", "residualRisk", "_5AE2C049-B662-40F1-BB9B-C123791BE862", "residualRisk", "ItemSubjectRef", "_9E8FE320-7D52-4511-8FF0-17EE5A6EA9A2"));
        factory.variable("reason", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(riskregister.model.Reason.class), java.util.Map.of("reason", "reason", "_F50B470E-A136-400F-B0AB-470F379C5941", "reason", "ItemSubjectRef", "_88DD4321-FBB6-4DB2-A055-BFD41CA97E41"));
        factory.variable("approval", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(riskregister.model.Approval.class), java.util.Map.of("_A6159B32-ED0E-40A1-8858-D1B7078B9F56", "approval", "approval", "approval", "ItemSubjectRef", "_53523FEA-307E-48B1-9B92-0057F604F3EA"));
        factory.variable("approvalLog", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(riskregister.model.ApprovalLog.class), java.util.Map.of("_023FA8AB-B545-4B0C-833C-A8BAEAD733F7", "approvalLog", "approvalLog", "approvalLog", "ItemSubjectRef", "_F61432FD-5A02-4136-AD4D-B7123B649869"));
        factory.variable("divHeadUserGroup", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("divHeadUserGroup", "divHeadUserGroup", "_6C762736-9461-4A3F-BA68-E211AF240896", "divHeadUserGroup", "ItemSubjectRef", "_6465BB5A-04FD-4D1C-BDAA-0ADF8B3FB4B2"));
        factory.variable("divHeadUsers", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("divHeadUsers", "divHeadUsers", "_A9BBE1F9-5046-46A3-A8DF-7969CD6929F5", "divHeadUsers", "ItemSubjectRef", "_6465BB5A-04FD-4D1C-BDAA-0ADF8B3FB4B2"));
        factory.variable("makerUser", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("makerUser", "makerUser", "ItemSubjectRef", "_6465BB5A-04FD-4D1C-BDAA-0ADF8B3FB4B2", "_0A69832C-F1E9-4BB1-BAAD-6CFAE72FCAB0", "makerUser"));
        factory.variable("jroUsers", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("jroUsers", "jroUsers", "_DCABA936-4C64-40B0-BFF0-6904A9C3F6C9", "jroUsers", "ItemSubjectRef", "_6465BB5A-04FD-4D1C-BDAA-0ADF8B3FB4B2"));
        factory.variable("sroUsers", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("sroUsers", "sroUsers", "_4C10A397-C411-48BF-8311-3E2C69A94CD5", "sroUsers", "ItemSubjectRef", "_6465BB5A-04FD-4D1C-BDAA-0ADF8B3FB4B2"));
        factory.variable("hodUsers", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("_688820A6-CDE1-4A90-BBD4-73B501638AF3", "hodUsers", "hodUsers", "hodUsers", "ItemSubjectRef", "_6465BB5A-04FD-4D1C-BDAA-0ADF8B3FB4B2"));
        factory.variable("rmdUsers", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("_00199562-25E4-4250-8DB7-2C443F615D58", "rmdUsers", "rmdUsers", "rmdUsers", "ItemSubjectRef", "_6465BB5A-04FD-4D1C-BDAA-0ADF8B3FB4B2"));
        factory.name("RiskRegisterProcess");
        factory.packageName("riskregister.process");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("jbpm.enable.multi.con", null);
        factory.metaData("jbpm.transactions.enable", "true");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_B11A0D64_CFF4_4698_A0E7_B49B918B525C = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B11A0D64-CFF4-4698-A0E7-B49B918B525C"));
        endNode_B11A0D64_CFF4_4698_A0E7_B49B918B525C.name("End");
        endNode_B11A0D64_CFF4_4698_A0E7_B49B918B525C.terminate(false);
        endNode_B11A0D64_CFF4_4698_A0E7_B49B918B525C.metaData("UniqueId", "_B11A0D64-CFF4-4698-A0E7-B49B918B525C");
        endNode_B11A0D64_CFF4_4698_A0E7_B49B918B525C.metaData("Lane", "RMD");
        endNode_B11A0D64_CFF4_4698_A0E7_B49B918B525C.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3 = factory.splitNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_9477168A-A2C7-4290-A4E2-BAC5F30BB0F3"));
        splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3.name("Need Correction?");
        splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3.type(2);
        splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3.metaData("UniqueId", "_9477168A-A2C7-4290-A4E2-BAC5F30BB0F3");
        splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3.metaData("elementname", "Need Correction?");
        splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3.metaData("Default", "_4FA8CE12-E261-4A07-A2F3-F01C39CA2C7A");
        splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E82B11A3-F055-4091-AB9E-6869B67ACE6E"), "_4FA8CE12-E261-4A07-A2F3-F01C39CA2C7A", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator(""), 0, true);
        splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_18F8C933-387A-41A7-A7C0-BFB670B66BF1"), "_965D5D98-4199-4BFA-A4B9-9C4B5DC8B6A2", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator("return !approval.getStatus().equalsIgnoreCase(\"APPROVE\");"), 0, false);
        splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3.done();
        splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E82B11A3-F055-4091-AB9E-6869B67ACE6E"), "_4FA8CE12-E261-4A07-A2F3-F01C39CA2C7A", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator(""), 0, true);
        splitNode_9477168A_A2C7_4290_A4E2_BAC5F30BB0F3.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_18F8C933-387A-41A7-A7C0-BFB670B66BF1"), "_965D5D98-4199-4BFA-A4B9-9C4B5DC8B6A2", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator("return !approval.getStatus().equalsIgnoreCase(\"APPROVE\");"), 0, false);
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456 = factory.splitNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F8071055-52F6-4F5D-BE9E-00C51CC97456"));
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.name("Need Correction?");
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.type(2);
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.metaData("UniqueId", "_F8071055-52F6-4F5D-BE9E-00C51CC97456");
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.metaData("elementname", "Need Correction?");
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.metaData("Default", "_2A630041-EB7E-4471-83AC-2E51204405EE");
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1C18E257-48C8-4832-91D9-C1FCC57190C5"), "_2A630041-EB7E-4471-83AC-2E51204405EE", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator(""), 0, true);
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A73C6F1E-9D94-4734-8B96-6C413A67B347"), "_BFB8D2DF-5878-49D3-B39D-FCCEE7647AFF", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator("return !approval.getStatus().equalsIgnoreCase(\"APPROVE\");"), 0, false);
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.done();
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1C18E257-48C8-4832-91D9-C1FCC57190C5"), "_2A630041-EB7E-4471-83AC-2E51204405EE", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator(""), 0, true);
        splitNode_F8071055_52F6_4F5D_BE9E_00C51CC97456.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A73C6F1E-9D94-4734-8B96-6C413A67B347"), "_BFB8D2DF-5878-49D3-B39D-FCCEE7647AFF", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator("return !approval.getStatus().equalsIgnoreCase(\"APPROVE\");"), 0, false);
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051 = factory.splitNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B1CA7113-6053-4EB8-A714-F214C0D1E051"));
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.name("Need Correction?");
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.type(2);
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.metaData("UniqueId", "_B1CA7113-6053-4EB8-A714-F214C0D1E051");
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.metaData("elementname", "Need Correction?");
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.metaData("Default", "_6199D120-2BA1-42FC-81F7-ADD5DB41EBD0");
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F222CB4E-A07A-409D-9F65-AC1790C5293F"), "_3D88550D-81D4-4256-90D2-49E5EBAC4C54", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator("return !approval.getStatus().equalsIgnoreCase(\"APPROVE\");"), 0, false);
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_86C40E52-AF78-4A55-BD9A-1FA862FAAEA6"), "_6199D120-2BA1-42FC-81F7-ADD5DB41EBD0", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator(""), 0, true);
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.done();
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F222CB4E-A07A-409D-9F65-AC1790C5293F"), "_3D88550D-81D4-4256-90D2-49E5EBAC4C54", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator("return !approval.getStatus().equalsIgnoreCase(\"APPROVE\");"), 0, false);
        splitNode_B1CA7113_6053_4EB8_A714_F214C0D1E051.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_86C40E52-AF78-4A55-BD9A-1FA862FAAEA6"), "_6199D120-2BA1-42FC-81F7-ADD5DB41EBD0", "DROOLS_DEFAULT", "mvel", new org.jbpm.process.instance.impl.MVELInterpretedReturnValueEvaluator(""), 0, true);
        org.jbpm.ruleflow.core.factory.JoinFactory<?> joinNode_83ECC640_A7A7_4CE0_914C_D9FBA3CD0928 = factory.joinNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_83ECC640-A7A7-4CE0-914C-D9FBA3CD0928"));
        joinNode_83ECC640_A7A7_4CE0_914C_D9FBA3CD0928.name("Join");
        joinNode_83ECC640_A7A7_4CE0_914C_D9FBA3CD0928.type(2);
        joinNode_83ECC640_A7A7_4CE0_914C_D9FBA3CD0928.metaData("UniqueId", "_83ECC640-A7A7-4CE0-914C-D9FBA3CD0928");
        joinNode_83ECC640_A7A7_4CE0_914C_D9FBA3CD0928.metaData("Lane", "Maker");
        joinNode_83ECC640_A7A7_4CE0_914C_D9FBA3CD0928.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_18F8C933_387A_41A7_A7C0_BFB670B66BF1 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_18F8C933-387A-41A7-A7C0-BFB670B66BF1"));
        actionNode_18F8C933_387A_41A7_A7C0_BFB670B66BF1.name("Mark Process for Review");
        actionNode_18F8C933_387A_41A7_A7C0_BFB670B66BF1.metaData("UniqueId", "_18F8C933-387A-41A7-A7C0-BFB670B66BF1");
        actionNode_18F8C933_387A_41A7_A7C0_BFB670B66BF1.metaData("NodeType", "ScriptTask");
        actionNode_18F8C933_387A_41A7_A7C0_BFB670B66BF1.metaData("Lane", "Divisional Head");
        actionNode_18F8C933_387A_41A7_A7C0_BFB670B66BF1.action(kcontext -> {
        });
        actionNode_18F8C933_387A_41A7_A7C0_BFB670B66BF1.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_A73C6F1E_9D94_4734_8B96_6C413A67B347 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A73C6F1E-9D94-4734-8B96-6C413A67B347"));
        actionNode_A73C6F1E_9D94_4734_8B96_6C413A67B347.name("Mark Process for Review");
        actionNode_A73C6F1E_9D94_4734_8B96_6C413A67B347.metaData("UniqueId", "_A73C6F1E-9D94-4734-8B96-6C413A67B347");
        actionNode_A73C6F1E_9D94_4734_8B96_6C413A67B347.metaData("NodeType", "ScriptTask");
        actionNode_A73C6F1E_9D94_4734_8B96_6C413A67B347.action(kcontext -> {
        });
        actionNode_A73C6F1E_9D94_4734_8B96_6C413A67B347.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_F222CB4E_A07A_409D_9F65_AC1790C5293F = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F222CB4E-A07A-409D-9F65-AC1790C5293F"));
        actionNode_F222CB4E_A07A_409D_9F65_AC1790C5293F.name("Mark Process for Review");
        actionNode_F222CB4E_A07A_409D_9F65_AC1790C5293F.metaData("UniqueId", "_F222CB4E-A07A-409D-9F65-AC1790C5293F");
        actionNode_F222CB4E_A07A_409D_9F65_AC1790C5293F.metaData("NodeType", "ScriptTask");
        actionNode_F222CB4E_A07A_409D_9F65_AC1790C5293F.action(kcontext -> {
        });
        actionNode_F222CB4E_A07A_409D_9F65_AC1790C5293F.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_B0D002C4_2DFE_4F34_B75D_D684C307014D = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B0D002C4-2DFE-4F34-B75D-D684C307014D"));
        actionNode_B0D002C4_2DFE_4F34_B75D_D684C307014D.name("Assign Approvers");
        actionNode_B0D002C4_2DFE_4F34_B75D_D684C307014D.metaData("UniqueId", "_B0D002C4-2DFE-4F34-B75D-D684C307014D");
        actionNode_B0D002C4_2DFE_4F34_B75D_D684C307014D.metaData("NodeType", "ScriptTask");
        actionNode_B0D002C4_2DFE_4F34_B75D_D684C307014D.action(kcontext -> {
            java.lang.String divHeadUserGroup = (java.lang.String) kcontext.getVariable("divHeadUserGroup");
            java.lang.String divHeadUsers = (java.lang.String) kcontext.getVariable("divHeadUsers");
            java.lang.String makerUser = (java.lang.String) kcontext.getVariable("makerUser");
            java.lang.String jroUsers = (java.lang.String) kcontext.getVariable("jroUsers");
            java.lang.String sroUsers = (java.lang.String) kcontext.getVariable("sroUsers");
            java.lang.String hodUsers = (java.lang.String) kcontext.getVariable("hodUsers");
            java.lang.String rmdUsers = (java.lang.String) kcontext.getVariable("rmdUsers");
            makerUser = "div1_maker1";
            divHeadUserGroup = "DIV1_HEAD";
            if (makerUser.contains("div1")) {
                divHeadUsers = "div1_head1,div1_head2";
            } else if (makerUser.contains("div2")) {
                divHeadUsers = "div2_head1,div2_head2";
            } else if (makerUser.contains("div3")) {
                divHeadUsers = "div3_head1,div3_head2";
            }
            kcontext.setVariable("divHeadUsers", divHeadUsers);
            kcontext.setVariable("divHeadUserGroup", divHeadUserGroup);
            kcontext.setVariable("sroUsers", "sro1,sro2");
            kcontext.setVariable("jroUsers", "jro1,jro2");
            kcontext.setVariable("hodUsers", "hod1,hod2");
            kcontext.setVariable("rmdUsers", "rmd1,rmd2");
        });
        actionNode_B0D002C4_2DFE_4F34_B75D_D684C307014D.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode_F37DF12F_2C90_4492_BB4F_102047D35890 = factory.startNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F37DF12F-2C90-4492-BB4F-102047D35890"));
        startNode_F37DF12F_2C90_4492_BB4F_102047D35890.name("Start");
        startNode_F37DF12F_2C90_4492_BB4F_102047D35890.interrupting(false);
        startNode_F37DF12F_2C90_4492_BB4F_102047D35890.metaData("UniqueId", "_F37DF12F-2C90-4492-BB4F-102047D35890");
        startNode_F37DF12F_2C90_4492_BB4F_102047D35890.metaData("EventType", "none");
        startNode_F37DF12F_2C90_4492_BB4F_102047D35890.done();
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1C18E257-48C8-4832-91D9-C1FCC57190C5"));
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.name("SRO Submit RR");
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.workParameter("ActorId", "#{sroUsers}");
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.workParameter("GroupId", "SRO");
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.workParameter("NodeName", "SRO Submit RR");
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.workParameter("UNIQUE_TASK_ID", "_1C18E257-48C8-4832-91D9-C1FCC57190C5");
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_ADA3F90B-B746-4BCD-ABBB-71B8D6394A91", "GroupId", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_9CC69496-9224-401F-9622-951FE657225C", "EXPRESSION (SRO)", "java.lang.Object", "SRO"), new org.jbpm.workflow.core.impl.DataDefinition("_ADA3F90B-B746-4BCD-ABBB-71B8D6394A91", "GroupId", "String", null))), null));
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_08D7D9F4-0EBE-4E44-8732-8F933F0E1E23", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_023FA8AB-B545-4B0C-833C-A8BAEAD733F7", "approvalLog", "riskregister.model.ApprovalLog", null)), new org.jbpm.workflow.core.impl.DataDefinition("_5FFB212B-353F-4A34-9D5D-EF74308540E1", "approvalLog", "riskregister.model.ApprovalLog", null), null, null));
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_F4FDB225-C452-4FA7-9048-A36796582A52", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_0638D964-8FD8-4622-B278-77EFE432A22F", "approval", "riskregister.model.Approval", null)), new org.jbpm.workflow.core.impl.DataDefinition("_A6159B32-ED0E-40A1-8858-D1B7078B9F56", "approval", "riskregister.model.Approval", null), null, null));
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.done();
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.metaData("UniqueId", "_1C18E257-48C8-4832-91D9-C1FCC57190C5");
        humanTaskNode_1C18E257_48C8_4832_91D9_C1FCC57190C5.onActionScript("onExit", "mvel", "approvalLog.getApprovals().add(approval);", (org.kie.kogito.internal.process.runtime.KogitoProcessContext kcontext) -> {
            org.mvel2.MVEL.eval("approvalLog.getApprovals().add(approval);", new org.jbpm.workflow.instance.impl.NodeInstanceResolverFactory((org.jbpm.workflow.instance.NodeInstance) kcontext.getNodeInstance()));
        });
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_86C40E52-AF78-4A55-BD9A-1FA862FAAEA6"));
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.name("HOD Approve");
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.workParameter("ActorId", "#{hodUsers}");
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.workParameter("GroupId", "HOD");
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.workParameter("NodeName", "HOD Approve");
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.workParameter("UNIQUE_TASK_ID", "_86C40E52-AF78-4A55-BD9A-1FA862FAAEA6");
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_D4678E8D-7306-4EDC-81C1-8CF26EB2AA1A", "GroupId", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_619B0B50-27AC-4A9B-8CB8-1D82BAEBA917", "EXPRESSION (HOD)", "java.lang.Object", "HOD"), new org.jbpm.workflow.core.impl.DataDefinition("_D4678E8D-7306-4EDC-81C1-8CF26EB2AA1A", "GroupId", "String", null))), null));
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_B5675B01-6DB7-4B5A-9BB3-AEF623E2ED2E", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_023FA8AB-B545-4B0C-833C-A8BAEAD733F7", "approvalLog", "riskregister.model.ApprovalLog", null)), new org.jbpm.workflow.core.impl.DataDefinition("_7DA2B85C-CE06-454B-9F5E-ECC71438510E", "approvalLog", "riskregister.model.ApprovalLog", null), null, null));
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_E9E27A99-D62D-4435-96A7-25D81449D34F", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_EE3FFD08-B64C-4C4B-99D1-FF2C6D3B561F", "approval", "riskregister.model.Approval", null)), new org.jbpm.workflow.core.impl.DataDefinition("_A6159B32-ED0E-40A1-8858-D1B7078B9F56", "approval", "riskregister.model.Approval", null), null, null));
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.done();
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.metaData("UniqueId", "_86C40E52-AF78-4A55-BD9A-1FA862FAAEA6");
        humanTaskNode_86C40E52_AF78_4A55_BD9A_1FA862FAAEA6.onActionScript("onExit", "mvel", "approvalLog.getApprovals().add(approval);", (org.kie.kogito.internal.process.runtime.KogitoProcessContext kcontext) -> {
            org.mvel2.MVEL.eval("approvalLog.getApprovals().add(approval);", new org.jbpm.workflow.instance.impl.NodeInstanceResolverFactory((org.jbpm.workflow.instance.NodeInstance) kcontext.getNodeInstance()));
        });
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_3F8D7AD6-3245-49F1-B287-8CF8A18AE0B7"));
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.name("RMD Verify RR");
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.workParameter("ActorId", "#{rmdUsers}");
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.workParameter("GroupId", "RMD");
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.workParameter("NodeName", "RMD Verify RR");
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.workParameter("UNIQUE_TASK_ID", "_3F8D7AD6-3245-49F1-B287-8CF8A18AE0B7");
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_7EDB4181-84E0-464E-B470-46EFCD885BE4", "GroupId", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_10CF8E00-3F17-4C89-95D3-BCB891702EF2", "EXPRESSION (RMD)", "java.lang.Object", "RMD"), new org.jbpm.workflow.core.impl.DataDefinition("_7EDB4181-84E0-464E-B470-46EFCD885BE4", "GroupId", "String", null))), null));
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_5B45050D-4975-4C2F-9403-0B6505C7641C", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_023FA8AB-B545-4B0C-833C-A8BAEAD733F7", "approvalLog", "riskregister.model.ApprovalLog", null)), new org.jbpm.workflow.core.impl.DataDefinition("_BD3C4A08-4DC9-4EAD-870E-31E57DFB1BF8", "approvalLog", "riskregister.model.ApprovalLog", null), null, null));
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_0BB0F86A-DD1A-4B9F-89DB-9AE2493A80D4", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_3DCAE60C-DFCD-450A-9059-470C383C8D6A", "approval", "riskregister.model.Approval", null)), new org.jbpm.workflow.core.impl.DataDefinition("_A6159B32-ED0E-40A1-8858-D1B7078B9F56", "approval", "riskregister.model.Approval", null), null, null));
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.done();
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.metaData("UniqueId", "_3F8D7AD6-3245-49F1-B287-8CF8A18AE0B7");
        humanTaskNode_3F8D7AD6_3245_49F1_B287_8CF8A18AE0B7.onActionScript("onExit", "mvel", "approvalLog.getApprovals().add(approval);", (org.kie.kogito.internal.process.runtime.KogitoProcessContext kcontext) -> {
            org.mvel2.MVEL.eval("approvalLog.getApprovals().add(approval);", new org.jbpm.workflow.instance.impl.NodeInstanceResolverFactory((org.jbpm.workflow.instance.NodeInstance) kcontext.getNodeInstance()));
        });
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_DB6511C3-530F-4D9B-B789-1D8DC62AEE70"));
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.name("Maker Submit RR");
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.workParameter("ActorId", "div1_maker1,div2_maker1,div3_maker2");
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.workParameter("GroupId", "MAKER");
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.workParameter("NodeName", "Maker Submit RR");
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.workParameter("TaskName", "MakerSubmitRR");
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.workParameter("UNIQUE_TASK_ID", "_DB6511C3-530F-4D9B-B789-1D8DC62AEE70");
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_370D607C-653F-4976-8D3C-D758D9C87A28", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_784287B7-43AA-484C-BCF4-839CA8C09AAF", "TaskName", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_28887438-7BE5-4579-973A-05549FA99E93", "EXPRESSION (MakerSubmitRR)", "java.lang.Object", "MakerSubmitRR"), new org.jbpm.workflow.core.impl.DataDefinition("_784287B7-43AA-484C-BCF4-839CA8C09AAF", "TaskName", "String", null))), null));
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_C50009C1-609C-4DF5-93F0-85617C0AA2C6", "approvalLog", "riskregister.model.ApprovalLog", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_FD50FA43-BB26-4686-9CF5-39E4E7ECD4E8", "EXPRESSION (approvalLog)", "java.lang.Object", "approvalLog"), new org.jbpm.workflow.core.impl.DataDefinition("_C50009C1-609C-4DF5-93F0-85617C0AA2C6", "approvalLog", "riskregister.model.ApprovalLog", null))), null));
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_4DC71F7E-2EF4-47CE-A06B-72CC47648006", "GroupId", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_CCE9DAF6-FE51-480A-9A3D-E84E3213080E", "EXPRESSION (MAKER)", "java.lang.Object", "MAKER"), new org.jbpm.workflow.core.impl.DataDefinition("_4DC71F7E-2EF4-47CE-A06B-72CC47648006", "GroupId", "String", null))), null));
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_3291DA9C-86AD-4AEE-A06F-BE5BB1408C2C", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_8AE926D5-D820-4531-B7DA-2E7DF743E0E3", "approval", "riskregister.model.Approval", null)), new org.jbpm.workflow.core.impl.DataDefinition("_A6159B32-ED0E-40A1-8858-D1B7078B9F56", "approval", "riskregister.model.Approval", null), null, null));
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.done();
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.metaData("UniqueId", "_DB6511C3-530F-4D9B-B789-1D8DC62AEE70");
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.metaData("elementname", "MakerSubmitRR");
        humanTaskNode_DB6511C3_530F_4D9B_B789_1D8DC62AEE70.onActionScript("onExit", "mvel", "approvalLog.getApprovals().add(approval);", (org.kie.kogito.internal.process.runtime.KogitoProcessContext kcontext) -> {
            org.mvel2.MVEL.eval("approvalLog.getApprovals().add(approval);", new org.jbpm.workflow.instance.impl.NodeInstanceResolverFactory((org.jbpm.workflow.instance.NodeInstance) kcontext.getNodeInstance()));
        });
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_DE0A504F-8E6A-4BD7-8000-5DFFF2191422"));
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.name("Div Head Verify RR");
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.workParameter("ActorId", "#{divHeadUsers}");
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.workParameter("GroupId", "divHeadUserGroup");
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.workParameter("NodeName", "Div Head Verify RR");
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.workParameter("TaskName", "DivHeadVerifyRR");
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.workParameter("UNIQUE_TASK_ID", "_DE0A504F-8E6A-4BD7-8000-5DFFF2191422");
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_12734BF0-79ED-44BF-B760-E5A31D7CC330", "TaskName", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_DC25D0A5-C05C-4349-BE21-775EDD3B9C8D", "EXPRESSION (DivHeadVerifyRR)", "java.lang.Object", "DivHeadVerifyRR"), new org.jbpm.workflow.core.impl.DataDefinition("_12734BF0-79ED-44BF-B760-E5A31D7CC330", "TaskName", "String", null))), null));
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_45CBF41E-65AE-4F3E-987D-80DFDDEF98C6", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_023FA8AB-B545-4B0C-833C-A8BAEAD733F7", "approvalLog", "riskregister.model.ApprovalLog", null)), new org.jbpm.workflow.core.impl.DataDefinition("_399CBBF9-990C-4D99-A186-168F481AE452", "approvalLog", "riskregister.model.ApprovalLog", null), null, null));
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_E3D3BDBC-98A0-4C3F-BAE0-357B11CE80EB", "GroupId", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_8AAD486A-4E64-4A32-B5B7-562D18FE824B", "EXPRESSION (divHeadUserGroup)", "java.lang.Object", "divHeadUserGroup"), new org.jbpm.workflow.core.impl.DataDefinition("_E3D3BDBC-98A0-4C3F-BAE0-357B11CE80EB", "GroupId", "String", null))), null));
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_420764C9-B57F-40EC-9D73-7EB09C052D73", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_7EC7186B-CF4C-4729-97C4-E661BB3AC23B", "approval", "riskregister.model.Approval", null)), new org.jbpm.workflow.core.impl.DataDefinition("_A6159B32-ED0E-40A1-8858-D1B7078B9F56", "approval", "riskregister.model.Approval", null), null, null));
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.done();
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.metaData("UniqueId", "_DE0A504F-8E6A-4BD7-8000-5DFFF2191422");
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.metaData("elementname", "Verify Risk Register");
        humanTaskNode_DE0A504F_8E6A_4BD7_8000_5DFFF2191422.onActionScript("onExit", "mvel", "approvalLog.getApprovals().add(approval);", (org.kie.kogito.internal.process.runtime.KogitoProcessContext kcontext) -> {
            org.mvel2.MVEL.eval("approvalLog.getApprovals().add(approval);", new org.jbpm.workflow.instance.impl.NodeInstanceResolverFactory((org.jbpm.workflow.instance.NodeInstance) kcontext.getNodeInstance()));
        });
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E82B11A3-F055-4091-AB9E-6869B67ACE6E"));
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.name("JRO Verify RR");
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.workParameter("ActorId", "#{jroUsers}");
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.workParameter("GroupId", "JRO");
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.workParameter("NodeName", "JRO Verify RR");
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.workParameter("TaskName", "JROVerifyRR");
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.workParameter("UNIQUE_TASK_ID", "_E82B11A3-F055-4091-AB9E-6869B67ACE6E");
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_3F953B3F-7DD3-4820-8BDE-F1EC27B9AC31", "TaskName", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_51802A8C-4B48-47ED-BD4D-CE6B8616ACCE", "EXPRESSION (JROVerifyRR)", "java.lang.Object", "JROVerifyRR"), new org.jbpm.workflow.core.impl.DataDefinition("_3F953B3F-7DD3-4820-8BDE-F1EC27B9AC31", "TaskName", "String", null))), null));
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_975A82A0-9650-4ACE-B0B0-8CBCBE92F314", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_120898A7-5694-487D-9938-12A06B68F409", "GroupId", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_D93AE95F-8373-4FFA-999B-11E772ECF848", "EXPRESSION (JRO)", "java.lang.Object", "JRO"), new org.jbpm.workflow.core.impl.DataDefinition("_120898A7-5694-487D-9938-12A06B68F409", "GroupId", "String", null))), null));
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_023FA8AB-B545-4B0C-833C-A8BAEAD733F7", "approvalLog", "riskregister.model.ApprovalLog", null)), new org.jbpm.workflow.core.impl.DataDefinition("_481910E7-B783-4F89-8E6F-E0256EC02B67", "approvalLog", "riskregister.model.ApprovalLog", null), null, null));
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_F7CE15CC-4424-4FBE-ACD4-C37BA2A58100", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_E7FEC3F2-99B9-4B49-B2C7-C940D1F7C767", "approval", "riskregister.model.Approval", null)), new org.jbpm.workflow.core.impl.DataDefinition("_A6159B32-ED0E-40A1-8858-D1B7078B9F56", "approval", "riskregister.model.Approval", null), null, null));
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.done();
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.metaData("UniqueId", "_E82B11A3-F055-4091-AB9E-6869B67ACE6E");
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.metaData("elementname", "Verify Risk Register");
        humanTaskNode_E82B11A3_F055_4091_AB9E_6869B67ACE6E.onActionScript("onExit", "mvel", "approvalLog.getApprovals().add(approval);", (org.kie.kogito.internal.process.runtime.KogitoProcessContext kcontext) -> {
            org.mvel2.MVEL.eval("approvalLog.getApprovals().add(approval);", new org.jbpm.workflow.instance.impl.NodeInstanceResolverFactory((org.jbpm.workflow.instance.NodeInstance) kcontext.getNodeInstance()));
        });
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_D4D21E2A-9D22-4A2E-80DB-7E70D1232116"));
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.name("HOD Verify RR");
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.workParameter("ActorId", "#{hodUsers}");
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.workParameter("GroupId", "HOD");
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.workParameter("NodeName", "HOD Verify RR");
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.workParameter("UNIQUE_TASK_ID", "_D4D21E2A-9D22-4A2E-80DB-7E70D1232116");
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_B1EB64BA-CC4B-43A7-BF45-CFB00E153328", "GroupId", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("_A1D1064A-5035-4ADB-AB0D-D5F85B1DFAA2", "EXPRESSION (HOD)", "java.lang.Object", "HOD"), new org.jbpm.workflow.core.impl.DataDefinition("_B1EB64BA-CC4B-43A7-BF45-CFB00E153328", "GroupId", "String", null))), null));
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_46BC5DF0-8E1C-4419-AA6D-68F76CE16F8A", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_023FA8AB-B545-4B0C-833C-A8BAEAD733F7", "approvalLog", "riskregister.model.ApprovalLog", null)), new org.jbpm.workflow.core.impl.DataDefinition("_38CBCB2F-0F62-48CD-BE30-24F4CFC635FE", "approvalLog", "riskregister.model.ApprovalLog", null), null, null));
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_5BA85CE2-D73F-4915-9E65-202C97A3948B", "riskRegister", "riskregister.model.RiskRegister", null)), new org.jbpm.workflow.core.impl.DataDefinition("_AE8DCE52-AC9B-48C2-A96C-7148F3EB8303", "riskRegister", "riskregister.model.RiskRegister", null), null, null));
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_4B1BCF1E-0137-405F-B47C-ADDF33CA5606", "approval", "riskregister.model.Approval", null)), new org.jbpm.workflow.core.impl.DataDefinition("_A6159B32-ED0E-40A1-8858-D1B7078B9F56", "approval", "riskregister.model.Approval", null), null, null));
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.done();
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.metaData("UniqueId", "_D4D21E2A-9D22-4A2E-80DB-7E70D1232116");
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.metaData("elementname", "HOD Verify RR");
        humanTaskNode_D4D21E2A_9D22_4A2E_80DB_7E70D1232116.onActionScript("onExit", "mvel", "approvalLog.getApprovals().add(approval);", (org.kie.kogito.internal.process.runtime.KogitoProcessContext kcontext) -> {
            org.mvel2.MVEL.eval("approvalLog.getApprovals().add(approval);", new org.jbpm.workflow.instance.impl.NodeInstanceResolverFactory((org.jbpm.workflow.instance.NodeInstance) kcontext.getNodeInstance()));
        });
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_3F8D7AD6-3245-49F1-B287-8CF8A18AE0B7"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B11A0D64-CFF4-4698-A0E7-B49B918B525C"), "_60261F81-B054-48FB-8C6B-D0D115CF0B2C");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_DE0A504F-8E6A-4BD7-8000-5DFFF2191422"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_9477168A-A2C7-4290-A4E2-BAC5F30BB0F3"), "_3B74DA92-2E33-4655-92BD-E0529A7FFD9D");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E82B11A3-F055-4091-AB9E-6869B67ACE6E"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F8071055-52F6-4F5D-BE9E-00C51CC97456"), "_F7343F91-D981-49CD-ACB2-ED1DC23CEB2A");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_D4D21E2A-9D22-4A2E-80DB-7E70D1232116"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B1CA7113-6053-4EB8-A714-F214C0D1E051"), "_D3B6752D-76A8-417B-9A4E-45A70ABF5D6B");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F37DF12F-2C90-4492-BB4F-102047D35890"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_83ECC640-A7A7-4CE0-914C-D9FBA3CD0928"), "_A630CD3C-BE1E-42F4-BE60-05170A4E9005");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_18F8C933-387A-41A7-A7C0-BFB670B66BF1"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_83ECC640-A7A7-4CE0-914C-D9FBA3CD0928"), "_D7F5C003-3751-4C43-AE44-8175C80BE005");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A73C6F1E-9D94-4734-8B96-6C413A67B347"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_83ECC640-A7A7-4CE0-914C-D9FBA3CD0928"), "_23E36111-18BE-4010-86A0-3F056BA17EF2");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F222CB4E-A07A-409D-9F65-AC1790C5293F"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_83ECC640-A7A7-4CE0-914C-D9FBA3CD0928"), "_FF2F5065-D898-4E0F-A27E-36083B32BC85");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_9477168A-A2C7-4290-A4E2-BAC5F30BB0F3"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_18F8C933-387A-41A7-A7C0-BFB670B66BF1"), "_965D5D98-4199-4BFA-A4B9-9C4B5DC8B6A2");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F8071055-52F6-4F5D-BE9E-00C51CC97456"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A73C6F1E-9D94-4734-8B96-6C413A67B347"), "_BFB8D2DF-5878-49D3-B39D-FCCEE7647AFF");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B1CA7113-6053-4EB8-A714-F214C0D1E051"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F222CB4E-A07A-409D-9F65-AC1790C5293F"), "_3D88550D-81D4-4256-90D2-49E5EBAC4C54");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_DB6511C3-530F-4D9B-B789-1D8DC62AEE70"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B0D002C4-2DFE-4F34-B75D-D684C307014D"), "_0C4489CC-6562-4231-B3B3-6C3F7EC19F85");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_F8071055-52F6-4F5D-BE9E-00C51CC97456"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1C18E257-48C8-4832-91D9-C1FCC57190C5"), "_2A630041-EB7E-4471-83AC-2E51204405EE");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B1CA7113-6053-4EB8-A714-F214C0D1E051"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_86C40E52-AF78-4A55-BD9A-1FA862FAAEA6"), "_6199D120-2BA1-42FC-81F7-ADD5DB41EBD0");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_86C40E52-AF78-4A55-BD9A-1FA862FAAEA6"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_3F8D7AD6-3245-49F1-B287-8CF8A18AE0B7"), "_D2F8F99E-BA9B-4D5A-829C-D10733E51485");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_83ECC640-A7A7-4CE0-914C-D9FBA3CD0928"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_DB6511C3-530F-4D9B-B789-1D8DC62AEE70"), "_8BFB995A-EA2A-4665-AECC-E944E98D16A9");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B0D002C4-2DFE-4F34-B75D-D684C307014D"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_DE0A504F-8E6A-4BD7-8000-5DFFF2191422"), "_E908193D-AABE-4F5E-90E2-B2FE2538ECA4");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_9477168A-A2C7-4290-A4E2-BAC5F30BB0F3"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E82B11A3-F055-4091-AB9E-6869B67ACE6E"), "_4FA8CE12-E261-4A07-A2F3-F01C39CA2C7A");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1C18E257-48C8-4832-91D9-C1FCC57190C5"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_D4D21E2A-9D22-4A2E-80DB-7E70D1232116"), "_D129D052-ED50-4D11-9F52-FA98CD18CC6B");
        factory.validate();
        return factory.getProcess();
    }
}
