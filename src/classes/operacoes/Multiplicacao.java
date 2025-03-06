package classes.operacoes;

public class Multiplicacao {
    private int x;
    private int y;
    
    public Multiplicacao(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int multiplicacao(){
        return x * y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
