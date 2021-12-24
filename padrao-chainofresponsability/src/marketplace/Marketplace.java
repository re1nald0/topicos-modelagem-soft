package marketplace;

public abstract class Marketplace {
    private Marketplace proximo;

    public abstract void tributar();
    
    public void checarProximo() {
        if(this.proximo != null) {
            this.proximo.tributar();
        }
    }

    public void setProximo(Marketplace proximo) {
        this.proximo = proximo;
    }
}
