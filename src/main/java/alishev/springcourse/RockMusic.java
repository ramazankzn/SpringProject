package alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    private List<String> rockMusicList = new ArrayList<>();

    {
        rockMusicList.add("Nirvana - Smells like teen spirit");
        rockMusicList.add("Кино - Пачка сигарет");
        rockMusicList.add("Би-2 - Молитва");
    }

    @Override
    public List<String> getSong() {
        return rockMusicList;
    }
}
