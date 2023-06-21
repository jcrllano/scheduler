package timescheduler.scheduler.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import timescheduler.scheduler.DTO.Customer;
import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByEmail(String email);  
}
