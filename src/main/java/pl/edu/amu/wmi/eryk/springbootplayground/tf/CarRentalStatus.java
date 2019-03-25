package pl.edu.amu.wmi.eryk.springbootplayground.tf;

import javax.persistence.*;

/**
 * Stworzone przez Eryk Mariankowski dnia 29.11.18.
 */
@Entity
@Table
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = CarRentalStatus.RENTAL_STATUS,
                procedureName = CarRentalStatus.RENTAL_STATUS,
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = boolean.class)
                }, resultClasses = CarRentalStatus.class)
})
public class CarRentalStatus {

    static final String RENTAL_STATUS = "zam_f_rental_status2";
    @Id
    public Integer pojazdId;

}
