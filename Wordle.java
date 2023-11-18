import java.io.File; //Importing the classes that will be needed later.
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.util.List;
import java.util.Random;
public class Wordle {
    static void testWord(String guess, String keyWord){ //A method for comparing the keyword and the guess letter by letter.
        for (int i = 0; i < guess.length(); i++){ //Initializing a for loop to iterate over each letter of both words.
            Character charLetter = guess.charAt(i);
            String strLetter = Character.toString(charLetter);
            Character wodLetter = keyWord.charAt(i);
            if (keyWord.contains(strLetter) && charLetter.equals(wodLetter)){ //Check the given conditions.
                System.out.println((i+1) + ". letter exists and located in right position.");
            } else if (keyWord.contains(strLetter) && !charLetter.equals(wodLetter)) {
                System.out.println((i+1) + ". letter exists but located in wrong position.");
            } else {
                System.out.println((i+1) + ". letter does not exist.");}}}
    static String suffix(int number){ //A method for creating the correct suffix for given number.
        if (number == 1) return "st";
        else if (number == 2) return "nd";
        else if (number == 3) return "rd";
        return "th";}
    static String randomChoice(String[] array){ //A method to pick a random value from given array.
        int random = new Random().nextInt(array.length);
        return array[random];}

    public static void main(String[] args) throws IOException {
        File file = new File("..\\src\\dict.txt"); //Path to the file to be read.
        Scanner scan = new Scanner(file);
        int arrLength = 2317;
        String [] dictionary = new String[arrLength]; //Creating the "dictionary".
        int counter = 0;
        while (scan.hasNextLine()){ //Append every word in the given text file to dictionary array.
            dictionary[counter] = scan.nextLine();
            counter++;}
        String keyWord = randomChoice(dictionary); //Set a random keyword from dictionary.
        List dictList = Arrays.asList(dictionary); //Convert the array to the list to look for elements.
        int tryCount = 1, argCount = 0; //Initialize the values for the loops.
        while (tryCount < 7){
            if (args[argCount].length() != 5){ //First check if word contains 5 letters.
                System.out.println("Try" + tryCount + " (" + args[argCount] + "): "+ "The length of word must be five!");

            } else if (!dictList.contains(args[argCount])){ //Then check if the given word is in the dictionary.
                System.out.println("Try" + tryCount + " (" + args[argCount] + "): " + "Word does not exist in the dictionary!");

            } else {
                if (args[argCount].equals(keyWord)){ //Check if guess is correct, if it is end the loop.
                    System.out.print("Try" + tryCount + " (" + args[argCount] + "): ");
                    System.out.println("Congratulations! You guess right in " + tryCount + suffix(tryCount) + " shot!");
                    break;}
                System.out.println("Try" + tryCount + " (" + args[argCount] + "): ");
                testWord(args[argCount], keyWord); /*If the guess is not correct print out letters' whereabouts. */ }
            tryCount++;
            argCount++;
            if (tryCount == 7){ //End the loop and print the keyword if the maximum try shot is reached.
                System.out.println("You exceeded maximum try shot!");
                System.out.println("You failed! The key word is " + keyWord + ".");}}}}
