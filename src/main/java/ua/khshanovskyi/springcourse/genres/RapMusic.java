package ua.khshanovskyi.springcourse.genres;

import lombok.Data;
import ua.khshanovskyi.springcourse.Music;

import java.util.ArrayList;
import java.util.List;

@Data
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Город под подошвой";
    }

    @Override
    public List<String> getMusicSongs() {
        List<String> songs = new ArrayList<>();
        songs.add("Eminem - Lose Yourself");
        songs.add("Rapper's Delight - The Sugarhill Gang");
        songs.add("The Message - Grandmaster Flash & The Furious 5");
        songs.add("Dear Mama - 2Pac");
        songs.add("Top Billin - Audio Two");
        return songs;
    }
}
