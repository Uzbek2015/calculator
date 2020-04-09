
import java.util.Scanner;


public class LabAssignments8_Odiljonova {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        //Declare variables
        int choice;
        double num1,num2;
        double answer = 0;
        
        //it is code for game "greeting words" design
         System.out.println(" *** Welcome to the simple calculator *** "
                 + "\n-----------------------------------------\n");
         //Prompt the user to enter a first number
         System.out.print(" Enter the first number: ");
         num1 = scan.nextDouble();
         //Prompt the user to enter a second number
         System.out.print(" Enter the second number: ");
         num2 = scan.nextDouble();
         
         // it is code validation loop for "user input" correct choice method number of times
         do{
         System.out.print("\n Please select one of the following options\n "
             + "\n 1 to Add\n 2 to Subtract\n 3 to Multiplay\n 4 to Divide\n"
              + "\nEnter your choice: ");
         choice = scan.nextInt();
         }while(choice > 4 || choice <= 0);
         
        //it is code control structure we used for fined correct choice method number show an answer to a user
        if(choice == 1)
        {
           answer = calcSum(num1,num2);
        }
        else if (choice == 2)
        {
            answer = calcSub(num1,num2);
        }
        else if (choice == 3)
        {
            answer = calcMul(num1,num2);
        }
        else
        {
            choice = 4;
            answer = calcDiv(num1,num2);
        }
        
        displayResults(answer);
    }
        public static double calcSum(double d1, double d2)
        {
            return d1+d2;
        }
        public static double calcSub(double d1, double d2)
        {
            return d1-d2;
        }
        public static double calcMul(double d1, double d2)
        {
            return d1*d2;
        }
        public static double calcDiv(double d1, double d2)
        {
            return d1/d2;
        }
    
    public static void displayResults(double ans)
    {
         System.out.println(" The answer is " + ans);
    }
}
 
        
        