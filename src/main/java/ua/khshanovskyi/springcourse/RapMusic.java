package ua.khshanovskyi.springcourse;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "Город под подошвой";
    }

    @Override
    public List<String> getMusicSongs() {
        return null;
    }
}
