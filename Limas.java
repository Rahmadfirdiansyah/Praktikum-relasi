//rahmad firdiansyah//023
package RelasiAntarKelas;

public class Limas {

  private SgtSamaSisi sgtSamaSisi;
  private Persegi persegi;

  public Limas(double Sx1, double Sy1, double Sx2, double Sy2, double Px1, double Py1, double Px2, double Py2) {

    sgtSamaSisi = new SgtSamaSisi(Sx1, Sy1, Sx2, Sy2);
    persegi = new Persegi(Px1, Py1, Px2, Py2);

  }

  public double hitungLuas() {
    return (4 * sgtSamaSisi.hitungLuas()) + persegi.hitungLuas();
  }

  public void tampil() {
    sgtSamaSisi.tampil();
    System.out.println();

    persegi.tampil();
    System.out.println();

    System.out.println("Luas Limas\t\t: " + hitungLuas());
  }

}