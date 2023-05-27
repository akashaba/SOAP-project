package client;

import generated.AddRequest;
import generated.MultiplyRequest;
import generated.SubtractRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	AddClient addClient;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		AddRequest addRequest = new AddRequest();
		addRequest.setNumber1(4);
		addRequest.setNumber2(5);
		System.out.println("Addition: "+addClient.add(addRequest.getNumber1(), addRequest.getNumber2()));

		SubtractRequest subtractRequest = new SubtractRequest();
		subtractRequest.setNumber1(4);
		subtractRequest.setNumber2(5);
		System.out.println("Subtraction: "+addClient.subtract(subtractRequest.getNumber1(), subtractRequest.getNumber2()));

		MultiplyRequest multiplyRequest = new MultiplyRequest();
		multiplyRequest.setNumber1(4);
		multiplyRequest.setNumber2(5);
		System.out.println("Multiply: "+addClient.multiply(multiplyRequest.getNumber1(), multiplyRequest.getNumber2()));
	}

}


