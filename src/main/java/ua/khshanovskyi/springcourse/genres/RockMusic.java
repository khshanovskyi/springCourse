package ua.khshanovskyi.springcourse.genres;

import lombok.Data;
import ua.khshanovskyi.springcourse.Music;

import java.util.ArrayList;
import java.util.List;

@Data
public class RockMusic implements Music {

    List<String> songs;

    @Override
    public String getSong() {
        return "Wind cries Marry";
    }

    @Override
    public List<String> getMusicSongs() {
        List<String> rockSongs = new ArrayList<>();
        rockSongs.add("Kansas - Carry On Wayward Son");
        rockSongs.add("Scorpions - Rock You Like a Hurricane");
        rockSongs.add("Electric Light Orchestra - Don't Bring Me Down");
        rockSongs.add("Electric - Me Down");
        rockSongs.add("Light Orchestra - Don't Bring Me");
        return rockSongs;
    }
}
