import java.util.Stack;
import java.util.Scanner;

public class ICPAStack
{
   
   public static void main(String[] args)
   {
      Scanner stdin = new Scanner(System.in);
      Stack<Integer> numbers = new Stack<>();

      System.out.println("Please type a series of positive integers ended with 0:");

      int num;
      while (true) {
         num = stdin.nextInt();

         if (num == 0)  // 0 ends the input
            break;

         if (num > 0)
            numbers.push(num);
         else
            System.out.println("Only positive numbers please.");
      }

      System.out.println("\nNumbers in reverse order:");
      while (!numbers.isEmpty()) {
         System.out.print(numbers.pop() + " ");
      }

      System.out.println();
      stdin.close();
   }

}