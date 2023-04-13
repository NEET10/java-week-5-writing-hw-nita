package week_5_writing_homework;

import java.util.ArrayList;
import java.util.Scanner;

/*
Write a Java program to retrieve an element (at a specified index) from a given array list
 */
public class Programme_6_RetrieveArrayListAtGivenIndex {
    public static void main(String [] args){
        ArrayList<String> vegetableList = new ArrayList<>();
        vegetableList.add("CUCUMBER");
        vegetableList.add("POTATO");
        vegetableList.add("CAULIFLOWER");
        vegetableList.add("CARROT");
        vegetableList.add("ONION");
        vegetableList.add("BEETROOT");
        vegetableList.add("BITTER_GOURD");
        vegetableList.add("MUSHROOM");
        System.out.println(vegetableList);
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an index number : ");
        int index = s.nextInt();
        if (index < vegetableList.size() && index >= 0){
            System.out.println(vegetableList.get(index));

        }else{
            System.out.println("Invalid Index!!");

        }
        s.close();
    }
}
