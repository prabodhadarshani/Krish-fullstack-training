package dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderEvent implements Serializable {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private String orderId;


    private String message;
    private String status;
   // private Order order;

    private String gasStationName;
    private int  capacity;
    private String type;










}
