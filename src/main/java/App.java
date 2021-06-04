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

        String noun = myApp.readNoun();
        String verb = myApp.readVerb();
        String adjective = myApp.readAdjective();
        String adverb = myApp.readAdverb();
        String outputString = myApp.generateOutputString(noun, verb, adjective, adverb);
        myApp.printOutput(outputString);
    }

    private String readNoun() {
        System.out.print("Enter a noun: ");
        String noun = in.nextLine();
        return noun;
    }

    private String readVerb() {
        System.out.print("Enter a verb: ");
        String verb = in.nextLine();
        return verb;
    }

    private String readAdjective() {
        System.out.print("Enter an adjective: ");
        String adjective = in.nextLine();
        return adjective;
    }

    private String readAdverb() {
        System.out.print("Enter an adverb: ");
        String adverb = in.nextLine();
        return adverb;
    }

    private String generateOutputString(String noun, String verb, String adjective, String adverb) {
        return String.format("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
    }

    private void printOutput(String outputString) { System.out.println(outputString); }
}
