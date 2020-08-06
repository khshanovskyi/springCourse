package ua.khshanovskyi.springcourse;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

//IoC by setter, important to have NoArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Component
public class MusicPlayer {

    @Value("iPod")
    private String name;

    @Value("70")
    private int volume;

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    //    IoC by constructor
    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") ClassicalMusic classicalMusic, @Qualifier("rockMusic") RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic() {
//        System.out.println("Playing: " + music.getSong());
    }

    public void playMusic(List<Music> musicList) {
        musicList.forEach(music -> System.out.println(music.getSong()));
    }

    public void playMusic(Genre genre) {
        Random random = new Random();
        int ran = random.nextInt(4-1) + 1;
        if (genre == Genre.CLASSICAL) {
            List<String> classicalSongs = classicalMusic.getMusicSongs();
            if (!classicalSongs.isEmpty()){
                System.out.println(classicalSongs.get(ran));
            }else {
                System.out.println("Empty classical music list");
            }
        } else if (genre == Genre.ROCK) {
            List<String> rockSongs = rockMusic.getMusicSongs();
            if (!rockSongs.isEmpty()){
                System.out.println(rockSongs.get(ran));
            }else{
                System.out.println("Empty rock list");
            }
        }
    }
}
