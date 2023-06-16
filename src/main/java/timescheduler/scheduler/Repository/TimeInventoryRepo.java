package timescheduler.scheduler.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import timescheduler.scheduler.DTO.TimeInventory;

public interface TimeInventoryRepo extends JpaRepository<TimeInventory, Long>{
    
}
