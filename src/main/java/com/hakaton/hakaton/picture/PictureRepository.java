package com.hakaton.hakaton.picture;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PictureRepository extends JpaRepository<Picture, String>{
}
