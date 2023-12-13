package heitor.brazil.ListaLigada;

public class Celula {
    private Object elem;
    private Celula next;
    private Celula prev;

    public Celula(Object elem) {
        this(elem, null);
    }

    public Celula(Object elem, Celula next) {
        this.elem = elem;
        this.next = next;
    }
    public Celula getPrev() {
        return prev;
    }

    public void setPrev(Celula prev) {
        this.prev = prev;
    }

    public Object getElem() {
        return elem;
    }

    public Celula getNext() {
        return next;
    }

    public void setNext(Celula next) {
        this.next = next;
    }
}
