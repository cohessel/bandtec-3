public class TestePilha {

    public static boolean ehPalindromo(int[] v) {

        Pilha p = new Pilha(v.length);

        //Empilha
        for (int i = 0; i < v.length; i++) {
            p.push(v[i]);
        }

        for (int i = 0; i < v.length; i++){
            if (v[i] != p.pop()) {
                return false;
            }
        }


            return true;
    }

}
