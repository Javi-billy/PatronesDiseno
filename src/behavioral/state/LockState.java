package behavioral.state;

public class LockState extends State {

	LockState(User user) {
		super(user);
	}

	@Override
	public String onActive() {
		return "Locked (onActive)....";
	}

	@Override
	public String onDisable() {		
		return "Locked (onDisable)....";
	}

	@Override
	public String onLock() {
		if (user.isBuying()) {
			user.changeState(new DisablState(user));
			return "Locked (onLock) stop buy....";
		}
		if (user.isEnable()) {
			user.changeState(new DisablState(user));
			return "Locked (onLock)->Disable....";
		}
		user.changeState(new ActiveState(user));
		return "Locked (onLock)...";
	}

	@Override
	public String onBuy() {
		return "Locked (onBuy)....";
	}

}
