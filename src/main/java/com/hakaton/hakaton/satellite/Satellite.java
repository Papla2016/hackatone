package com.hakaton.hakaton.satellite;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Satellite {

    @Id
    private String TLE;

    @Enumerated(EnumType.STRING)
    private StatusType status;

}
