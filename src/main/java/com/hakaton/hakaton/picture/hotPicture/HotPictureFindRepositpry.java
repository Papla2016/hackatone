package com.hakaton.hakaton.picture.hotPicture;

import com.hakaton.hakaton.picture.Picture;
import com.hakaton.hakaton.picture.PictureType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("hotPictureFindRepository")
public interface HotPictureFindRepositpry extends CrudRepository<Picture, PictureType> {
    List<Picture> findHotPicture(PictureType isHotPicture);
}

