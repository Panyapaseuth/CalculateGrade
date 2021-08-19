package com.company;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        PrintWriter output = null;
        try {
            File a = new File("Score.txt");
            output = new PrintWriter(new File("Grade.txt"));
            Scanner input = new Scanner(a);

            String nisit = "";

            while (input.hasNext()){
                nisit = input.nextLine();
//                System.out.println("Information = " + nisit);
                int pos = nisit.indexOf(" ");
                String scoreStr = nisit.substring(pos, nisit.length());

//                System.out.println(pos);
//                System.out.println(score);
//                System.out.println(scoreStr.trim());

                scoreStr = scoreStr.trim();
                double score = Double.parseDouble(scoreStr); //Change String to integer

                String grade = "";

                if(score>80){
                    grade = "A";
                }else if(score>70){
                    grade = "B";
                }else if(score>60){
                    grade = "C";
                }else if(score>50){
                    grade = "D";
                }else {
                    grade = "F";
                }

                System.out.println(nisit + " = " + grade);
                output.println(nisit + " = " + grade);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        output.close();
    }
}
