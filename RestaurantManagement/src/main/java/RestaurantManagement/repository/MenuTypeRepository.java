package RestaurantManagement.repository;

import RestaurantManagement.model.MenuType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuTypeRepository extends JpaRepository<MenuType, Integer> {
}
