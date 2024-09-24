package challenges.challangle01.utils;

import challenges.challangle01.geometry.circle;
import challenges.challangle01.geometry.rectangle;

public class calculator {
    public static void main(String[] args) {
        circle circle = new circle(5.5);
        rectangle rectangle = new rectangle(5.5, 10.0);
        double cirArea = Math.round(Math.PI * Math.pow(circle.radius, 2));
        double recArea = Math.round(rectangle.width * rectangle.height);

        System.out.println("Circle area: " + cirArea);
        System.out.println("Rectangle area: " + recArea);
    }

}
