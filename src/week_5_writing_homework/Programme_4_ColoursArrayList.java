package week_5_writing_homework;
/*
Write a Java program to create a new array list, add some colours (string)
and printout the collection using for each loop.
 */

import java.util.ArrayList;

public class Programme_4_ColoursArrayList {
    public static void main(String [] args){
        ArrayList<String> colourList = new ArrayList<>();
        colourList.add("RED");
        colourList.add("BLUE");
        colourList.add("GREEN");
        colourList.add("YELLOW");
        colourList.add("BLACK");
        colourList.add("WHITE");
        colourList.add("ORANGE");
        colourList.add("PURPLE");
        colourList.add("CYAN");
        for (String colorList: colourList) {
            System.out.println(colorList);
        }
    }
}
