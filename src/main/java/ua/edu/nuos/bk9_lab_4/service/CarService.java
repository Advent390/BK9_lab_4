package ua.edu.nuos.bk9_lab_4.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.edu.nuos.bk9_lab_4.converters.CarConvertor;
import ua.edu.nuos.bk9_lab_4.dto.CarDto;
import ua.edu.nuos.bk9_lab_4.repository.CarRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CarService {
    private final CarConvertor carConvertor = new CarConvertor();
    private final CarRepository carRepository;

    public List<CarDto> getCars() {
        return carRepository.findAll()
                .stream()
                .map(carConvertor::convert)
                .toList();
    }

    @Transactional
    public void saveCar(CarDto carDto) {
        carRepository.save(carConvertor.convert(carDto));
    }

    @Transactional
    public void deleteById(Integer id) {
        if (id == null) throw new IllegalArgumentException("Car id cannot be null");
        carRepository.deleteById(id);
    }

    @Transactional
    public CarDto findById(Integer id) {
        if (id == null) throw new IllegalArgumentException("Car id cannot be null");
        return carRepository.findById(id)
                .map(carConvertor::convert)
                .orElse(null);
    }
}