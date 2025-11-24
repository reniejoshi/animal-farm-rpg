import java.util.ArrayList;
import java.util.List;

public class CharacterData {
    public List<Character> characters = new ArrayList<>();

    public CharacterData() {
        Character Boxer = new Character("Boxer", Character.SocialStatus.WORKING_CLASS, 10, 0);
        characters.add(Boxer);
    }
}