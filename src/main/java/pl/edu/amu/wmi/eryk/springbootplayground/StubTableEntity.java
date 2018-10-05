package pl.edu.amu.wmi.eryk.springbootplayground;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Stworzone przez Eryk Mariankowski dnia 09.08.18.
 */
@Entity
@Table(name = "stub_table")
public class StubTableEntity {
    private Integer id;
    private Integer stub;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "stub")
    public Integer getStub() {
        return stub;
    }

    public void setStub(Integer stub) {
        this.stub = stub;
    }

}
