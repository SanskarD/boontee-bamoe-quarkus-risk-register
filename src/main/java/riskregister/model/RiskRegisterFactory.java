package riskregister.model;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import java.time.LocalDate;
import java.util.Arrays;

/**
 * Simple runner to create a sample RiskRegister instance with Reserve Bank of India example data.
 * This is intended as an initiation/example for developers and tests.
 */
@JsonIgnoreType
public class RiskRegisterFactory {
    public static RiskRegister getInstance() {
        PrimaryRiskInfo pri = new PrimaryRiskInfo(
                LocalDate.of(2024, 4, 1),
                "Chief Risk Officer - Reserve Bank of India",
                "Supervisory Department",
                "Department of Banking Regulation",
                "Operational",
                "Payment Systems",
                "Ensure secure & resilient payment infrastructure",
                "Potential cybersecurity threats to critical payment systems and third-party dependencies"
        );

        Reason reason = new Reason(
                "Outdated infrastructure and extensive third-party reliance",
                "Requires strengthened vendor management, continuous monitoring and timely patching"
        );

        ResidualRisk residual = new ResidualRisk(
                "Estimated financial exposure: medium",
                "High",
                "Moderate"
        );

        RiskCategory category = new RiskCategory(
                "Third-party / technology failure",
                "Vendor dependency",
                Arrays.asList("Operational", "Technology"),
                "High",
                "Moderate",
                "High",
                "Likely"
        );

        RiskControlMeasure control = new RiskControlMeasure(
                "Moderate",
                "SLA enforcement, redundancy",
                "Quarterly",
                "Preventive and detective",
                "Controls documented in internal policy and circulars",
                "Implement MFA, patch management, vendor SLAs, incident response drills"
        );

        RiskRegister rr = new RiskRegister(pri, reason, residual, category, control);
        
        System.out.println("Sample RiskRegister for Reserve Bank of India:");
        System.out.println(rr);
        return rr;
    }
}
