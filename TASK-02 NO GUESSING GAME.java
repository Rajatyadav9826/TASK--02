/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    int number = rand.nextInt(100) + 1;
    System.out.println("I've picked a random number between 1 and 100. Can you guess it?");
    int guess = -1;
    while (guess != number) {
      System.out.print("Enter your guess: ");
      guess = in.nextInt();
      if (guess < number) {
        System.out.println("Too low! Try again.");
      } else if (guess > number) {
        System.out.println("Too high! Try again.");
      }
    }
    System.out.println("Congratulations! You got it right!");
  }
}


