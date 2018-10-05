package pl.edu.amu.wmi.eryk.springbootplayground.serialization;

/**
 * Stworzone przez Eryk Mariankowski dnia 18.06.18.
 */
public class GetObject {

    private String dupa = "asd";

    public String getDupa() {
        return dupa;
    }

    public void setDupa(String dupa) {
        this.dupa = dupa;
    }

    @Override
    public String toString() {
        return "GetObject{" +
                "dupa='" + dupa + '\'' +
                '}';
    }
}
