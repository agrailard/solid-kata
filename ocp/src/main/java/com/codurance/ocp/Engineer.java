package com.codurance.ocp;

public class Engineer extends Employee{

    Engineer(int salary) {
        super(salary);
    }

    public int getFinalSalary() {
        return salary;
    }
}
