package Movie.Price;

import Movie.Movie;

public class ChildrensPrice extends Price {
    public int getPriceCode() {
        return Movie.CHILDREN;
    }
}