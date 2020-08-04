package ua.khshanovskyi.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music classicalMusic = applicationContext.getBean("classicalMusic", ClassicalMusic.class);
//        Music rockMusic = applicationContext.getBean("rockMusic", RockMusic.class);
//        MusicPlayer player = new MusicPlayer(classicalMusic);
//        Music music = applicationContext.getBean("music", Music.class);
        MusicPlayer player = (MusicPlayer) applicationContext.getBean("musicPlayer",MusicPlayer.class);

        player.playMusic();

        applicationContext.close();
    }
}
