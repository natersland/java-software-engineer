
public class Game extends Character {

    public Game(String name, int level, int hp, int mp, int exp) {
        super(name, level, hp, mp, exp);
    }

    public void levelUp() {
        level++;
        System.out.println("Level up!");
        System.out.println("Level: " + level);
    }

    public void attack() {
        System.out.println("Attack!");
        exp += 10;
        System.out.println("EXP: " + exp);
    }

}
