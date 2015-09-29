package com.project.fpt.sfm.web.controller;

import org.springframework.ui.Model;

/**
 * Tất cả những xử lý chung cho controller của hệ thống sẽ được đặt ở đây.
 * Những controller khác sẽ được extend từ controller này.
 *
 * Created by Khoa on 9/30/2015.
 */
public abstract class AbstractActionController {
    abstract void initModel(Model model);
}
