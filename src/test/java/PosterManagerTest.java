import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    MyPosters poster1 = new MyPosters("PosterLink1", "MovieName1", "Comedy", true);
    MyPosters poster2 = new MyPosters("PosterLink2", "MovieName2", "Tragedy", false);
    MyPosters poster3 = new MyPosters("PosterLink3", "MovieName3", "Action", true);
    MyPosters poster4 = new MyPosters("PosterLink4", "MovieName4", "Horror", false);
    MyPosters poster5 = new MyPosters("PosterLink5", "MovieName5", "Thriller", true);
    MyPosters poster6 = new MyPosters("PosterLink6", "MovieName6", "Adventure", false);

    @Test
    public void addPosterTest(){

        PostersManager myPoster = new PostersManager();
        myPoster.addMovie(poster1);
        myPoster.addMovie(poster3);
        myPoster.addMovie(poster5);
        MyPosters[] actual = myPoster.findAll();
        MyPosters[] expected = {poster1, poster3, poster5};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest(){

        PostersManager myPoster = new PostersManager(2);
        myPoster.addMovie(poster1);
        myPoster.addMovie(poster3);
        myPoster.addMovie(poster5);
        MyPosters[] actual = myPoster.findLast();
        MyPosters[] expected = {poster5, poster3};
        Assertions.assertArrayEquals(expected, actual);
    }

}
