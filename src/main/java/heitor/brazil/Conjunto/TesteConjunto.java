package heitor.brazil.Conjunto;

public class TesteConjunto {
    public static void main(String[] args) {
        Conjunto conj = new Conjunto();
        conj.add("Mauricio");
        System.out.println(conj);

        conj.add("Mauricio");
        System.out.println(conj);

        conj.add("Marcelo");
        System.out.println(conj);

        conj.add("Guilherme");
        System.out.println(conj);

        conj.remove("Mauricio");
        System.out.println(conj);

    }
}
