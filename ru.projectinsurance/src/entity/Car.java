package entity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

public class Car {
    private int id;
    private String carMake:
    private String color;
    private String carPlate;

    public Car (int id, String carMake, String color, String carPlate) {
        this.id = id;
        this.carMake = carMake;
        this.color = color;
        this.carPlate = carPlate;
    }
    public int getId () {
        return id;
    }
    public String getCarMake () {
        return carMake;
    }
    public String getColor () {
        return color;
    }
    public String getCarPlate () {
        return carPlate;
    }

    public static void main(String[] args) throws IOException {


    }

    }



}
