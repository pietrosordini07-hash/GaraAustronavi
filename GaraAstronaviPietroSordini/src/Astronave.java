public class Astronave implements Runnable {
    private String nome;
    int distanzaGara;
    int incremento;
    int distanzaPercorsa = 0;
    boolean vincitore = false;
    private Giudice g;

    public Astronave(String nome, int distanzaGara, int incremento) {
        this.nome = nome;
        this.distanzaGara = distanzaGara;
        this.incremento = incremento;
    }


    @Override
    public void run() {
        try {
            while (distanzaPercorsa < distanzaGara) {
                distanzaPercorsa += incremento;
                System.out.println(nome + "ha percorso" + distanzaPercorsa + "km");
                Thread.sleep(100);

            }
            System.out.println(nome + "ha finito la gara");
            g.registraArrivo(nome);


        } catch (InterruptedException e) {
            e.printStackTrace();

        }


    }
}

