package com.hakaton.hakaton.circle;

import lombok.RequiredArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hotpicture")
@RequiredArgsConstructor
public class CircleController {
    private final CircleRepository repository;

    @GetMapping
    ResponseEntity<Circle> getCircle(@PathVariable String id) {
        Circle circle = repository.getReferenceById(id);
        return ResponseEntity.ok(circle);
    }
    @PostMapping
    ResponseEntity<Circle> createSatellite(@RequestBody Circle circle) {
        try {
            return ResponseEntity.ok(repository.save(circle));
        }catch (RuntimeException e) {
            System.out.println(e);
        }
        return null;
    }
}
