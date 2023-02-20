package behavioral.state;

public class User {

	private State state;
	private boolean buying = false;
	private boolean enable = false;

	public User() {
		this.state = new ActiveState(this);
		setEnable(true);
		setBuying(true);
	}

	public String startBuy() {
		return "Buying t-shirt";
	}

	public void changeState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public boolean isBuying() {
		return buying;
	}

	public void setBuying(boolean buying) {
		this.buying = buying;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

}
