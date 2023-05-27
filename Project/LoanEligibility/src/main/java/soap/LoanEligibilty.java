package soap;

import generated.Acknoledgement;
import generated.CustomerRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanEligibilty {
    public Acknoledgement checkLoanEligibility(CustomerRequest request){
        Acknoledgement acknoledgement = new Acknoledgement();
        List<String> mismatchListCriteria = acknoledgement.getCriteriaMismatch();
        if (!(request.getAge()>30 && request.getAge()<=60)){
            mismatchListCriteria.add("Person age should be between 30 and 60");
        }
        if (!(request.getYearlyIncome()>30000)){
            mismatchListCriteria.add("Minimum income should be more than $30000");
        }
        if (!(request.getCreditScore()>500)){
            mismatchListCriteria.add("Low creditScore, Please try after 6 months");
        }

        if (mismatchListCriteria.size()>0){
            acknoledgement.setApprovedAmount(0);
            acknoledgement.setIsEligible(false);
        }else {
            acknoledgement.setApprovedAmount(5000);
            acknoledgement.setIsEligible(true);
            mismatchListCriteria.clear();
        }
        return acknoledgement;
    }
}