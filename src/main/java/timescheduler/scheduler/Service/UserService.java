package timescheduler.scheduler.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import timescheduler.scheduler.DTO.UserDto;
import timescheduler.scheduler.Repository.TimeSetRepo;

public class UserService {
     @Autowired
    private TimeSetRepo repository; 

    public List<UserDto> getAllUserInfo(){
        var UserList = (List<UserDto>)repository.findAll();
        return UserList;
    }

    public UserDto get(int id) {
        return repository.findById(id).get();
    }

    //public void addItems() {
        //TimeInventory items = new TimeInventory();
        //System.out.println("this are the items " + items);
        //repository.save(items);
    //}
}
