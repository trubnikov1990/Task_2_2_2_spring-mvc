package web.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDaoImpl;
import web.model.Car;

@Service
public class CarServiceImp implements CarService {


  private final CarDaoImpl carDao;

  public CarServiceImp(CarDaoImpl carDao) {
    this.carDao = carDao;
  }


  @Override
  public List<Car> printCar(int count) {
    return carDao.getListCars(count);
  }
}
