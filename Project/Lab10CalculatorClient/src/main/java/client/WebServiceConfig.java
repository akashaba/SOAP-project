package client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;


@Configuration
public class WebServiceConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("generated");
		return marshaller;
	}

	@Bean
	public AddClient greetingClient(Jaxb2Marshaller marshaller) {
		AddClient client = new AddClient();
		client.setDefaultUri("http://localhost:8080/ws/greeting");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
