package timescheduler.scheduler.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import timescheduler.scheduler.DTO.UserSetTime;

public interface UserScheduleTimeRepo extends JpaRepository<UserSetTime, Integer> {
    
}
