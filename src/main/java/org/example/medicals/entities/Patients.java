package org.example.medicals.entities;

import java.time.LocalDate;
import java.util.List;

public class Patients extends User {
    private String weight;
    private String height;
    private LocalDate DOA;
    private LocalDate DOD;
    private String nameofHMO;
    private List<Allergies> allergies;
    private String address;

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public LocalDate getDOA() {
        return DOA;
    }

    public void setDOA(LocalDate DOA) {
        this.DOA = DOA;
    }

    public LocalDate getDOD() {
        return DOD;
    }

    public void setDOD(LocalDate DOD) {
        this.DOD = DOD;
    }

    public String getNameofHMO() {
        return nameofHMO;
    }

    public void setNameofHMO(String nameofHMO) {
        this.nameofHMO = nameofHMO;
    }

    public List<Allergies> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<Allergies> allergies) {
        this.allergies = allergies;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
