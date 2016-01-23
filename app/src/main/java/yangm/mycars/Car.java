package yangm.mycars;

/**
 * Created by Michael on 1/21/2016.
 */
public class Car {
    private String make;
    private int year;
    private String model;
    private String origin;

    public Car() {
    }

    public Car(String make, int year, String model, String origin) {
        this.make = make;
        this.year = year;
        this.model = model;
        this.origin = origin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public static Car getTestCar(){
        Car car = new Car("Toyota", 1986, "Cressida", "Japanese");
        return car;
    }
}
