public class Rental {

    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public double getCharge() {
        double amount = 0;
        switch (this.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                amount += 2;
                if (this.getDaysRented() > 2)
                    amount += (this.getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                amount += this.getDaysRented() * 3;
                break;
            case Movie.CHILDREN:
                amount += 1.5;
                if (this.getDaysRented() > 3)
                    amount += (this.getDaysRented() - 3) * 1.5;
                break;
        }
        return amount;
    }

    public int getFrequentRenterPoints(){
        // add frequent renter points
        int points = 1;
        // add bonus for a two day new release rental
        if ((this.getMovie().getPriceCode() == Movie.NEW_RELEASE) && this.getDaysRented() > 1){
            points ++;
        }

        return points;
    }
}