package web.DAO;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import web.model.Car;

@Repository
public class CarDaoImpl implements CarDao {

  List <Car> carList;

  {
    carList = new ArrayList<>();
    carList.add( new Car("Mercedes" , "S500" , 2023));
    carList.add( new Car("Opel" , "Astra" , 2012));
    carList.add( new Car("BMW" , "X5M" , 2006));
    carList.add( new Car("Ford" , "Focus" , 2012));
    carList.add( new Car("Volvo" , "XC90" , 2024));
  }


  @Override
  public List<Car> getListCars(int count) {
    return carList.stream().limit(count).toList();
  }
}
