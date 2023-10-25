package ua.edu.ucu.apps.lab7flower.flowers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;



@RestController
@RequestMapping("/api/flowers")
public class FlowerController {
    @GetMapping("/list")
    public List<Flower> getFlowers() {
        return List.of(new Flower(45, 0.8, FlowerColor.RED));
    }
}