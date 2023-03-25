package RestaurantManagement.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name ="menutype" )
@Getter @Setter
public class MenuType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "type",length = 45 , nullable = false, unique = false)
    private String type;
}
