public class University {

    University[] universities = new University[]{};
    private String name;
    private String country;
    private int price;


    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setCountry(String country) {
        this.country = country;
    }

    String getCountry() {
        return country;
    }

    void setPrice(int price) {
        this.price = price;
    }

    int getPrice() {
        return price;
    }
    void getInfoUniversity(){
        System.out.println("University: "+getName());
        System.out.println("Country: "+getCountry());
        System.out.println("Prise: "+getPrice());
        System.out.println("\n");
    }


}
