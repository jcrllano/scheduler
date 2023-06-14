package timescheduler.scheduler.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import timescheduler.scheduler.DTO.UserDto;

@Repository
public interface TimeSetRepo extends JpaRepository<UserDto, Integer>{
    
}
