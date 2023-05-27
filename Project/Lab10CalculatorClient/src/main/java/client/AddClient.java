package client;

import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import generated.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class AddClient extends WebServiceGatewaySupport {

	public int add(int number1, int number2) {
		AddRequest request = new AddRequest();
		request.setNumber1(number1);
		request.setNumber2(number2);
		
		AddResponse response = (AddResponse)
				getWebServiceTemplate().marshalSendAndReceive(request);
		return response.getResult();
	}

	public int subtract(int number1, int number2) {
		SubtractRequest request = new SubtractRequest();
		request.setNumber1(number1);
		request.setNumber2(number2);

		SubtractResponse response = (SubtractResponse)
				getWebServiceTemplate().marshalSendAndReceive(request);
		return response.getResult();
	}

	public int multiply(int number1, int number2) {
		MultiplyRequest request = new MultiplyRequest();
		request.setNumber1(number1);
		request.setNumber2(number2);

		MultiplyResponse response = (MultiplyResponse)
				getWebServiceTemplate().marshalSendAndReceive(request);
		return response.getResult();
	}
}


