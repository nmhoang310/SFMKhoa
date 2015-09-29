package com.project.fpt.sfm.web.controller;

import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Những controller liên quan đến sutdent sẽ extend controller này.
 * Những xử lý chung cho student trong controller sẽ đặt ở đây.
 *
 * Created by Khoa on 9/30/2015.
 */
public abstract class AbstractStudentController extends AbstractActionController {

    @Override
    public void initModel(Model model) {
        model.addAttribute("sidebar", "student/student-sidebar");
    }
}
