package heitor.brazil.Conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {

    private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();

    public Conjunto() {
        for (int i = 0; i < 26; i++) {
            tabela.add(new LinkedList<String>());
        }
    }

    public void add(String palavra) {
        if(!contains(palavra)) {
            int index = calcIndex(palavra);
            List<String> lista = tabela.get(index);
            lista.add(palavra);
        }
    }

    public void remove(String palavra) {
        if(contains(palavra)) {
            int index = calcIndex(palavra);
            List<String> lista = tabela.get(index);
            lista.remove(palavra);
        }
    }

    private boolean contains(String palavra) {
        int index = calcIndex(palavra);
        return tabela.get(index).contains(palavra);

    }

    private int calcIndex(String palavra) {
        return palavra.toLowerCase().charAt(0) % 26;

    }

    @Override
    public String toString() {
        return tabela.toString();
    }
}
