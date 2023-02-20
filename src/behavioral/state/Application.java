package behavioral.state;

public class Application {

	public static void main(String[] args) {
		User user = new User();
		user.setEnable(true);
		user.setBuying(true);
		
		System.out.println("---------- ACTIVE -------------");
		
		ActiveState activeState = new ActiveState(user);
		System.out.println(activeState.onActive());
		/*System.out.println(activeState.onBuy());
		System.out.println(activeState.onDisable());
		System.out.println(activeState.onLock());*/

		System.out.println("    "+user.getState().onActive());
		System.out.println("    "+user.getState().onBuy());
		System.out.println("    "+user.getState().onDisable());
		System.out.println("    "+user.getState().onLock());
		
		System.out.println("----------- BUYING -----------");
		
		BuyingState buyingState = new BuyingState(user);
		System.out.println(buyingState.onBuy());
		/*System.out.println(buyingState.onActive());		
		System.out.println(buyingState.onDisable());
		System.out.println(buyingState.onLock());*/
		
		System.out.println("    "+user.getState().onActive());
		System.out.println("    "+user.getState().onBuy());
		System.out.println("    "+user.getState().onDisable());
		System.out.println("    "+user.getState().onLock());
		
		System.out.println("------------ DISABLED -----------");
		
		DisablState disablState = new DisablState(user);
		System.out.println(disablState.onDisable());
		/*System.out.println(disablState.onBuy());
		System.out.println(disablState.onActive());				
		System.out.println(disablState.onLock());*/
		
		System.out.println("    "+user.getState().onActive());
		System.out.println("    "+user.getState().onBuy());
		System.out.println("    "+user.getState().onDisable());
		System.out.println("    "+user.getState().onLock());
		
		System.out.println("------------- LOCK ----------");
		
		LockState lockState = new LockState(user);
		System.out.println(lockState.onLock());
		/*System.out.println(lockState.onDisable());
		System.out.println(lockState.onBuy());
		System.out.println(lockState.onActive());*/						
		
		System.out.println("    "+user.getState().onActive());
		System.out.println("    "+user.getState().onBuy());
		System.out.println("    "+user.getState().onDisable());
		System.out.println("    "+user.getState().onLock());
		
		System.out.println("-----------------------");
	}

}
