package ua.khshanovskyi.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ua.khshanovskyi.springcourse.genres.ClassicalMusic;
import ua.khshanovskyi.springcourse.genres.RapMusic;
import ua.khshanovskyi.springcourse.genres.RockMusic;

import java.util.Arrays;
import java.util.List;

@Configuration
public class SpringConfiguration {

    @Bean
    public  ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic (){
        return new RapMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }

    @Bean
    public List<Music> musicList(){
        return  Arrays.asList(classicalMusic(),rockMusic(),rapMusic());
    }

}
