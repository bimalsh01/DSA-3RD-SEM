// Data types in java
// Premitive data types 2. Non premitive datatypes/refresh data types
// premitive- numeric value-- int,byte,long, short, float, char, boolean
//Non premitive -- str, array, user-defined class

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args){
    System.out.println("Write your character:");
    Scanner sc = new Scanner(System.in);
    char name = sc.next().charAt(0);
    System.out.println("The character type is:"+ name);


    }
}
