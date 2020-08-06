package ua.khshanovskyi.springcourse;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
@Data
public class ClassicalMusic implements Music {

    private List<String> songs;

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    @Override
    public List<String> getMusicSongs() {
        List<String> classicalSongs = new ArrayList<>();
        classicalSongs.add("Puccini – 'O mio babbino caro' from Gianni Schicchi");
        classicalSongs.add("Mozart – Eine kleine Nachtmusik");
        classicalSongs.add("Beethoven – Für Elise");
        classicalSongs.add("Beethoven – Elise");
        classicalSongs.add("Beethoven – O mio babbino caro");
        return classicalSongs;
    }
}
