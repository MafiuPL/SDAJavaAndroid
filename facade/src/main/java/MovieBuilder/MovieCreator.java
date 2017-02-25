package MovieBuilder;

import pl.sda.builder.PersonBuilder;

/**
 * Created by RENT on 2017-02-25.
 */
public class MovieCreator {
    private Movie movie;

    public MovieCreator() {
        movie = new Movie();
    }

    public MovieCreator withdirectorName(String directorName) {
        movie.setDirectorName(directorName);
        return this;
    }

    public MovieCreator withyearOfProduce(String yearOfProduce) {
        movie.setYearOfProduce(yearOfProduce);
        return this;
    }

    public MovieCreator withtypeOfMovie(String typeOfMovie) {
        movie.setTypeOfMovie(typeOfMovie);
        return this;
    }

    public MovieCreator withcountryOfProduce(String countryOfProduce) {
        movie.setCountryOfProduce(countryOfProduce);
        return this;
    }


    public Movie build() {
        return movie;
    }
}
