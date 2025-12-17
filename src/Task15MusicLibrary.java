// 15. Write a Java program to create a class called "MusicLibrary"
// with a collection of songs and methods to add and remove songs,
// and to play a random song.

public class Task15MusicLibrary {

    // Static inner class Song
    static class Song {
        String title;

        // Constructor to set song title
        Song(String title) {
            this.title = title;
        }
    }

    // Static inner class MusicLibrary
    static class MusicLibrary {

        Song[] songs = new Song[10]; // Store songs
        int songCount = 0;           // Track number of songs

        // Method to add a song
        void addSong(Song song) {
            songs[songCount] = song;
            songCount++;
            System.out.println("Song added: " + song.title);
        }

        // Method to remove a song by title
        void removeSong(String title) {
            for (int i = 0; i < songCount; i++) {
                if (songs[i].title.equalsIgnoreCase(title)) {
                    songs[i] = songs[songCount - 1];
                    songs[songCount - 1] = null;
                    songCount--;
                    System.out.println("Song removed: " + title);
                    break;
                }
            }
        }

        // Method to play a random song
        void playRandomSong() {
            if (songCount == 0) {
                System.out.println("No songs to play.");
                return;
            }

            int randomIndex = (int) (Math.random() * songCount);
            System.out.println("Now playing: " + songs[randomIndex].title);
        }
    }

}
