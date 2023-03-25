package RestaurantManagement.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name ="drink" )
@Getter @Setter
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name",length = 45 , nullable = false, unique = false)
    private String name;

    @Column(name = "code_id",length = 45 , nullable = false, unique = false)
    private String codeId;

    @Column(name = "desctription",length = 45 , nullable = false, unique = false)
    private String desctription;
}
