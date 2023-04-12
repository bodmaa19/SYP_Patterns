package at.kaindorf.medical_centers.pojos;

import java.time.LocalDate;

public class Patient
{
    private Long id;
    private String firstname;
    private String lastname;
    private LocalDate birthdate;
    private String phoneNumber;
    private String emailAddress;
    private Address address;
    private ECard eCard;
    private Ordination ordination;

    /* subscribe unsubscribe */
    public void setOrdination(Ordination ordination) // subscribe
    {
        this.ordination = ordination;
    }

    public void unsetOrdination() // unsubscribe
    {
        this.ordination = null;
    }
    /* subscribe unsubscribe */

    public Patient(Long id, String firstname, String lastname, LocalDate birthdate, String phoneNumber, String emailAddress, Address address, ECard eCard, Ordination ordination)
    {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
        this.eCard = eCard;
        this.ordination = ordination;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id) throws NoSuchFieldException
    {
        this.id = id;
        for (Terminal terminal : ordination.getTerminalList())
        {
            terminal.update(this, this.getClass().getDeclaredField("id"));
        }
    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname(String firstname) throws NoSuchFieldException
    {
        this.firstname = firstname;
        for (Terminal terminal : ordination.getTerminalList())
        {
            terminal.update(this, this.getClass().getDeclaredField("firstname"));
        }
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname) throws NoSuchFieldException
    {
        this.lastname = lastname;
        for (Terminal terminal : ordination.getTerminalList())
        {
            terminal.update(this, this.getClass().getDeclaredField("lastname"));
        }
    }

    public LocalDate getBirthdate()
    {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) throws NoSuchFieldException
    {
        this.birthdate = birthdate;
        for (Terminal terminal : ordination.getTerminalList())
        {
            terminal.update(this, this.getClass().getDeclaredField("birthdate"));
        }
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws NoSuchFieldException
    {
        this.phoneNumber = phoneNumber;
        for (Terminal terminal : ordination.getTerminalList())
        {
            terminal.update(this, this.getClass().getDeclaredField("phoneNumber"));
        }
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) throws NoSuchFieldException
    {
        this.emailAddress = emailAddress;
        for (Terminal terminal : ordination.getTerminalList())
        {
            terminal.update(this, this.getClass().getDeclaredField("emailAddress"));
        }
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address) throws NoSuchFieldException
    {
        this.address = address;
        for (Terminal terminal : ordination.getTerminalList())
        {
            terminal.update(this, this.getClass().getDeclaredField("address"));
        }
    }

    public ECard geteCard()
    {
        return eCard;
    }

    public void seteCard(ECard eCard) throws NoSuchFieldException
    {
        this.eCard = eCard;
        for (Terminal terminal : ordination.getTerminalList())
        {
            terminal.update(this, this.getClass().getDeclaredField("eCard"));
        }
    }

    @Override
    public String toString()
    {
        return String.format("%s %s", this.firstname, this.lastname);
    }
}
