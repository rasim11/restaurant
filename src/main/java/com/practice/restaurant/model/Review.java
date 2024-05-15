package com.practice.restaurant.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Getter
@Setter
@Data
public class Review {
    private String name;
    private String text;
    private Image avatar;

    public Review(String name, String text) {
        this.name = name;
        this.text = text;
    }
}
