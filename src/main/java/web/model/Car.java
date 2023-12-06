package web.model;

public class Car {

  private String carMake;
  private String model;

  private int year;

  public Car (){}

  public Car(String carMake, String model, int year) {
    this.carMake = carMake;
    this.model = model;
    this.year = year;
  }

  public String getCarMake() {
    return carMake;
  }

  public void setCarMake(String carMake) {
    this.carMake = carMake;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }
}
