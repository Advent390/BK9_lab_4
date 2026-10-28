package ua.edu.nuos.bk9_lab_4.converters;

import ua.edu.nuos.bk9_lab_4.data.Car;
import ua.edu.nuos.bk9_lab_4.dto.CarDto;

public class CarConvertor {

    public Car convert(CarDto carDto) {
        Car car = new Car();

        car.setId(carDto.getId());
        car.setBrand(carDto.getBrand());
        car.setModel(carDto.getModel());
        car.setProductionYear(carDto.getProductionYear());
        car.setFuelType(carDto.getFuelType());
        car.setColor(carDto.getColor());
        car.setMileage(carDto.getMileage());
        car.setPrice(carDto.getPrice());

        return car;
    }

    public CarDto convert(Car car) {
        CarDto c = new CarDto();

        c.setId(car.getId());
        c.setBrand(car.getBrand());
        c.setModel(car.getModel());
        c.setProductionYear(car.getProductionYear());
        c.setFuelType(car.getFuelType());
        c.setColor(car.getColor());
        c.setMileage(car.getMileage());
        c.setPrice(car.getPrice());
        return c;
    }
}