package heitor.brazil.Stack;

public class TesteStack {
    public static void main(String[] args) {
        Stack pilha = new Stack();

        //Adicionando itens na pilha
        pilha.push("Mauricio");
        System.out.println(pilha);
        pilha.push("Guilherme");
        System.out.println(pilha);


        String r1 = pilha.pop();
        System.out.println(r1);
        String r2 = pilha.pop();
        System.out.println(r2);
        System.out.println(pilha);
        System.out.println(pilha.isEmpty());

        pilha.push("Marcelo");
        System.out.println(pilha);
        System.out.println(pilha.isEmpty());

    }
}
