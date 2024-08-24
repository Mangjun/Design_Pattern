package triple;

public class Main {
    public static void main(String[] args) {
        Triple alpha1 = Triple.getInstance("ALPHA");
        Triple alpha2 = Triple.getInstance("ALPHA");

        Triple beta1 = Triple.getInstance("BETA");
        Triple beta2 = Triple.getInstance("BETA");

        Triple gamma1 = Triple.getInstance("GAMMA");
        Triple gamma2 = Triple.getInstance("GAMMA");

        System.out.println(alpha1.getName());
        System.out.println(alpha2.getName());

        System.out.println(alpha1 == alpha2);

        System.out.println(beta1.getName());
        System.out.println(beta2.getName());

        System.out.println(beta1 == beta2);

        System.out.println(gamma1.getName());
        System.out.println(gamma2.getName());

        System.out.println(gamma1 == gamma2);

        System.out.println(alpha1 != beta1);
        System.out.println(alpha1 != gamma1);
    }
}
