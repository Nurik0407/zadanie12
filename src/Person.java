public class Person {

    private String surname;
    private String name;
    private int age;

    void setSurname(String surname) {
        this.surname = surname;
    }

    String getSurname() {
        return surname;
    }

    void setName(String name) {
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setAge(int age){
        this.age=age;
    }
    int getAge(){
        return age;
    }
    void getInfoPerson(){
        System.out.println("Surname: " + getSurname());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("\n");
    }
}
