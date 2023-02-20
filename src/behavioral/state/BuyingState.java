package behavioral.state;

public class BuyingState extends State{

	BuyingState(User user) {
		super(user);
		user.setBuying(true);
	}

	@Override
	public String onActive() {
		user.changeState(new ActiveState(user));
		return "Buying (onActive)...";
	}

	@Override
	public String onDisable() {
		user.changeState(new DisablState(user));
		return "Buying (onDisable).....";
	}

	@Override
	public String onLock() {
		user.changeState(new DisablState(user));
		return "Buying (onLock)...";
	}

	@Override
	public String onBuy() {
		user.changeState(new BuyingState(user));
		return "Buying (onBuy)...";
	}
	
	
	

}
