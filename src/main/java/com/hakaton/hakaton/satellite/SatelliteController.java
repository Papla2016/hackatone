package com.hakaton.hakaton.satellite;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/satellite")
@RequiredArgsConstructor
public class SatelliteController {

    private final SatelliteRepository repository;

    @GetMapping
    ResponseEntity<Satellite> getSatellite(@PathVariable String id) {
        return ResponseEntity.ok(repository.getReferenceById(id));
    }

    @PostMapping
    ResponseEntity<Satellite> createSatellite(@RequestBody Satellite satellite) {
        try {
            return ResponseEntity.ok(repository.save(satellite));
        }catch (RuntimeException e) {
            System.out.println(e);
        }
        return null;
    }
}