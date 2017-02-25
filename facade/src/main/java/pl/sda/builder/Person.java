package pl.sda.builder;

/**
 * Created by RENT on 2017-02-25.
 */
public class Person {
    private String firstName;
    private String lastName;
    private PersonAddress address;
    private String pesel;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public PersonAddress getAddress() {
        return address;
    }

    public void setAddress(PersonAddress address) {
        this.address = address;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
