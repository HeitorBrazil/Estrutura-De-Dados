package heitor.brazil.ArmazenamentoSequencial;

public class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Aluno aluno = (Aluno) obj;

        return getNome() != null ? getNome().equals(aluno.getNome()) : aluno.getNome() == null;
    }

    @Override
    public String toString() {
        return getNome();
    }
}
