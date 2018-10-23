package pl.edu.amu.wmi.eryk.springbootplayground.strategy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Stworzone przez Eryk Mariankowski dnia 23.10.18.
 */
@Entity
@Table(name = "sa_rentcar")
public class Model {


    @Id
    private Integer rentId;

    private String wydPlanUKl;

    public String getWydPlanUKl() {
        return wydPlanUKl;
    }

    public void setWydPlanUKl(String wydPlanUKl) {
        this.wydPlanUKl = wydPlanUKl;
    }

    public Integer getRentId() {
        return rentId;
    }

    public void setRentId(Integer rentId) {
        this.rentId = rentId;
    }
}
