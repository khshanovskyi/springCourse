package ua.khshanovskyi.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music classicalMusic = applicationContext.getBean("classicalMusic", ClassicalMusic.class);
//        Music rockMusic = applicationContext.getBean("rockMusic", RockMusic.class);
//        MusicPlayer player = new MusicPlayer(classicalMusic);
//        Music music = applicationContext.getBean("music", Music.class);
        MusicPlayer player = (MusicPlayer) applicationContext.getBean("musicPlayer");
        List<Music> musicList = (ArrayList<Music>) applicationContext.getBean("musicList");

        System.out.println("Player name: " + player.getName());
        System.out.println("Player volume before: " + player.getVolume());
        player.setVolume(30);
        System.out.println("Player volume after: " + player.getVolume());
        player.playMusic(musicList);

        applicationContext.close();
    }
}
