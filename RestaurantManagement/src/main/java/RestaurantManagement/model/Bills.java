package RestaurantManagement.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "bills")
@Getter @Setter
public class Bills{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "bill_no", nullable = false, unique = false)
    private int billNo;

    @ManyToOne
    @JoinColumn(name = "drink_id")
    private Drink drinkId;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menuId;

    @ManyToOne
    @JoinColumn(name = "menutype_id")
    private MenuType menutypeId;

    @Column(name = "unitePrice", nullable = false, unique = false)
    private int unitePrice;
}
