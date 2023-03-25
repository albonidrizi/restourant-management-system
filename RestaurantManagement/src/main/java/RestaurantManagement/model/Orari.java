package RestaurantManagement.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
@Entity
@Table(name ="orari" )
@Getter @Setter
public class Orari {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "turni",length = 45 , nullable = false, unique = false)
    private String turni;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employeeId;

    @Column(name = "by_hour", nullable = false, unique = false)
    private Time by_hour;

    @Column(name = "until_hour", nullable = false, unique = false)
    private Time until_hour;
}
