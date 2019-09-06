
public class dupla {
    private int a,b;

    public dupla(){}


    public void Guarda(int a2,int b2) {
        a = a2;
        b = b2;
    }

    public void Lee(int[] a2, int[] b2){
        a2[0]= a;
        b2[0]= b;
    }

    public static void main(String[] args){
        dupla primerPar = new dupla();
        int[] x = new int[1];
        int[] y = new int[1];

        primerPar.Guarda(12,32);
        primerPar.Lee(x,y);

        System.out.println("Valor de primerPar.a: " + x[0]);
        System.out.println("Valor de primerPar.b: " + y[0]);

    }
}
