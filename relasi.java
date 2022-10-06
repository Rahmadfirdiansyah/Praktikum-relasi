public class relasi{
        public static void main(String args[]) {
          Limas P = new Limas(1.0,2.0,5.0,2.0,2.0,3.0,2.0,7.0);
          P.rumus();
        }
    }
    
    class Limas{
        double Sx1; double Sy1; double Sx2; double Sy2; double Px1; double Py1; double Px2; double Py2;
        Limas(double Sx1,double Sy1, double Sx2, double Sy2, double Px1, double Py1, double Px2, double Py2){
            this.Sx1 = Sx1;
            this.Sy1 = Sy1;
            this.Sx2 = Sx2;
            this.Sy2 = Sy2;
            this.Px1 = Px1;
            this.Px2 = Px2;
            this.Py1 = Py1;
            this.Py2 = Py2;
        }
        void rumus(){
            double luas_Segitiga, luas_Persegi, luas_Limas;
            System.out.println("=== Data Segitiga ===");
            System.out.println("point\t: " + this.Sx1 + ", " + this.Sy1);
            System.out.println("Sisi Segitiga\t: " + (this.Sy1 + this.Sy2));
            luas_Segitiga = 0.5 * (this.Sy1 + this.Sy2) * Math.sqrt(3);
            System.out.println("Luas Segitiga\t: " + luas_Segitiga);
            
            
            System.out.println("\n=== Data Persegi ===");
            System.out.println("point\t: " + this.Px1 + ", " + this.Py1);
            System.out.println("Sisi Persegi\t: " + (this.Px1 + this.Px2));
            luas_Persegi = (this.Px1 + this.Px2) * (this.Px1 + this.Px2);
            System.out.println("Luas Persegi\t: " + luas_Persegi);
            
            luas_Limas = (4 * luas_Segitiga) + luas_Persegi;
            System.out.println("\n\nLuas Limas : " + luas_Limas);
            System.out.println("\ndevelop @mahendrarendi");
            
        }
    }