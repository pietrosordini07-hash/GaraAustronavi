public class Giudice {
    private String vincitore = "";
    private final Object lock = new Object();

    public void registraArrivo(String nomeAstronave) {
        synchronized (lock) {
            if (vincitore == "") {
                vincitore == nomeAstronave;
                System.out.println("il primo ad arrivare è:" + vincitore);
            }
        }
    }
    public String getVincitore(){
        return vincitore;
    }
}
