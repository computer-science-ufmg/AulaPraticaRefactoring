package Customer.Statement;

import Customer.Customer;
import Movie.Rental;

import java.util.Enumeration;

public class TextStatement extends Statement{

    @Override
    protected String getFiguresForRental(Rental aRental) {
        return "\t" + aRental.getMovie().getTitle()+ "\t" + String.valueOf(aRental.getCharge()) + "\n";
    }

    @Override
    protected String getFooter(Customer aCustomer) {
        String result = "Amount owed is " +
                        String.valueOf(aCustomer.getTotalCharge()) + "\n" +
                        "You earned " +
                        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                        " frequent renter points";
        return result;
    }

    @Override
    protected String getTitle(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }
}
