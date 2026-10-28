package ua.edu.nuos.bk9_lab_4.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ua.edu.nuos.bk9_lab_4.dto.CarDto;
import ua.edu.nuos.bk9_lab_4.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/car")
@AllArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping
    public String getCars(Model model) {
        List<CarDto> carDtoList = carService.getCars();

        model.addAttribute("car", new CarDto());
        model.addAttribute("carEdit", new CarDto());
        model.addAttribute("carDtoList", carDtoList);
        return "car";
    }

    @PostMapping("/save")
    public String createCar(@ModelAttribute CarDto carDto) {
        carService.saveCar(carDto);
        return "redirect:/car";
    }

    @PostMapping("/update")
    public String updateCar(@ModelAttribute CarDto carDto) {
        if (carDto.getId() == null) {
            throw new RuntimeException("Car ID is null");
        }
        carService.saveCar(carDto);
        return "redirect:/car";
    }

    @PostMapping("/delete/{id}")
    public String deleteCar(@PathVariable Integer id) {
        carService.deleteById(id);
        return "redirect:/car";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<CarDto> findById(@PathVariable Integer id) {
        CarDto response = carService.findById(id);
        if (response != null) {
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
}