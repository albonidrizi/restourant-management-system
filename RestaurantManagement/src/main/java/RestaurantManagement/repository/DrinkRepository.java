package RestaurantManagement.repository;

import RestaurantManagement.model.Drink;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Integer> {

    @Query(value = "SELECT d FROM Drink d WHERE "
            + "(?1 IS NULL OR UPPER (d.name) LIKE '%' || UPPER(?1) || '%')"
            + " AND (?2 IS NULL OR UPPER (d.codeId) LIKE '%' || UPPER(?2) ||'%')")
    List<Drink> searchDrink(String name, int codeId, Pageable pageable);

    @Query("SELECT COUNT(d) FROM Drink d WHERE " +
            "(?1 IS NULL OR UPPER(d.name) LIKE '%' || UPPER(?1) || '%')" +
            "AND (?2 IS NULL OR UPPER (d.codeId) LIKE '%' || UPPER(?2) || '%')")
    Integer countDrink(String name, int codeId);

}
