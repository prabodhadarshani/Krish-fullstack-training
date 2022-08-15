package dto;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "inventory")
public class Inventory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable=true, name="available_qty")
    private int available_qty;
    @Column(nullable=true, name="receive_qty")
    private int receive_qty;
    @Column(nullable=true, name="type")
    private String type;





}
