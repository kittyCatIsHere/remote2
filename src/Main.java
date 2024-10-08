// TODO: we need to add the missing classes!

// OK, I will add 'Adder' ans s30496 will add 'Substractor'

public class Main {
    public static void main
            (String[] args) {

        Adder adder = new Adder();
        System.out.println(adder.add(1, 2));
        Subtractor subtractor = new Subtractor();
        System.out.println(subtractor.subtract(6, 3));
    }
}
