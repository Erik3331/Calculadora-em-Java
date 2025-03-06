package classes.operacoes;

public class Subtracao {
    private int x;
    private int y;
    
    public Subtracao(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int subtracao(){
        return x - y;
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
