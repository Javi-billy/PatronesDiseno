package behavioral.observer;

public class Main {

	public static void main(String[] args) {

		MyTopic topic = new MyTopic();
		
		Observer obs1 = new MyTopicSubscriber("obs1");
		Observer obs2 = new MyTopicSubscriber("obs2");
		Observer obs3 = new MyTopicSubscriber("obs3");
		
		topic.register(obs1);
		topic.register(obs2);
		topic.register(obs3);

		obs1.setSubject(topic);
		obs2.setSubject(topic);
		obs3.setSubject(topic);
		
		obs1.update();
		
		topic.postMessage("nuevo");
	}

}
