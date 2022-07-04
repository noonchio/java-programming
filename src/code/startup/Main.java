package code.startup;

public class Main {
    public static void main(String[] args) {
        int numOfGuessess = 0;
        GameHelper helper = new GameHelper();

        SimpleStartup theStartup = new SimpleStartup();

        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2 };

        theStartup.setLocationCells(locations);

        boolean isAlive = true;


        while (isAlive) {
            int guess = helper.getUserInput("Enter a number");

            String result = theStartup.checkYourself(guess);

            numOfGuessess++;

            if (result.equals("Destroyed")) {
                isAlive = false;

                System.out.println("You took " + numOfGuessess + " guesses" );
            }
        }
    }
}
