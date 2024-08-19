package class_basic.song;

public class SongTest {
    public static void main(String[] args) {
        Song song = new Song();

        String[] s = {"윤하", "윤하1", "윤하2"};
        song.initSong("오르트", "오트르구름", "1집", 2024, s);

        song.printSong();
    }
}
