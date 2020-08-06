package ua.khshanovskyi.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer player = (MusicPlayer) applicationContext.getBean("musicPlayer");
//        Music classicalMusic = applicationContext.getBean("classicalMusic", ClassicalMusic.class);
//        Music rockMusic = applicationContext.getBean("rockMusic", RockMusic.class);
//        MusicPlayer player = new MusicPlayer(classicalMusic);
//        Music music = applicationContext.getBean("music", Music.class);

//        List<Music> musicList = (ArrayList<Music>) applicationContext.getBean("musicList");

//        System.out.println("Player name: " + player.getName());
//        System.out.println("Player volume before: " + player.getVolume());
//        player.setVolume(30);
//        System.out.println("Player volume after: " + player.getVolume());
//        player.playMusic(musicList);

        ClassicalMusic classicalMusic = (ClassicalMusic) applicationContext.getBean("classicalMusic");
        RockMusic rockMusic = (RockMusic) applicationContext.getBean("rockMusic");
        player.playMusic(Genre.CLASSICAL);
        player.playMusic(Genre.ROCK);


//        player.playMusic();

        applicationContext.close();
    }
}
