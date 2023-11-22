package com.tobeto.spring.b.dtos.requests.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCarRequest {
    private String brand;
    private  String model;
    private String numberPlate;
    private  String type;
    private  int kilometer;

}
