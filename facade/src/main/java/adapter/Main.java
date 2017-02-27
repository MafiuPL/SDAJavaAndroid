package adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-02-27.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Carimpl();
        Person person = new Personimpl();

        CarToPersonAdapter carToPersonAdapter = new CarToPersonAdapter(car);

        List<Person> personList = new ArrayList<>();

        personList.add(person);
        personList.add(carToPersonAdapter);

        for (Person personFromList : personList) {
            personFromList.move();
            personFromList.say();
        }
    }

    {
        Person person = new Personimpl();
        Car car = new Carimpl();

        PersonToCarAdapter personToCarAdapter = new PersonToCarAdapter(person);

        List<Car> carList = new ArrayList<>();

        carList.add(car);
        carList.add(personToCarAdapter);

        for (Car carFromList : carList) {
            carFromList.horn();
            carFromList.drive();
        }
    }
}
