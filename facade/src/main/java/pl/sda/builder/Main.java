package pl.sda.builder;

/**
 * Created by RENT on 2017-02-25.
 */
public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();

        PersonAddress address = new PersonAddress();
        address.setCity("Poznan");
        address.setStreet("Baraniaka 88");
        address.setPostalCode("60-600");
        Person person = personBuilder.withFirstName("Janek")
                .withLastName("Fasola")
                .withPesel("8483920943045")
                .withPersonAddress(address)
                .build();
        System.out.println(person);
    }
}
