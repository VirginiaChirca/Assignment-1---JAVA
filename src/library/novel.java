package library;
public class novel extends book implements common_action{
    private String type;
    public novel(String type, String name, int nr_pages) {
        super(name, nr_pages);
        this.type = type;
    }
    @Override
    public void afisare() {
        super.afisare();
        System.out.println("Tipul cartii: " + type);
    }
}
