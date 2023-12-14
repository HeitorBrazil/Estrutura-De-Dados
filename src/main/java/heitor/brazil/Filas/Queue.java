package heitor.brazil.Filas;

import java.util.LinkedList;
import java.util.List;

public class Queue {
    private List<String> alunos = new LinkedList<String>();

    public void add(String aluno) {
        alunos.add(aluno);

    }

    public String remove() {
        return alunos.remove(0);

    }

    public boolean isEmpty() {
        return alunos.isEmpty();
    }

    @Override
    public String toString() {
        return alunos.toString();
    }

}
