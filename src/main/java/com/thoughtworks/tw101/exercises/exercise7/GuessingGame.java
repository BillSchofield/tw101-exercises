package com.thoughtworks.tw101.exercises.exercise7;

public class GuessingGame {
    private int secretNumber;
    private boolean isGuessed;
    private GameHelper helper = new GameHelper();

    public GuessingGame(int maxBound) {
        secretNumber = (int) (Math.random() * (maxBound + 1));
//        System.out.println("FYI, the secret number is: " + secretNumber);
    }


    public void layGroundRules() {
        notify(border());
        notify("Welcome to Guess That Number!");
        notify("Try to guess a randomly generated number, between 1 and 100.");
        notify("PSA: Please only use digits in your guess. For example '79' not 'seventy-nine'.");
        notify(border());
        notify("");
    }

    public void takeGuesses() {

        while(!isGuessed) {
            String guess = helper.getUserInput("Please enter a number guess: ");
            checkGuess(guess);
        }

        finishUp();
    }

    public void checkGuess(String guess){

        int num = Integer.parseInt(guess);

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

    public void finishUp() {
        notify(border());
        notify("Well done! You guessed the secret number, " + secretNumber + ".");
        notify(border());
    }

    private void notify(String message){
        System.out.println(message);
    }

    private String border() {
        return "%%%%%%%%%%%%%%%%%%%%";
    }

}
