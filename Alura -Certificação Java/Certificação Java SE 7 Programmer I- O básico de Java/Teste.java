public class Teste {
    public void m2(String nome) {
        System.out.println(nome);
    }

    public void m1() {
        int x = 10;

        if(x >= 10) {
            int y = 50;
            System.out.println(y);
        }

        System.out.println(x);

        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        for(int i = 0, j = 0; i <= 10; i++) {
            j++;
            System.out.println(i);
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        Teste t = new Teste();
        
        t.m1();
        t.m2("Juliano Soares");
    }
}