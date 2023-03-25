package RestaurantManagement.repository;

import RestaurantManagement.model.Bills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillsRepository extends JpaRepository<Bills, Integer> {
}
