package com.reto.utils;

import com.github.javafaker.Faker;
import com.reto.models.PrimaryModel;

public class Generate
{
    private static final Faker FAKER = new Faker();

    public static PrimaryModel dataPrimary()
    {
        return new PrimaryModel(FAKER.bothify("???????########"),
                FAKER.bothify("###########"));
    }
}
