package behavioral.state;

public class ActiveState extends State {

	ActiveState(User user) {
		super(user);
	}

	@Override
	public String onActive() {
		user.changeState(new BuyingState(user));
		return "Active (onActive)...";
	}

	@Override
	public String onDisable() {
		user.changeState(new DisablState(user));
		return "Active (onDisable)...";
	}

	@Override
	public String onLock() {
		user.changeState(new LockState(user));
		return "Active (onLock)...";
	}

	@Override
	public String onBuy() {
		String action = user.startBuy();
		user.changeState(new BuyingState(user));
		return "Active (onBuy) ->"+action;
	}

}
