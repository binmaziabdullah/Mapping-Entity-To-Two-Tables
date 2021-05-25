package com.example.mapentitytotwotables.mapentitytotwotables;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping
    public Car saveCar(@RequestBody Car car){
        return carService.saveCar(car);
    }

    @GetMapping
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }

}
