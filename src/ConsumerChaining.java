import java.util.function.Consumer;

class Movie{
    String name;


    public Movie(String name) {
        this.name=name;
    }
}
public class ConsumerChaining {
    public static void main(String[] args) {
        Consumer<Movie> consumer1=movie-> System.out.println("Movie name: "+movie.name +" is yet to be released.");
        Consumer<Movie> consumer2=movie -> System.out.println("Movie name: "+movie.name+" is a superhit movie");
        Consumer<Movie> consumer3=movie -> System.out.println("Movie name: "+movie.name+" is a flop movie");
        //chaining of consumer
        Consumer<Movie> chainingConsumer=consumer1.andThen(consumer2).andThen(consumer3);
        Movie movie=new Movie("Salar");
        chainingConsumer.accept(movie);
    }
}
