package at.kaindorf.medical_centers.pojos;

import at.kaindorf.medical_centers.interfaces.PatientDataListener;

import java.lang.reflect.Field;

public class Terminal implements PatientDataListener
{
    private Long id;
    private String name;

    public Terminal(Long id, String name)
    {
        this.id = id;
        this.name = name;
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

    @Override
    public void update(Patient patient, Field field)
    {
        System.out.println(String.format("%s: patient %s has updated his %s !!!", this.name, patient.toString(), field.getName().toLowerCase()));
    }
}
