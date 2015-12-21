package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;

public class GuessingGame {

    private final int secretNumber;
    private boolean isGuessed;
    private ArrayList<String> guesses;

    private final GameHelper helper = new GameHelper();
    private final String border = "%%%%%%%%%%%%%%%%%%%%";

    public GuessingGame(int maxBound) {
        secretNumber = (int) (Math.random() * (maxBound + 1));
        System.out.println("FYI, the secret number is: " + secretNumber);
        guesses = new ArrayList<>();
    }


    public void layGroundRules() {
        notify(border);
        notify("Welcome to Guess That Number - now smarter!");
        notify("Try to guess a randomly generated number, between 1 and 100.");
        notify("To submit a guess, please type in numbers from your keyboard.");
        notify(border);
        notify("");
    }

    public void takeGuesses() {

        while (!isGuessed) {
            String guess = helper.getUserInput("Please enter a number guess: ");
            guesses.add(guess);
            checkGuess(guess);
        }

        finishUp();
    }

    private void checkGuess(String guess) {

        try {
            int num = Integer.parseInt(guess);
            giveFeedback(num);
        } catch (NumberFormatException e){
            notify("Sorry, that's not a valid guess. Try typing a number, e.g. '79'.");
        }
    }

    private void giveFeedback(int num) {
        if (num == secretNumber) {
            isGuessed = true;
            notify("oooOOOoo!");
            notify("");
        } else if (num < secretNumber) {
            notify("Too low!");
        } else if (num > secretNumber) {
            notify("Too high!");
        } else {
            notify("Erm....dunno what to do with that...");
        }
    }

    private String formattedGuesses() {
//       return String.join(", ", guesses);
        StringBuilder result = new StringBuilder();
        int unsuccessfulGuesses = guesses.size() - 1;
        for(int i = 0; i < unsuccessfulGuesses; i++){
            if (i == unsuccessfulGuesses - 1) {
                result.append("and ").append(guesses.get(i));
                break;
            }

            result.append(guesses.get(i)).append(", ");
        }

        return result.toString();
    }

    private void finishUp() {
        notify(border);
        notify("Well done! You guessed the secret number, " + secretNumber + ".");
        notify("You took " + guesses.size() + " guesses and tried " + formattedGuesses() + " before you got it.");
        notify(border);
    }

    private void notify(String message) {
        System.out.println(message);
    }

}
