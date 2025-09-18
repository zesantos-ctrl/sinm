package Jose;

public class Names {
    private String name;

    public Names(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Jose.Names{" +
                "name='" + name + '\'' +
                '}';
    }
}
