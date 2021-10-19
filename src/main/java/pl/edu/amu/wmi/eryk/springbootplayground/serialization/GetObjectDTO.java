package pl.edu.amu.wmi.eryk.springbootplayground.serialization;

import java.sql.Timestamp;

/**
 * Stworzone przez Eryk Mariankowski dnia 05.10.18.
 */
public class GetObjectDTO {

    private String dupa2;

    private Timestamp date;

    public String getDupa2() {
        return dupa2;
    }

    public void setDupa2(String dupa2) {
        this.dupa2 = dupa2;
    }

    Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

}
