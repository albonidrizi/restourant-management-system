package RestaurantManagement.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name ="employee" )
@Getter @Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name",length = 45 , nullable = false, unique = false)
    private String name;

    @Column(name = "surname",length = 45 , nullable = false, unique = false)
    private String surname;

    @Column(name = "address",length = 45 , nullable = false, unique = false)
    private String address;

    @ManyToOne
    @JoinColumn(name = "profession_id")
    private Profession professionId;

}
