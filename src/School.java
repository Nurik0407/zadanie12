public class School {
    private int number;
    private String place;
    private int schoolchildren;

    void setNumber(int number) {
        this.number = number;
    }

    int getNumber() {
        return number;
    }

    void setPlace(String place) {
        this.place = place;
    }

    String getPlace() {
        return place;
    }

    void setSchoolchildren(int schoolchildren) {
        this.schoolchildren = schoolchildren;
    }

    int getSchoolchildren() {
        return schoolchildren;
    }

    void getInfoSchool() {
        System.out.println("Number: "+getNumber());
        System.out.println("Place: "+getPlace());
        System.out.println("School children: "+getSchoolchildren());
        System.out.println("\n");
    }

}

