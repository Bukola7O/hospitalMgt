package org.example;

import org.example.medicals.entities.MedicalStaff;
import org.example.medicals.entities.Patients;

public class Main {
    public static void main(String[] args){

        MedicalStaff mediCare = new MedicalStaff("A1", "surgeon", "optician", 700.7);
        mediCare.setName("MediCare");
        System.out.println("The name of the hospital is: " + mediCare.getName());

        Patients kg =  new Patients();
        kg.setName("kg");
        System.out.println("The weight of the patient is:" + kg.getName());

        System.out.println(mediCare);
    }
}