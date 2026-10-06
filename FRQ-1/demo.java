public class GameSimulator {
    private int targetScore;
    private int maxSpins;

    public GameSimulator(int targetScore, int maxSpins) {
        this.targetScore = targetScore;
        this.maxSpins = maxSpins;
    }

    /** Returns an integer score from 1 to 10 inclusive. */
    public int spin() {
        /* implementation not shown */
    }

    /** Simulates one round of the game according to the rules above.
     *  @return true if targetScore is reached or exceeded within maxSpins;
     *          false otherwise.
     */
    public boolean playRound() {
        /* to be implemented */
    }
}
