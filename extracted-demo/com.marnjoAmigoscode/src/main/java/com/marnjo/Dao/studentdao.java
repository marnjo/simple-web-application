package com.marnjo.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.marnjo.entity.Student;

public class studentdao {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Said", "comp scie"));
                put(2, new Student(1, "Said", "comp scie"));
                put(3, new Student(1, "Said", "comp scie"));
            }
        };
    }

    public Collection<Student>
}
