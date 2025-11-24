import java.util.ArrayList;
import java.util.List;

public class EnemyData {
    public List<Enemy> enemies = new ArrayList<>();

    public EnemyData() {
        Enemy Napoleon = new Enemy("Napoleon", Character.SocialStatus.CORRUPT_LEADER, 0, 10);
        enemies.add(Napoleon);
    }
}