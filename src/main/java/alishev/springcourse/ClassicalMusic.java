package alishev.springcourse;

public class ClassicalMusic implements Music{
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic (){
        return new ClassicalMusic();
    }
    public void doMyInit(){
        System.out.println("Doing Classical music initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing Classical music DESTRUCTION");
    }
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
