import java.util.Scanner;

public class Game {
    private Character character;
    private CharacterData characterData = new CharacterData();

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Game game = new Game();
        game.playGame();
    }

    private void playGame() {
        selectCharacter();
    }

    private void selectCharacter() {
        characterData.characters.forEach(characterDataCharacter -> {
            System.out.println(characterDataCharacter.getName());
            System.out.println(" -Social status: " + characterDataCharacter.getSocialStatusString());
            System.out.println(" -Labor strength: " + characterDataCharacter.getLaborStrength() + " XP");
            System.out.println(" -Education level: " + characterDataCharacter.getEducationLevel() + " XP");
        });
        System.out.println();

        System.out.print("Select character: ");
        String name = scanner.next();
        switch(name) {
            case "Boxer" -> {
                character = characterData.characters.get(0);
            }
        }

        System.out.println("Welcome to Manor Farm, comrade " + character.getName() + "!");
    }

    private void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}