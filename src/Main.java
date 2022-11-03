import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        

        University university1 = new University();
        University university2 = new University();
        University university3 = new University();

        university1.setName("Harvard");
        university1.setCountry("USA");
        university1.setPrice(50000);

        university2.setName("Oxford");
        university2.setCountry("USA");
        university2.setPrice(50000);

        university3.setName("AUCA");
        university3.setCountry("Kyrgyzstan");
        university3.setPrice(30000);

        University[] universities = new University[]{university1, university2, university3};
        for (University university : universities) {
            university.getInfoUniversity();

        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        School school1 = new School();
        School school2 = new School();
        School school3 = new School();

        school1.setNumber(1);
        school1.setPlace("Bishkek");
        school1.setSchoolchildren(400);


        school2.setNumber(23);
        school2.setPlace("Talas");
        school2.setSchoolchildren(300);


        school3.setNumber(6);
        school3.setPlace("Bishkek");
        school3.setSchoolchildren(560);

        School[] schools = new School[]{school1, school2, school3};
        for (School x : schools) {
            x.getInfoSchool();
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.setBrend("BMW");
        car1.setModel("X5");
        car1.setPtise(5000);

        car2.setBrend("Mers");
        car2.setModel("320");
        car2.setPtise(6000);

        car3.setBrend("LAND ROVER");
        car3.setModel("Range Rover");
        car3.setPtise(10000);

        Car[] cars = new Car[]{car1, car2, car3};
        for (Car carss : cars) {
            carss.getInfoCar();
        }


            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


            Person person1 = new Person();
            Person person2 = new Person();
            Person person3 = new Person();
            Person person4 = new Person();

            person1.setSurname("Zholdoshov");
            person1.setName("Nuradil");
            person1.setAge(18);

            person2.setSurname("Shabdanov");
            person2.setName("Ilim");
            person2.setAge(18);

            person3.setSurname("Akbaraliev");
            person3.setName("Dastan");
            person3.setAge(18);

            person4.setSurname("Abdymomunov");
            person4.setName("Sanzhar");
            person4.setAge(19);

            Person[] persons = new Person[]{person1, person2, person3, person4};
            for (Person person : persons) {
                person.getInfoPerson();
            }


    }
}