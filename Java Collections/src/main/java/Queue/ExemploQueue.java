package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        // Pegar o primeiro da fila
        String primeiroCliente = filaBanco.poll();
        System.out.println("Cliente -> " + primeiroCliente);
        System.out.println("fila -> " + filaBanco);

        // Visualizar o primeiro da fila
        String quemPrimeiro = filaBanco.peek();
        System.out.println("Cliente -> " + quemPrimeiro);
        System.out.println("fila -> " + filaBanco);
    }
}
