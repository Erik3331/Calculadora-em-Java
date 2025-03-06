package classes.operacoes;

public class Porcentagem {
    private double x;
    private double y;
    
    public Porcentagem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double porcentagem(){
        return (x/100) * y;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
}
