package RestaurantManagement.repository;

import RestaurantManagement.model.TotalBills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TotalBillsRepository extends JpaRepository<TotalBills, Integer> {
}
