package pl.edu.amu.wmi.eryk.springbootplayground.wnioski;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Stworzone przez Eryk Mariankowski dnia 07.06.2019.
 */
@MappedSuperclass
public abstract class BaseLoanApplication {
    private Integer applicationId;

    private Date updatedOn;

    private String updatedBy;

    private Date filedOn;

    private String filedBy;

    private Integer vehiclesNumber;

    private String deposit;

    private String specNo;

    private Integer rentalPeriod;

    private boolean polishContract = true;


    private Integer annualCourse;


    private Integer annualUsage;


    private Integer optionalRentalPeriod;


    private Integer optionalRentalPeriod2;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    @Column(insertable = false, updatable = false)
    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Column
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Column(insertable = false, updatable = false)
    public Date getFiledOn() {
        return filedOn;
    }

    public void setFiledOn(Date filedOn) {
        this.filedOn = filedOn;
    }

    @Column
    public String getFiledBy() {
        return filedBy;
    }

    public void setFiledBy(String filedBy) {
        this.filedBy = filedBy;
    }

    @Column
    public Integer getVehiclesNumber() {
        return vehiclesNumber;
    }

    public void setVehiclesNumber(Integer vehiclesNumber) {
        this.vehiclesNumber = vehiclesNumber;
    }

    @Column
    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    @Column
    public String getSpecNo() {
        return specNo;
    }

    public void setSpecNo(String specNo) {
        this.specNo = specNo;
    }

    @Column
    public Integer getRentalPeriod() {
        return rentalPeriod;
    }

    public void setRentalPeriod(Integer rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
    }

    @Column
    public boolean isPolishContract() {
        return polishContract;
    }

    public void setPolishContract(boolean polishContract) {
        this.polishContract = polishContract;
    }

    @Column
    public Integer getAnnualCourse() {
        return annualCourse;
    }

    public void setAnnualCourse(Integer annualCourse) {
        this.annualCourse = annualCourse;
    }

    @Column
    public Integer getAnnualUsage() {
        return annualUsage;
    }

    public void setAnnualUsage(Integer annualUsage) {
        this.annualUsage = annualUsage;
    }

    @Column
    public Integer getOptionalRentalPeriod() {
        return optionalRentalPeriod;
    }

    public void setOptionalRentalPeriod(Integer optionalRentalPeriod) {
        this.optionalRentalPeriod = optionalRentalPeriod;
    }

    @Column
    public Integer getOptionalRentalPeriod2() {
        return optionalRentalPeriod2;
    }

    public void setOptionalRentalPeriod2(Integer optionalRentalPeriod2) {
        this.optionalRentalPeriod2 = optionalRentalPeriod2;
    }
}
