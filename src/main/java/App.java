/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Pohlmann
 */

import java.util.Scanner;
/*Enter a noun: dog
Enter a verb: walk
Enter an adjective: blue
Enter an adverb: quickly
Do you walk your blue dog quickly? That's hilarious!
 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String noun = myApp.readPartOfSpeech("noun");
        String verb = myApp.readPartOfSpeech("verb");
        String adjective = myApp.readPartOfSpeech("adjective");
        String adverb = myApp.readPartOfSpeech("adverb");
        String outputString = myApp.generateOutputString(noun, verb, adjective, adverb);
        myApp.printOutput(outputString);
    }

    private String readPartOfSpeech(String partOfSpeech) {
        System.out.print("Enter a " + partOfSpeech + " : ");
        String inputWord = in.nextLine();
        return inputWord;
    }

    private String generateOutputString(String noun, String verb, String adjective, String adverb) {
        return String.format("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
    }

    private void printOutput(String outputString) { System.out.println(outputString); }
}
