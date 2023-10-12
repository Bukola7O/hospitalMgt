package org.example.medicals.serviceImpl;

import org.example.medicals.entities.MedicalStaff;
import org.example.medicals.entities.Patients;
import org.example.medicals.services.MedicalServices;

public class HealthServices implements MedicalServices{

    public HealthServices() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public void admit(Patients patients) {

    }

    @Override
    public void discharge(MedicalStaff patients) {

    }

    @Override
    public void treatment(MedicalStaff patients) {

    }

    @Override
    public void consultation(MedicalStaff patients) {

    }
}
