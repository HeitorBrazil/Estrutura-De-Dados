package heitor.brazil.ListaLigada;

public class Celula {
    private Object elem;
    private Celula next;

    public Celula(Object elem, Celula next) {
        this.elem = elem;
        this.next = next;
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
