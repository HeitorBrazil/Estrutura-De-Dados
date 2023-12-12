package heitor.brazil;

public class VetorTeste {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Jose");
        Aluno a3 = new Aluno("Pedro");

        Vetor lista = new Vetor();

        System.out.println(lista.qtdAlunos());
        lista.add(a1);
        System.out.println(lista.qtdAlunos());
        lista.add(a2);
        System.out.println(lista.qtdAlunos());
        lista.add(a3, 0);
        System.out.println(lista.qtdAlunos());

        System.out.println(lista);

        lista.remove(0);

        System.out.println(lista);

        System.out.println(lista.contains(a3));

    }
}
