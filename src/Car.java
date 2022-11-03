public class Car {
    private String brend;
    private  String model;
    private int ptise;

    void  setBrend(String brend){
        this.brend = brend;
    }
    String getBrend(){
        return brend;
    }
    void setModel(String model){
        this.model=model;
    }
    String getModel(){
        return model;
    }
    void setPtise(int ptise){
        this.ptise=ptise;
    }
    int getPtise(){
        return ptise;
    }
    void getInfoCar(){
        System.out.println("Brand: "+getBrend());
        System.out.println("Model: " + getModel());
        System.out.println("Prise: " + getPtise()+'$');
        System.out.println("\n");
    }
}

