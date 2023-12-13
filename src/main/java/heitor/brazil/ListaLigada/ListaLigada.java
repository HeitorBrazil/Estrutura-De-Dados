package heitor.brazil.ListaLigada;

public class ListaLigada {
    private Celula first = null;
    private Celula last = null;
    private int totElem = 0;

    public void addBeginning(Object elem) {
        Celula newCelula = new Celula(elem);

        if(this.totElem == 0) {
            this.first = newCelula;
            this.last = newCelula;
        } else {
            this.first.setPrev(newCelula);
            newCelula.setNext(this.first);
            this.first = newCelula;
        }

        this.totElem++;
    }

    public void add(Object elem) {
        if(this.totElem == 0)
            addBeginning(elem);
        else {
            Celula newCelula = new Celula(elem, null);
            this.last.setNext(newCelula);
            newCelula.setPrev(this.last);
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
            Celula next = prev.getNext();
            Celula newCelula = new Celula(elem, prev.getNext());
            newCelula.setPrev(prev);
            prev.setNext(newCelula);
            next.setPrev(newCelula);
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
    public void removeLast() {
        if(this.totElem == 1)
            this.removeBeginning();
        else {
            Celula pen = last.getPrev();
            pen.setNext(null);
            this.last = pen;
            this.totElem--;
        }
    }

    public void remove(int pos) {
        if(pos == 0)
            removeBeginning();
        else if (pos == totElem-1)
            removeLast();
        else {
            Celula prev = this.getCelula(pos-1);
            Celula current = prev.getNext();
            Celula next = current.getNext();

            prev.setNext(next);
            next.setPrev(prev);

            this.totElem--;
        }
    }


    public int qtdElem() {
        return this.totElem;
    }

    public boolean contains(Object elem) {
        Celula current = this.first;

        while(current != null) {
            if(current.getElem().equals(elem))
                return true;

            current = current.getNext();
        }

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
