
public class Loop {
    public static void main(String[] args) {
        String[] cats = { "Tiger", "Lion", "Jaguar", "Leopard", "Cheetah" };

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
        }

        for (String cat : cats) {
            System.out.println(cat);
        }

    }

}
