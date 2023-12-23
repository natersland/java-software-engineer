
public class Character {
    private String name;
    protected int level;
    private int hp;
    private int mp;
    protected int exp;

    public Character(String name, int level, int hp, int mp, int exp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.mp = mp;
        this.exp = exp;
    }

    public String toString() {
        return String.format("Name: %s, Level: %d, HP: %d, MP: %d, EXP: %d", name, level, hp, mp, exp);
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHP() {
        return hp;
    }

    public int getMP() {
        return mp;
    }

    public int getEXP() {
        return exp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
}
