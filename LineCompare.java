package com.company;

public class LineCompare {

    public static class line_length_generator {
        // Declaring the points
        int x_one;
        int y_one;

        int x_two;
        int y_two;



        line_length_generator(int x1, int y1, int x2, int y2){
            // Initializing the points
            this.x_one = x1;
            this.y_one = y1;
            this.x_two = x2;
            this.y_two = y2;


        }

        double line_length(){
            // Finding the length of the line
            return Math.sqrt(((x_two - x_one) ^ 2) + (y_two - y_one) ^ 2);
        }

    }


    public static void main(String[] args) {
        // creating two Instance of class
        line_length_generator line_one = new line_length_generator( 5 , 2 , 9, 9 );
        line_length_generator line_two = new line_length_generator(5, 2, 9, 9);
        // Comparing the lengths
        int classifier = Double.compare(line_one.line_length(), line_two.line_length());
        switch(classifier){
            // Line one is longest
            case 1:
                System.out.println("LINE ONE IS THE LONGEST "+line_one.line_length());
                break;
            // Line two is the longest
            case -1 :
                System.out.println("LINE TWO IS THE LONGEST "+line_two.line_length());
                break;
            // both lines are equal
            default :
                System.out.println("BOTH LINES ARE EQUAL IN LENGTH");
                break;
        }
    }

}