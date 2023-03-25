package RestaurantManagement.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name ="profession" )
@Getter @Setter
public class Profession {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "profession_name",length = 45 , nullable = false, unique = false)
    private String professionName;
}
