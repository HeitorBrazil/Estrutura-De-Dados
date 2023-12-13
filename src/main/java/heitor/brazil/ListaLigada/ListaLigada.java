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

    public void add(Object elem, int pos) {

    }

    public Object get(int pos) {
        return null;
    }

    public void remove(int pos) {

    }

    public int qtdElem() {
        return 0;
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
