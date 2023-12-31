package com.test04.site.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Color {
    @Id
    private int id;
    private String name;
    private double weight;

    }

