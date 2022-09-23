package alishev.springcourse;

import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music {
    private final List<String> rapMusicList = new ArrayList<>();

    {
        rapMusicList.add("L'One - Тигр");
        rapMusicList.add("Центр - Город дорог");
        rapMusicList.add("Баста - Сансара");
    }

    @Override
    public List<String> getSong() {
        return rapMusicList;
    }
}
