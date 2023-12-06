package web.DAO;

import java.util.List;
import web.model.Car;

public interface CarDao {

  List <Car> getListCars (int count);

}
