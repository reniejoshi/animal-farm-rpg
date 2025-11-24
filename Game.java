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
        System.out.println("Select character: ");
        characterData.characters.forEach(characterDataCharacter -> System.out.println(characterDataCharacter.getName()));

        String name = scanner.nextLine();
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