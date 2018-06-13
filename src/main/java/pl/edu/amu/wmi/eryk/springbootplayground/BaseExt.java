package pl.edu.amu.wmi.eryk.springbootplayground;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Stworzone przez Eryk Mariankowski dnia 13.06.18.
 */
@Entity
@Table(name = "sa_baza")
public class BaseExt {

    @Id
    public String nazwa;

    public String wektor;
}
