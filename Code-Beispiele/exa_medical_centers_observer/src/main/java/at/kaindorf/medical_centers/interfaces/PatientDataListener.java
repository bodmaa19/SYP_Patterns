package at.kaindorf.medical_centers.interfaces;

import at.kaindorf.medical_centers.pojos.Patient;

import java.lang.reflect.Field;

public interface PatientDataListener
{
    void update(Patient patient, Field field);
}
