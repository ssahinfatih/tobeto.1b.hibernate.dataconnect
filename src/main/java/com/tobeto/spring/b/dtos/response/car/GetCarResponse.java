package com.tobeto.spring.b.dtos.response.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCarResponse {
    private String brand;
    private  String model;
    private  String type;
}
