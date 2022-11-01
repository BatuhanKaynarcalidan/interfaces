package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new EmailLogger(),new SmsLogger(), new DatabaseLogger(),new FileLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer batuhan = new Customer(1,"Batuhan","Kaynarcalidan");
		customerManager.add(batuhan);
		

	}

}
