package soap;

import generated.Acknoledgement;
import generated.CustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EleigibilityEndPoint {
    private static final String NAMESPACE = "http://akashabalearning/loanEligibilty";
    @Autowired
    private LoanEligibilty service;

    @PayloadRoot(namespace = NAMESPACE, localPart = "CustomerRequest")
    @ResponsePayload
    public Acknoledgement getLoanStatus(@RequestPayload CustomerRequest request){
        return service.checkLoanEligibility(request);
    }
}
