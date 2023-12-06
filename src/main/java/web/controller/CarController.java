package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

@Controller
public class CarController {

  public final CarServiceImp carServiceImp;


  public CarController(CarServiceImp carServiceImp) {
    this.carServiceImp = carServiceImp;
  }

  @GetMapping(value = "/cars")
  public String getParamOfCar(@RequestParam (value = "count", defaultValue = "5") int count, Model model) {
    model.addAttribute("carList" , carServiceImp.printCar(count));
    return "car";
  }
}
