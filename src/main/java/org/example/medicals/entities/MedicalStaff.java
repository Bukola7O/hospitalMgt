package org.example.medicals.entities;

import java.math.BigDecimal;

public class MedicalStaff extends User {
    private String grade;
    private String role;
    private String specialisation;
    private Double salary;

    public MedicalStaff(String grade, String role, String specialisation, Double salary) {
        this.grade = grade;
        this.role = role;
        this.specialisation = specialisation;
        this.salary = salary;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "MedicalStaff{" +
                "grade='" + grade + '\'' +
                ", role='" + role + '\'' +
                ", specialisation='" + specialisation + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void setSalary(Double salary) {
        this.salary = salary;

    }
}
