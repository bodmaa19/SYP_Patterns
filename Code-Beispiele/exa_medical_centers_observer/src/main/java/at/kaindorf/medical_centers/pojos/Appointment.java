package at.kaindorf.medical_centers.pojos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment
{
    private LocalDate date;
    private LocalTime time;
    private String description;
    private Patient patient;
}
