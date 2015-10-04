package com.project.fpt.sfm.web.controller.student.profile;

import com.project.fpt.sfm.domain.Student;
import com.project.fpt.sfm.services.StudentService;
import com.project.fpt.sfm.web.controller.AbstractStudentController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Khoa on 9/30/2015.
 */
@Controller
public class ProfileController extends AbstractStudentController {

    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/student/profile")
    public String index(Model model) {
//        Student student = new Student();
//        student.setFullName("Nguyễn Minh Hoàng");
//        student.setSex(true);
//        student.setPhone("12546546541321");
        model.addAttribute("student", studentService.getStudentById(1));
        return "student/profile";
    }

    @RequestMapping("/student/profile/update")
    public String studentProfile(Model model){

        return "home";
    }
}
