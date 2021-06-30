import lombok.Data;

public class Game {
    public static final int NUMBER_OF_FRAMES = 10;
    public static final int MAX_NUMBER_OF_ROLLS = 21;
    private int[] rolls = new int[MAX_NUMBER_OF_ROLLS];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        ScoreAndFirstInFrame scoreAndFirstInFrame = new ScoreAndFirstInFrame(0, 0);
        for (int frame = 0; frame < NUMBER_OF_FRAMES; frame++) {
            if (isStrike(scoreAndFirstInFrame)) {
                scoreAndFirstInFrame = getScoreAndFirstInFrameForStrike(scoreAndFirstInFrame);
            } else if (isSpare(scoreAndFirstInFrame)) {
                scoreAndFirstInFrame = getScoreAndFirstInFrameForSpare(scoreAndFirstInFrame);
            } else {
                scoreAndFirstInFrame = getScoreAndFirstInFrameForIncompleteFrame(scoreAndFirstInFrame);
            }
        }
        return scoreAndFirstInFrame.getScore();
    }

    private ScoreAndFirstInFrame getScoreAndFirstInFrameForIncompleteFrame(ScoreAndFirstInFrame scoreAndFirstInFrame) {
        return new ScoreAndFirstInFrame(
                scoreAndFirstInFrame.getScore() + twoRollsInFrame(scoreAndFirstInFrame.getFirstInFrame())
                , scoreAndFirstInFrame.getFirstInFrame() + 2);
    }

    private ScoreAndFirstInFrame getScoreAndFirstInFrameForSpare(ScoreAndFirstInFrame scoreAndFirstInFrame) {
        return new ScoreAndFirstInFrame(
                scoreAndFirstInFrame.getScore() + Roll.SPARE.getValue() + nextRoll(scoreAndFirstInFrame.getFirstInFrame())
                , scoreAndFirstInFrame.getFirstInFrame() + 2);
    }

    private ScoreAndFirstInFrame getScoreAndFirstInFrameForStrike(ScoreAndFirstInFrame scoreAndFirstInFrame) {
        return new ScoreAndFirstInFrame(
                scoreAndFirstInFrame.getScore() + Roll.STRIKE.getValue() + nextTwoRolls(scoreAndFirstInFrame.getFirstInFrame())
                , scoreAndFirstInFrame.getFirstInFrame() + 1);
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

    private boolean isStrike(ScoreAndFirstInFrame scoreAndFirstInFrame) {
        return rolls[scoreAndFirstInFrame.getFirstInFrame()]
                == Roll.STRIKE.getValue();
    }

    private boolean isSpare(ScoreAndFirstInFrame scoreAndFirstInFrame) {
        return twoRollsInFrame(scoreAndFirstInFrame.getFirstInFrame())
                == Roll.SPARE.getValue();
    }
}

@Data
class ScoreAndFirstInFrame {
    private final int score;
    private final int firstInFrame;
}
