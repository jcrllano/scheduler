package timescheduler.scheduler.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import timescheduler.scheduler.DTO.UserDto;
import timescheduler.scheduler.Repository.TimeSetRepo;
import timescheduler.scheduler.Service.UserService;

@Controller
public class AppController {

    @Autowired 
    private UserService service;

    @Autowired
        TimeSetRepo repo;
    
      
    @RequestMapping("/home")
    public String index(Model model) {
        var UserList = service.getAllUserInfo();
        System.out.println("this is the list from the rep" + UserList);
        System.out.println();
        System.out.println();
        System.out.println("this is the email " + service.get(1).getEmail());
        model.addAttribute("UserList ", UserList); 
        return "homeUser";
    }
}
