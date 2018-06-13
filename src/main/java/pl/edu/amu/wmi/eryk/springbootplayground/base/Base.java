package pl.edu.amu.wmi.eryk.springbootplayground.base;

import javax.persistence.*;

/**
 * Stworzone przez Eryk Mariankowski dnia 13.06.18.
 */
@Entity
@Table(name = "sa_baza")
public class Base {

    @Id
    public String nazwa;

}
