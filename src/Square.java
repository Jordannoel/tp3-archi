public class Square {
	private final int SIZE = 40;

	private int state = 0;

	public Square(int state) {
		this.state = state;
	}

	public int getSize() {
		return SIZE;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
}
