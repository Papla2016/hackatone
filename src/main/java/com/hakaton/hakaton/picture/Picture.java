package com.hakaton.hakaton.picture;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;


import java.sql.Date;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String url_image;

    private Date date;

    @Enumerated(EnumType.STRING)
    private PictureType isHotPicture;
}
