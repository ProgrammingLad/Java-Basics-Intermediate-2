package PPart17ImprovedRockPaperScissors;

public enum GameObjects {

	ROCK, PAPER, SCISSORS;
	
	private GameObjects beats;
	
	static {
		ROCK.beats = SCISSORS;
		PAPER.beats = ROCK;
		SCISSORS.beats = PAPER;
	}

	public boolean beats(GameObjects other) {
		return this.beats == other;
	}
}
