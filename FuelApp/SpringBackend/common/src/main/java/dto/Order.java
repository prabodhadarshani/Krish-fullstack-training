package dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.util.Date;

//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "order")
public class Order {


    @Id
    private String orderId;
    private String gasStationName;
    private int  capacity;
    private String type;
    private String status;
    private Date shedule_date;
  //  private Date createDate;






//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
}
