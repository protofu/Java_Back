package com.assignment;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private String email;

    // 생성자, getter, setter 메소드들을 작성하세요
}
