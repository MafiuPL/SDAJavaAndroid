package MovieBuilder;

/**
 * Created by RENT on 2017-02-25.
 */
public class Movie {

    private String directorName;
    private String yearOfProduce;
    private String typeOfMovie;
    private String countryOfProduce;

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getYearOfProduce() {
        return yearOfProduce;
    }

    public void setYearOfProduce(String yearOfProduce) {
        this.yearOfProduce = yearOfProduce;
    }

    public String getTypeOfMovie() {
        return typeOfMovie;
    }

    public void setTypeOfMovie(String typeOfMovie) {
        this.typeOfMovie = typeOfMovie;
    }

    public String getCountryOfProduce() {
        return countryOfProduce;
    }

    public void setCountryOfProduce(String countryOfProduce) {
        this.countryOfProduce = countryOfProduce;
    }

    @Override
    public String toString() {
        return "Person{" +
                "directorName='" + directorName + '\'' +
                ", yearOfProduce='" + yearOfProduce + '\'' +
                ", typeOfMovie=" + typeOfMovie +
                ", countryOfProduce='" + countryOfProduce + '\'' +
                '}';
    }
}
