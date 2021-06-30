public class Game {
    public static final int NUMBER_OF_FRAMES = 10;
    public static final int MAX_NUMBER_OF_ROLLS = 21;
    private int[] rolls = new int[MAX_NUMBER_OF_ROLLS];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0;
        int firstInFrame = 0;
        for (int frame = 0; frame < NUMBER_OF_FRAMES; frame++) {
            if (isStrike(rolls[firstInFrame])) {
                score += RollType.STRIKE.getValue() + nextTwoRolls(firstInFrame);
                firstInFrame += 1;
            } else if (isSpare(firstInFrame)) {
                score += RollType.SPARE.getValue() + nextRoll(firstInFrame);
                firstInFrame += 2;
            } else {
                score += twoRollsInFrame(firstInFrame);
                firstInFrame += 2;
            }
        }
        return score;
    }

    private int twoRollsInFrame(int firstInFrame) {
        return rolls[firstInFrame] + rolls[firstInFrame + 1];
    }

    private int nextRoll(int firstInFrame) {
        return rolls[firstInFrame + 2];
    }

    private int nextTwoRolls(int firstInFrame) {
        return rolls[firstInFrame + 1] + nextRoll(firstInFrame);
    }

    private boolean isStrike(int roll) {
        return roll == RollType.STRIKE.getValue();
    }

    private boolean isSpare(int firstInFrame) {
        return twoRollsInFrame(firstInFrame) == RollType.SPARE.getValue();
    }
}
