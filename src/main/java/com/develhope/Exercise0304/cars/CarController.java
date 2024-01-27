package com.develhope.Exercise0304.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @PostMapping("/addcar")
    public CarEntity addCar(@RequestBody CarEntity carEntity) {
        CarEntity newCar = carRepository.saveAndFlush(carEntity);
        return newCar;
    }

    @GetMapping("/allcars")
    public List<CarEntity> seeCars() {
        List<CarEntity> carList = carRepository.findAll();
        return carList;
    }

}
/*

    utilizza HAL Explorer per aggiungere 2 macchine alla base dati
        utilizza HAL Explorer per vedere tutte le macchine nella base dati*/
