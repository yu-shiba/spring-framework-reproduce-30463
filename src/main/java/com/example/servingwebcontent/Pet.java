package com.example.servingwebcontent;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.ToString;

@ToString
public class Pet implements Serializable {
    private LocalDateTime created = LocalDateTime.now();
}
