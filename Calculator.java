package Calculator;

import javax.xml.transform.Result;

public class Calculator{

    float x = 5;
    float y = 3;

    String add = "x + y = " + (x + y);
    String subtractXY = "x - y = " + (x - y);
    String subtractYX = "y - x = " + (y - x);
    String multiply = "x * y = " + x * y;
    String divideXY = "x / y = " + x / y;
    String divideYX = "y / x = " + y / x;


    float max = Math.max(x,y);

    float squareRootX = (float) Math.sqrt(x);
    float squareRootY = (float) Math.sqrt(y);

    float random = Math.round(Math.random() * 101); // or 100?


    public void Calculations(){

        System.out.println(subtractYX);

        System.out.println(max);
        System.out.println(squareRootY);
        System.out.println(random);

    }


    }
