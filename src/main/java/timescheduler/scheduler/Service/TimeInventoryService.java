package timescheduler.scheduler.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import timescheduler.scheduler.DTO.TimeInventory;
import timescheduler.scheduler.DTO.UserDto;
import timescheduler.scheduler.Repository.TimeInventoryRepo;

@Service
public class TimeInventoryService {
    @Autowired
    private TimeInventoryRepo timeInventoryRepo;

     public List<TimeInventory> getAllTimeInfo(){
        var TimeList = (List<TimeInventory>)timeInventoryRepo.findAll();
        return TimeList;
    }

    public TimeInventory get(Long id) {
        return timeInventoryRepo.findById(id).get();
    }


}
