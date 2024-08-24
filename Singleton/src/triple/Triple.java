package triple;

public class Triple {
    private String name;

    private static Triple alpha = new Triple("ALPHA");
    private static Triple beta = new Triple("BETA");
    private static Triple gamma = new Triple("GAMMA");

    private Triple(String name) {
        this.name = name;
    }

    public static Triple getInstance(String name) {
        if (name.equals("ALPHA")) {
            return alpha;
        } else if (name.equals("BETA")) {
            return beta;
        } else if (name.equals("GAMMA")) {
            return gamma;
        } else {
            return null;
        }
    }

    public String getName() {
        return name;
    }
}
