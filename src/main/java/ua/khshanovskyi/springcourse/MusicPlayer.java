package ua.khshanovskyi.springcourse;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

//IoC by setter, important to have NoArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class MusicPlayer {

    private String name;

    private int volume;

//    private List<Music> musicList = new ArrayList<>();


//    IoC by constructor
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }


    public void playMusic(List<Music> musicList){
        musicList.forEach(music -> System.out.println(music.getSong()));
//        System.out.println("Playing: " + music.getSong());
    }
}
