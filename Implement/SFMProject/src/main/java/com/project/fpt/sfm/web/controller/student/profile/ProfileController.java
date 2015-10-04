package com.project.fpt.sfm.web.controller.student.profile;

import com.project.fpt.sfm.web.controller.AbstractStudentController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Khoa on 9/30/2015.
 */
@Controller
public class ProfileController extends AbstractStudentController {

    @RequestMapping("/student/profile")
    public String index(Model model) {

        return "student/profile2";
    }

    @RequestMapping("/student/profile/update")
    public String studentProfile(Model model){
        initModel(model);
        model.addAttribute("content", "student/update-profile");
        return "home";
    }
}
