public abstract class Camisa implements CamisaEsportiva {
    private final String time;

    public Camisa(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }
}
