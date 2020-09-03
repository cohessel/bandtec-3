public class ExemploRecursao {

    public static void contagemRegressiva(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        int[]vetor = {5,3, 10,45,2};

        contagemRegressiva(5);
        System.out.println();
        contagemRegressivaRecursiva(5);
        System.out.println();
        fatorialRecursivoComPrint(5);
        System.out.println();
        exibeVetor(vetor,5);


    }

    public static void contagemRegressivaRecursiva(int n) {
        if (n == 0) {
            System.out.println(n);
        } else {
            System.out.println(n);
            contagemRegressivaRecursiva(n - 1);
        }
    }

    public static int fatorialRecursivo(int n) {
        if (n == 0) {
            return 1;       //0!= 1
        } else {
            return fatorialRecursivo(n - 1);      //n! =n * (n-1)!
        }
    }

    public static int fatorialRecursivoComPrint(int n) {
        if ( n == 0){
            System.out.println("0! = 1");
            return 1;
        } else {
            int resultado;
            resultado = n * fatorialRecursivoComPrint(n-1);
            System.out.println(n+ "! = " + resultado);
            return resultado;
        }
    }

    public static void exibeVetor(int[] v, int n){
        if(n < v.length){
            System.out.println(v[n]);
            exibeVetor(v,n+1);
        }
    }



}
