package heitor.brazil.ListaLigada;

public class TestaListaLigada {
    public static void main(String[] args) {
        //Criando lista
        ListaLigada lista = new ListaLigada();

        //Adicionando os primeiros elementos
        System.out.println(lista);
        lista.add("Mauricio");
        System.out.println(lista);
        lista.addBeginning("Paulo");
        System.out.println(lista);
        lista.add("Guilherme");
        System.out.println(lista);
        lista.addBeginning("Marcelo");
        System.out.println(lista);

        //Adicionando no meio da lista
        lista.add("Gabriel", 2);
        System.out.println(lista);

        //Pegando objeto do meio da lista
        Object x = lista.get(2);
        System.out.println(x);

        //Pegando a quantidade de elementos na lista
        System.out.println(lista.qtdElem());

        //Removendo o primeiro da lista
        lista.removeBeginning();
        System.out.println(lista);
        System.out.println(lista.qtdElem());
    }
}
