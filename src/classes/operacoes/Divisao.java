package classes.operacoes;

public class Divisao {
    private double x;
    private double y;

    public Divisao(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double divisao() {
        if (y == 0) {
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN;
        } else {
            return x / y;
        }
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
