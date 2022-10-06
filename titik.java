package RelasiAntarKelas;

public class Titik {

  private double x;
  private double y;

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public Titik(double X, double Y) {
    x = X;
    y = Y;
  }

  public void tampil() {
    System.out.println("Point\t\t\t: [" + x + ", " + y + "]");
  }

  public double hitungJarak(Titik t2) {
    return Math.sqrt(Math.pow(t2.getX() - x, 2) + Math.pow(t2.getY() - y, 2));
  }

}