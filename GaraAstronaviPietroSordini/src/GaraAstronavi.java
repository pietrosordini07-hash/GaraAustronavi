//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GaraAstronavi {
    public static void main(String[] args) {
        int distanzaGara = 100;
        Giudice g = new Giudice();

        Astronave a1 = new Astronave("a", distanzaGara, g);

        Astronave a2 = new Astronave("b", distanzaGara,g);
        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(a2);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    System.out.println("Il vincitore è" + g.getVincitore());


    }
}