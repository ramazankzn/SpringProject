package alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    private List<String> classicalMusicList = new ArrayList<>();

    {
        classicalMusicList.add("Бетховен - 5 симфония");
        classicalMusicList.add("Вивальди - Поры года");
        classicalMusicList.add("Чайковский - Щелкунчик");
    }

    public List<String> getSong() {
        return classicalMusicList;
    }

    public void doMyInit() {
        System.out.println("Doing Classical music initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing Classical music DESTRUCTION");
    }


}
