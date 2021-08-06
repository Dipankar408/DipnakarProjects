/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.simple.app;
import java.util.Scanner;
import com.simple.list.LinkedList;

import static com.simple.utilities.StringUtils.join;
import static com.simple.utilities.StringUtils.split;
import static com.simple.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r=sc.nextDouble();
        Circle c=new Circle(r);
        c.circleInfo();
    }
}
