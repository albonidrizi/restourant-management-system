package RestaurantManagement.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name ="menu" )
@Getter @Setter
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name",length = 45 , nullable = false, unique = false)
    private String name;

    @Column(name = "description",length = 45 , nullable = false, unique = false)
    private String description;
}
