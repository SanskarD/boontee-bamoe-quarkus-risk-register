package riskregister.model;

import java.util.List;
import java.util.ArrayList;

public class ApprovalLog {

    private List<Approval> approvals;
    private String finalStatus;

    public ApprovalLog() {
        this.approvals = new ArrayList<Approval>();
        this.finalStatus = "";
    }

    public List<Approval> getApprovals() {
        return approvals;
    }

    public void setApprovals(List<Approval> approvals) {
        this.approvals = approvals;
    }

    public String getFinalStatus() {
        return finalStatus;
    }

    public void setFinalStatus(String finalStatus) {
        this.finalStatus = finalStatus;
    }
}
