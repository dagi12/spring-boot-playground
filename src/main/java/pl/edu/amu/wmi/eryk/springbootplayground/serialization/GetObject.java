package pl.edu.amu.wmi.eryk.springbootplayground.serialization;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Stworzone przez Eryk Mariankowski dnia 18.06.18.
 */
@Data
@NoArgsConstructor
@ToString
public class GetObject {

    @ApiModelProperty(value = "User Status", allowableValues = "1-registered,2-active,3-closed")
    private String dupa = "asd";

    public String getDupa() {
        return dupa;
    }

    public void setDupa(String dupa) {
        this.dupa = dupa;
    }

}
