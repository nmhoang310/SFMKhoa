package com.project.fpt.sfm.services;

import com.project.fpt.sfm.domain.Student;
import com.project.fpt.sfm.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Khoa on 10/3/2015.
 */
@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student getStudentById(Integer studentId) {
        return studentRepository.findOne(studentId);
    }
}
