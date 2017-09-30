package com.example.gameofcode;

import android.graphics.Bitmap;

/**
 * Created by Mohru on 30.09.2017.
 */

public class Character {
    String name;
    String house;
    String gender;
    boolean isAlive;
    String photoPath;
    Bitmap photo;

    public Character() {
    }

    public Character(String name, String house,
                     String gender, boolean isAlive, String photoPath, Bitmap photo) {
        this.name = name;
        this.house = house;
        this.gender = gender;
        this.isAlive = isAlive;
        this.photoPath = photoPath;
        this.photo = photo;
    }
}
