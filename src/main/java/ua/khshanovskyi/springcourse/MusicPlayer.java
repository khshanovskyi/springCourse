package ua.khshanovskyi.springcourse;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

//IoC by setter, important to have NoArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class MusicPlayer {

    @Value("iPod")
    private String name;

    @Value("70")
    private int volume;

    private Music classicalMusic;
    private Music rockMusic;

    List<Music> musicList;


    //    IoC by constructor
    public MusicPlayer(Music classicalMusic, Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public MusicPlayer(List<ua.khshanovskyi.springcourse.Music> musicList) {
        this.musicList = musicList;
    }

//    public void playMusic() {
//        System.out.println("Playing: " + music.getSong());
//    }

    public void playMusic(List<Music> musicList) {
        musicList.forEach(music -> System.out.println(music.getSong()));
    }

    public void playMusic(Genre genre) {
        Random random = new Random();
        int ran = random.nextInt(4 - 1) + 1;
        if (genre == Genre.CLASSICAL) {
            List<String> classicalSongs = classicalMusic.getMusicSongs();
            if (!classicalSongs.isEmpty()) {
                System.out.println(classicalSongs.get(ran));
            } else {
                System.out.println("Empty classical music list");
            }
        } else if (genre == Genre.ROCK) {
            List<String> rockSongs = rockMusic.getMusicSongs();
            if (!rockSongs.isEmpty()) {
                System.out.println(rockSongs.get(ran));
            } else {
                System.out.println("Empty rock list");
            }
        }
    }

    public void playMusic() {
        Random random = new Random();
        for (Music music : musicList
        ) {
            System.out.println(music.getMusicSongs().get(random.nextInt(music.getMusicSongs().size())));
        }
    }
}
