package pl.edu.amu.wmi.eryk.springbootplayground;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Stworzone przez Eryk Mariankowski dnia 17.07.18.
 */
@Entity
@Table(name = "loan_application_acceptance")
public class LoanApplicationAcceptance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer applicationAcceptanceId;

    @OneToOne(fetch = FetchType.LAZY)
    private LoanApplication loanApplication;

    @Column
    private boolean formalVerification;

    @Column
    private String formalVerificationComment;

    @Column
    private boolean krd;

    @Column
    private String krdComment;

    @Column
    private boolean differentDebtorsRegister;

    @Column
    private String differentDebtorsRegisterComment;

    @Column
    private boolean cooperationHistory;

    @Column
    private String cooperationHistoryComment;

    @Column
    private boolean profitability;

    @Column
    private String profitabilityComment;

    @Column
    private boolean financialDocuments;

    @Column
    private String financialDocumentsComment;

    @Column
    private Timestamp rentalPeriod;

    @Column
    private Integer vehiclesNumber;

    @Column
    private Integer deposit;

    @Column
    private String rejectionReason;

}
