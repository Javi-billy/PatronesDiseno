package behavioral.state;

public class DisablState extends State {

	DisablState(User user) {
		super(user);
		user.setBuying(false);
		user.setEnable(false);
	}

	@Override
	public String onActive() {
		user.changeState(new ActiveState(user));
		return "Disable (onActive)....";
	}

	@Override
	public String onDisable() {
		if (user.isBuying()) {
			user.changeState(new ActiveState(user));
			return "Disable (onDisable) stopBuy.....";
		} else {
			return "Disable (onDisable).... ";	
		}		
	}

	@Override
	public String onLock() {
		user.changeState(new ActiveState(user));
		return "Disable (onLock).....";
	}

	@Override
	public String onBuy() {
		user.changeState(new ActiveState(user));
		return "Disable (onBuy).....";
	}
	

}
