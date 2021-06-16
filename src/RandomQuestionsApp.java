import java.util.Scanner;

public class RandomQuestionsApp {
    public static void main(String[] args) {
        int count =0;
        int numberOfQuestions = 5;
        int correctCount=0;
        int wrongCount =0;
        long startTime = System.currentTimeMillis();

        Scanner input = new Scanner(System.in);

        for (;count<numberOfQuestions; count++){
            int number1 = (int)(Math.random()*10);
            int number2 = (int)(Math.random()*10);

            if(number2>number1){
                int temp = number1;
                number1 = number2;
                number2=temp;
            }

            System.out.println("What is the difference of " + number1 + "-" + number2);
            int answer = input.nextInt();

            if(answer== (number1 - number2)) {
                System.out.println("You got it right, the answer is " + answer);
                correctCount++;

            }

            else{
                System.out.println("Try again " + number1 + "-"+ number2);
            }
            if((number1-number2)!=answer){
                wrongCount++;
            }

        }
        System.out.println("You got " + correctCount + " right");
        System.out.println("You got " + wrongCount + " wrong");

        //Printing the time it takes for the question to finish

        long endTime = System.currentTimeMillis();

        long testTime = endTime-startTime;
        System.out.println("The test took " + testTime/1000 + " seconds");


    }
}
