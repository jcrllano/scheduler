package timescheduler.scheduler.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import timescheduler.scheduler.DTO.UserDto;
import timescheduler.scheduler.DTO.UserSetTime;
import timescheduler.scheduler.Repository.TimeSetRepo;
import timescheduler.scheduler.Repository.UserScheduleTimeRepo;
import timescheduler.scheduler.Service.TimeInventoryService;
import timescheduler.scheduler.Service.UserService;

@Controller
public class AppController {

    @Autowired 
    private UserService userServiceservice;

    @Autowired
    private TimeInventoryService timeInventoryService;

    @Autowired
        TimeSetRepo repo;
    
    @Autowired
        UserScheduleTimeRepo userScheduleTimeRepo;

    String dayweek = "Tuesday";
    
    @RequestMapping("/home") 
    public String home(){
        return "MainHome";
    }
      
    @RequestMapping("/homeuser")
    public String index(Model model) {
        var timeList = timeInventoryService.getAllTimeInfo();
        model.addAttribute("timeList", timeList); 
        return "homeUser";
    }

     @GetMapping("/signup/{day}")
    String TimeSet(Model model, @PathVariable String day) {
        day = "tuesday";
        UserSetTime settime = new UserSetTime();
        model.addAttribute("settime", settime);
        return "UserSignUpForm";
    }

    @PostMapping("/save")
    public String saveTime(@ModelAttribute UserSetTime userSetTime) {
        userScheduleTimeRepo.save(userSetTime);
        return "redirect:/homeuser"; 
    }
}
