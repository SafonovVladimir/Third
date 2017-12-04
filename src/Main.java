import com.thrifty.Cars;
import javafx.scene.shape.Shape;

import java.util.ArrayList;

public class Main {
    int i = 0;
    String s = "";

    public static void main(String[] args) {
        int s = 0;
        int t = 0;
        Cars car = new Cars();
        System.out.println("Скорость машины "+car.carSpeed(s, t)+" км/ч");

        Cars newCar = new Cars();
        System.out.println("Скорость второй машины: "+newCar.carSpeed(300, 2)+ "км/ч");

//        ArrayList<Shape> shapes = new ArrayList<Shape>();

//        Object object = new Object();
//        System.out.println(object.getClass());
    }


}
