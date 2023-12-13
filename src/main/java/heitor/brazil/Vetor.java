package heitor.brazil;

import java.util.Arrays;

public class Vetor {

    private Aluno[] alunos = new Aluno[100];
    private int totAlunos = 0;

    private void extendVetor() {
        if(totAlunos == alunos.length) {
            Aluno[] newArray = new Aluno[alunos.length*2];

            for (int i = 0; i < alunos.length; i++) {
                newArray[i] = alunos[i];
            }
            this.alunos = newArray;
        }
    }

    private boolean validPosition(int pos) {
        return pos >= 0 && pos <= totAlunos;
    }

    public void add(Aluno aluno) {
        extendVetor();

        alunos[totAlunos] = aluno;
        totAlunos++;
    }

    public void add(Aluno aluno, int pos) {
        extendVetor();

        if (!validPosition(pos)) {
            throw new IllegalArgumentException("Posição Inválida");
        }

        for (int i = totAlunos - 1; i >= pos; i--) {
            alunos[i+1] = alunos[i];
        }

        alunos[pos] = aluno;
        totAlunos++;
    }

    private boolean isOccupied(int pos) {
        return pos >= 0 && pos < qtdAlunos();
    }

    public Aluno get(int pos) {
        if(!isOccupied(pos)) {
            throw new IllegalArgumentException("Posição Inválida");
        }

        return alunos[pos];
    }

    public boolean contains(Aluno aluno) {
        for (int i = 0; i < qtdAlunos(); i++) {
            if (aluno.equals(alunos[i])) {
                return true;
            }

        }

        return false;
    }

    public void remove(int pos) {
        for (int i = pos; i < totAlunos-1; i++) {
            this.alunos[i] = this.alunos[i+1];
        }

        totAlunos--;
        this.alunos[totAlunos] = null;
    }

    public int qtdAlunos() {
        return totAlunos;
    }

    public int size() {
        return alunos.length;
    }
    public String toString() {
        return Arrays.toString(alunos);
    }
}
