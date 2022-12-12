package com.reto.utils;

import com.github.javafaker.Faker;
import com.reto.models.Information;
import com.reto.models.PrimaryModel;

import java.text.SimpleDateFormat;

public class Generate
{
    private static final Faker FAKER = new Faker();

    public static PrimaryModel dataPrimary()
    {
        return new PrimaryModel(FAKER.bothify("???????########"),
                FAKER.bothify("###########"));
    }
    public static Information dataInformation()
    {
        String strDateFormat = "d/MM/yyyy";
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);

        return new Information(FAKER.name().name(),
                FAKER.name().lastName(),
                objSDF.format(FAKER.date().birthday()));
    }
}
