
public class Main2 {

    public static void main(String[] args) {
        Character johnGame = new Character("John", 1, 100, 50, 0);
        System.out.println(johnGame);

        System.out.println("---------------------------------");

        Character somSriGame = new Character("SomSri", 99, 5341, 22, 4235);
        somSriGame.setName("LeenaJung");
        System.out.println(somSriGame);

        Game bobGame = new Game("Bob", 1, 100, 50, 0);
        bobGame.attack();
        System.out.println(bobGame);

        // JavaScript Object
        /*
         * const game = {
         * name: "John",
         * level: 1,
         * hp: 100,
         * mp: 50,
         * exp: 0
         * }
         */

        // Go struct
        /*
         * type Game struct {
         * name string
         * level int
         * hp int
         * mp int
         * exp int
         * }
         */

    }

}
