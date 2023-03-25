package RestaurantManagement.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name ="total_bills" )
@Getter @Setter
public class TotalBills {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employeeId;

    @ManyToOne
    @JoinColumn(name = "bills_id")
    private Bills billsId;

    @Column(name = "total_price", nullable = false, unique = false)
    private int totalPrice;
}
