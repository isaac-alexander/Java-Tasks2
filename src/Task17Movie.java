// 17. Write a Java program to create a class called "Movie"
// with attributes for title, director, actors, and reviews,
// and methods for adding and retrieving reviews.

public class Task17Movie {

    // Static inner class Movie
    static class Movie {

        String title;
        String director;
        String[] actors = new String[5];   // Stores actor names
        String[] reviews = new String[10]; // Stores movie reviews

        int actorCount = 0;
        int reviewCount = 0;

        // Constructor to set movie title and director
        Movie(String title, String director) {
            this.title = title;
            this.director = director;
        }

        // Method to add an actor
        void addActor(String actorName) {
            actors[actorCount] = actorName;
            actorCount++;
        }

        // Method to add a review
        void addReview(String review) {
            reviews[reviewCount] = review;
            reviewCount++;
        }

        // Method to display all reviews
        void showReviews() {
            System.out.println("Reviews for " + title + ":");
            for (int i = 0; i < reviewCount; i++) {
                System.out.println("- " + reviews[i]);
            }
        }

        // Method to display movie details
        void showMovieDetails() {
            System.out.println("Title: " + title);
            System.out.println("Director: " + director);
            System.out.print("Actors: ");
            for (int i = 0; i < actorCount; i++) {
                System.out.print(actors[i] + " ");
            }
            System.out.println();
        }
    }

}
