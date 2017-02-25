package MovieBuilder;

/**
 * Created by RENT on 2017-02-25.
 */
public class MovieMain {
    public static void main(String[] args) {


        MovieCreator movieCreator = new MovieCreator();


        Movie movie = movieCreator.withdirectorName("Janek")
                .withyearOfProduce("2000")
                .withtypeOfMovie("dramat")
                .withcountryOfProduce("Polska")
                .build();
        System.out.println(movie);
    }

}
