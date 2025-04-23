import java.util.Random;
import java.util.Scanner;
public class Game {
public void start() {
Random random = new Random();
int numberToGuess = random.nextInt(100) + 1; // Generates number
between 1 and 100
Scanner scanner = new Scanner(System.in);
int guess = 0;
int attempts = 0;
System.out.println("Welcome to the Number Guessing Game!");
System.out.println("I have selected a number between 1 and 100.
Try to guess it!");
while (guess != numberToGuess) {
System.out.print("Enter your guess: ");
// Check if input is an integer
if (!scanner.hasNextInt()) {
System.out.println("Please enter a valid number!");
scanner.next(); // Clear invalid input
continue;
}
guess = scanner.nextInt();
attempts++;
if (guess < numberToGuess) {
System.out.println("Too low! Try again.");
} else if (guess > numberToGuess) {
System.out.println("Too high! Try again.");

} else {
System.out.println("Congratulations! You guessed the

number in " + attempts + " attempts.");

}
}
scanner.close();
}
}

public class Main {
public static void main(String[] args) {
// Create a new instance of the Game class
Game game = new Game();
System.out.println("Welcome to the Number Guessing Game!");
System.out.println("To Start Press Enter");
// Wait for user input to start the game
try {
System.in.read(); // Wait for Enter key
if( System.in.read() == '1') {
game.start(); // Start the game
} else {
System.out.println("Invalid input. Please press Enter to

start the game.");
}
} catch (Exception e) {
System.out.println("Error reading input: " + e.getMessage());
}
// Start the game
}
}
