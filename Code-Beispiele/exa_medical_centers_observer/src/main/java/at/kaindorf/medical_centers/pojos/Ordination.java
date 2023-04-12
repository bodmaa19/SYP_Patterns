package at.kaindorf.medical_centers.pojos;

import at.kaindorf.medical_centers.enums.Day;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ordination
{
    private Long id;
    private String name;
    private String phoneNumber;
    private String email;
    private Map<Day, String> openingTimes;
    private Address address;
    private List<Doctor> doctorList;
    private List<Patient> patientList = null;
    private List<Appointment> appointmentList;
    private List<Terminal> terminalList = null;

    public Ordination(Long id, String name, String phoneNumber, String email, Map<Day, String> openingTimes, Address address)
    {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.openingTimes = openingTimes;
        this.address = address;
        this.doctorList = new ArrayList<>();
        this.patientList = new ArrayList<>();
        this.appointmentList = new ArrayList<>();
        this.terminalList = new ArrayList<>();
    }

    public void addPatient(Patient patient)
    {
        this.patientList.add(patient);
    }

    public void addTerminal(Terminal terminal)
    {
        this.terminalList.add(terminal);
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public Map<Day, String> getOpeningTimes()
    {
        return openingTimes;
    }

    public void setOpeningTimes(Map<Day, String> openingTimes)
    {
        this.openingTimes = openingTimes;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    public List<Doctor> getDoctorList()
    {
        return doctorList;
    }

    public void setDoctorList(List<Doctor> doctorList)
    {
        this.doctorList = doctorList;
    }

    public List<Patient> getPatientList()
    {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList)
    {
        this.patientList = patientList;
    }

    public List<Appointment> getAppointmentList()
    {
        return appointmentList;
    }

    public void setAppointmentList(List<Appointment> appointmentList)
    {
        this.appointmentList = appointmentList;
    }

    public List<Terminal> getTerminalList()
    {
        return terminalList;
    }

    public void setTerminalList(List<Terminal> terminalList)
    {
        this.terminalList = terminalList;
    }
}
