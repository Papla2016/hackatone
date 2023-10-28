package com.hakaton.hakaton.picture;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/picture")
@RequiredArgsConstructor
public class PictureController {
    private final PictureRepository repository;
    @GetMapping
    ResponseEntity<Picture> getPicture(@PathVariable String id){
        Picture picture = repository.getReferenceById(id);
        return ResponseEntity.ok(picture);
    }
    @PostMapping
    ResponseEntity<Picture> createPicture(@RequestBody Picture picture){
        try {
            return ResponseEntity.ok(repository.save(picture));
        } catch (RuntimeException e){
            return ResponseEntity.badRequest().build();
        }
    }
}
