package at.kaindorf.medical_centers.main;

import at.kaindorf.medical_centers.pojos.Ordination;
import at.kaindorf.medical_centers.pojos.Patient;
import at.kaindorf.medical_centers.pojos.Terminal;

import java.time.LocalDate;
import java.time.Month;

public class Main
{
    public static void main(String[] args)
    {
        Ordination ordination = new Ordination(0L, null, null, null, null, null);
        Patient patient = new Patient(0L, "Manuel", "Bodlos", LocalDate.of(2003, Month.JULY, 20), "06802057710", "manuelbodlos20@gmail.com", null, null, null);
        Terminal terminal_0 = new Terminal(0L, "terminal entry");
        Terminal terminal_1 = new Terminal(1L, "terminal doctors room");
        ordination.addTerminal(terminal_0);
        ordination.addTerminal(terminal_1);
        ordination.addPatient(patient);
        patient.setOrdination(ordination);
        try
        {
            patient.setEmailAddress("bodmaa19@htl-kaindorf.at");
        } catch (NoSuchFieldException e)
        {
            throw new RuntimeException(e);
        }
    }
}
