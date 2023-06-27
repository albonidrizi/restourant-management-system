package RestaurantManagement.repository;

import RestaurantManagement.model.Drink;
import RestaurantManagement.model.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

        @Query(value = "SELECT e FROM Employee e WHERE "
                + "(?1 IS NULL OR UPPER(e.name) LIKE '%' || UPPER(?1) || '%')"
                + " AND (?2 IS NULL OR UPPER(e.address) LIKE '%' || UPPER(?2) || '%')"
                + " AND (?3 IS NULL OR e.professionId.id = ?3)")
        List<Employee> searchEmployees(String name, String address, Integer professionId, Pageable pageable);

        @Query("SELECT COUNT(e) FROM Employee e WHERE "
                + "(?1 IS NULL OR UPPER(e.name) LIKE '%' || UPPER(?1) || '%')"
                + " AND (?2 IS NULL OR UPPER(e.address) LIKE '%' || UPPER(?2) || '%')"
                + " AND (?3 IS NULL OR e.professionId.id = ?3)")
        Integer countEmployees(String name, String address, Integer professionId);

}

