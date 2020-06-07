package com.example.demo.payrolll;

public class EmployeeNotFoundException extends  RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super ("Could not find employee " + id);
    }
}
