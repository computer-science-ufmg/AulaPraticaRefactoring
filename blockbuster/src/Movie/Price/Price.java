package Movie.Price;

import Movie.Movie;

public abstract class Price {

    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        // add frequent renter points
        int points = 1;
        // add bonus for a two day new release rental
        if ((this.getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1){
            points ++;
        }

        return points;
    }

}