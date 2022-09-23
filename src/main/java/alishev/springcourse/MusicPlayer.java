package alishev.springcourse;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;


public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    private final List<Music> musicList;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Value("${musicPlayer.volume}")
    int volume;

    public MusicPlayer(@Qualifier("musicList") List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        Random random = new Random();
        int randomGenre = random.nextInt(musicList.size());
        int randomMusicFromGenre = random.nextInt(musicList.get(randomGenre).getSong().size());
        return getName() + " Playing: " + musicList.get(randomGenre).getSong().get(randomMusicFromGenre) + "; Current volume: " + getVolume();
    }

}
