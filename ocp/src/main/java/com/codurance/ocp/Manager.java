package com.codurance.ocp;

public class Manager extends Employee{

    protected int bonus;

    Manager(int salary, int bonus) {
        super(salary);
        this.bonus = bonus;
    }

    public int getFinalSalary() {
        return salary + bonus;
    }
}
