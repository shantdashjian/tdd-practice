public class Game {
    public static final int NUMBER_OF_FRAMES = 10;
    public static final int MAX_NUMBER_OF_ROLLS = 21;
    private int[] rolls = new int[MAX_NUMBER_OF_ROLLS];
    private int currentRoll = 0;
    private int score;
    private int firstInFrame;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        score = 0;
        firstInFrame = 0;
        for (int frame = 0; frame < NUMBER_OF_FRAMES; frame++) {
            if (isStrike()) {
                updateScoreAndFirstInFrameForStrike();
            } else if (isSpare()) {
                updateScoreAndFirstInFrameForSpare();
            } else {
                updateScoreAndFirstInFrameForIncompleteFrame();
            }
        }
        return score;
    }

    private void updateScoreAndFirstInFrameForIncompleteFrame() {
        score += twoRollsInFrame();
        firstInFrame += 2;
    }

    private void updateScoreAndFirstInFrameForSpare() {
        score += Roll.SPARE.getValue() + nextRoll();
        firstInFrame += 2;
    }

    private void updateScoreAndFirstInFrameForStrike() {
        score += + Roll.STRIKE.getValue() + nextTwoRolls();
        firstInFrame += 1;
    }

    private int twoRollsInFrame() {
        return rolls[firstInFrame] + rolls[firstInFrame + 1];
    }

    private int nextRoll() {
        return rolls[firstInFrame + 2];
    }

    private int nextTwoRolls() {
        return rolls[firstInFrame + 1] + nextRoll();
    }

    private boolean isStrike() {
        return rolls[firstInFrame] == Roll.STRIKE.getValue();
    }

    private boolean isSpare() {
        return twoRollsInFrame() == Roll.SPARE.getValue();
    }
}
