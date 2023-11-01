package lk.ijse.dep11.web.to;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item implements Serializable {
    private String code;
    private String description;
    private int qty;
    private BigDecimal unitPrice;
}
