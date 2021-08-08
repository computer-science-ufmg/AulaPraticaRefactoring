package Customer.Statement;

import Customer.Customer;
import Movie.Rental;

import java.util.Enumeration;

public abstract class Statement {
    public String value(Customer aCustomer){

        Enumeration rentals = aCustomer.getRentals();
        String result = this.getTitle(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += this.getFiguresForRental(each);
        }
        //add footer lines
        result += this.getFooter(aCustomer);
        return result;
    }

    protected abstract String getTitle(Customer aCustomer);
    protected abstract String getFiguresForRental(Rental aRental);
    protected abstract String getFooter(Customer aCustomer);
}
