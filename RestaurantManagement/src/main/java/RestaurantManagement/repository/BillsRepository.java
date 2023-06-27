package RestaurantManagement.repository;

import RestaurantManagement.model.Bills;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface BillsRepository extends JpaRepository<Bills, Integer> {

    @Query(value = "SELECT b FROM Bills b WHERE (?1 IS NULL OR UPPER (b.billNo) LIKE '%' || UPPER(?1) || '%')")
    List<Bills> searchBills(int billNo, Pageable pageable);

    @Query("SELECT COUNT(b) FROM Bills b WHERE (?1 IS NULL OR UPPER(b.billNo) LIKE '%' || UPPER(?1) || '%')")
    Integer countBills(int billNo);

}
