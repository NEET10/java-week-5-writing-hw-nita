package week_5_writing_homework;

import java.util.ArrayList;

/*
Write a Java program to test an array list is empty or not. Define array list with underground tube names
 */
public class Programme_7_UnderGroundTubeNames {
    public void isEmpty(){
        ArrayList<String> tubeNames = new ArrayList<>();
        tubeNames.add("Bakerloo_line");
        tubeNames.add("Central_line");
        tubeNames.add("Circle_line");
        tubeNames.add("District_line");
        tubeNames.add("Hammersmith_&_City_line");
        tubeNames.add("Jubilee_line");
        tubeNames.add("Metropolitan_line");
        tubeNames.add("Northern_line");
        tubeNames.add("Picadilly_line");
        tubeNames.add("Victoria_line");
        tubeNames.add("Waterloo_&_City_line");
        System.out.println("Given Array List : "+tubeNames);
        if (tubeNames.isEmpty()){
            System.out.println("Given Array List is Empty!!");
        }else{
            System.out.println("Given Array List is not Empty!!");
        }
    }
    public static void main(String [] args){
        Programme_7_UnderGroundTubeNames obj = new Programme_7_UnderGroundTubeNames();
        obj.isEmpty();
    }
}

