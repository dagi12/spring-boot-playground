package pl.edu.amu.wmi.eryk.springbootplayground;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Stworzone przez Eryk Mariankowski dnia 17.07.18.
 */
@Entity
@Table(name = "loan_application")
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer applicationId;
    @Column
    private String status;
    @Column
    private Integer nrKlienta;
    @Column
    private Timestamp updatedOn;
    @Column
    private String updatedBy;
    @Column
    private Timestamp filedOn;
    @Column
    private String filedBy;
    @Column
    private String content;
    @Column
    private String terms;
    @OneToOne(fetch = FetchType.LAZY)
    private LoanApplication loanApplicationAcceptance;

}
