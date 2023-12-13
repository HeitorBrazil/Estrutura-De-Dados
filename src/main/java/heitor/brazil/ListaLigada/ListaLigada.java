package heitor.brazil.ListaLigada;

public class ListaLigada {
    private Celula first = null;
    private Celula last = null;
    private int totElem = 0;

    public void addBeginning(Object elem) {
        Celula newCelula = new Celula(elem, first);
        this.first = newCelula;

        if(this.totElem == 0)
            this.last = newCelula;

        this.totElem++;
    }

    public void add(Object elem) {
        Celula newCelula = new Celula(elem, null);

        if(this.totElem == 0)
            addBeginning(elem);
        else {
            this.last.setNext(newCelula);
            this.last = newCelula;
            this.totElem++;
        }
    }

    private boolean validPosition(int pos) {
        return pos >= 0 && pos < this.totElem;
    }

    private Celula getCelula(int pos) {
        if(validPosition(pos)) {

            Celula current = first;

            for (int i = 0; i < pos; i++) {
                current = current.getNext();
            }

            return current;
        }

        throw new IllegalArgumentException("Posição Inválida");
    }

    public void add(Object elem, int pos) {
        if (pos == 0) {
            addBeginning(elem);
        } else if (pos == this.totElem) {
            add(elem);
        } else {
            Celula prev = this.getCelula(pos - 1);
            Celula newCelula = new Celula(elem, prev.getNext());
            prev.setNext(newCelula);
            this.totElem++;
        }

    }

    public Object get(int pos) {
        return this.getCelula(pos).getElem();
    }

    public void removeBeginning() {
        if(this.totElem == 0)
            throw new IllegalArgumentException("Lista vazia");

        this.first = this.first.getNext();
        this.totElem--;

        if(this.totElem == 0)
            this.last = null;
    }

    public void remove(int pos) {

    }

    public int qtdElem() {
        return this.totElem;
    }

    public boolean contains() {
        return false;
    }

    @Override
    public String toString() {
        if(this.totElem == 0)
            return "[]";

        Celula current = first;

        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < totElem; i++) {
            builder.append(current.getElem());
            builder.append(" | ");

            current = current.getNext();
        }

        builder.append("]");

        return builder.toString();
    }
}
