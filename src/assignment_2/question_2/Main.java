package assignment_2.question_2;

public class Main {

    public static void main(String[] args) {

        /*declaring a variable that will be used to check which column of numbers we are in. after the tenth
        * number we want to print a new line as to keep the formatting neat*/
        int count = 1;

        /*Using a for loop to loop over a range of 40 numbers*/
        for(int i = 1; i <= 40; i ++){

            /* Using a defined class to store a number and to get the pentagonal */
            pentagonalNumberConvertor convertor = new pentagonalNumberConvertor(i);

            /* printing out the pentagonal number using print formatting and our defined class and get method*/
            System.out.printf("%-10d",convertor.getPentagonalNum());

            /*checking if count is 10, if it is 10 then print a new line so that we can format the table of
            * pentagonals neatly and increment count so that we can carry on formatting*/
            if(count % 10 == 0){
                System.out.println();
            }
            count++;
        }
    }
}

/* Self defined class used to convert the number to the pentagonal number */
class pentagonalNumberConvertor{

    /* class variable*/
    int pentagonalNum;

    /* Class constructor that will convert the input number to a pentagonal*/
    public pentagonalNumberConvertor(int numInput){

        /* Converting the number into a pentagonal and storing it*/
        this.pentagonalNum = (numInput * (3 * numInput - 1)) / 2;
    }

    /* Getter for the pentagonal number*/
    public int getPentagonalNum(){

        /*returning  the pentagonal */
        return pentagonalNum;
    }
}