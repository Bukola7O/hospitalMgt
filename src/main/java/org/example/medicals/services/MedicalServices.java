package org.example.medicals.services;

import org.example.medicals.entities.MedicalStaff;
import org.example.medicals.entities.Patients;

public interface MedicalServices {
    void admit (Patients patients);
    void discharge (MedicalStaff patients);
    void treatment (MedicalStaff patients);
    void consultation (MedicalStaff patients);


}
