package heitor.brazil.Filas;

public class TesteQueue {
    public static void main(String[] args) {
        Queue fila = new Queue();

        fila.add("Mauricio");
        fila.add("Guilherme");

        System.out.println(fila);

        String x1 = fila.remove();

        System.out.println(x1);

        System.out.println(fila);

        System.out.println(fila.isEmpty());

        System.out.println(fila.remove());

        System.out.println(fila);

        System.out.println(fila.isEmpty());
    }
}
