package bcit.computing.cst.comp2522.lab02;

public class Poodle extends Dog implements IncessantSpeakable {

    public Poodle() {
        setSpeak("Arf arf!");
    }

    public void speak() {
        System.out.println(getSpeak());
    }
    public void loudSpeak() {
        System.out.println(getSpeak().toUpperCase());
    }
}
