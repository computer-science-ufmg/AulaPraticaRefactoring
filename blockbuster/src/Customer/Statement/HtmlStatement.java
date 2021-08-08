package Customer.Statement;

import Customer.Customer;
import Movie.Rental;

import java.util.Enumeration;

public class HtmlStatement extends Statement {

    @Override
    protected String getFiguresForRental(Rental aRental) {
        return aRental.getMovie().getTitle()+ ": " + String.valueOf(aRental.getCharge()) + "<BR>\n";
    }

    @Override
    protected String getFooter(Customer aCustomer) {
        String result = "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) +
                        "</EM><P>\n" +
                        "On this rental you earned <EM>" +
                        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                        "</EM> frequent renter points<P>";
        return result;
    }

    @Override
    protected String getTitle(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }
}
