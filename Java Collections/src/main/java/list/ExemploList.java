package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Maria");
        nomes.add("Ana");
        nomes.add("João");
        nomes.add("Carlos");
        nomes.add("Juliano");
        nomes.add("Rafael");
        nomes.add("Antonio");
        System.out.println(nomes);

        // Ordenar em orden alfabetica
        Collections.sort(nomes);
        System.out.println(nomes);

        // Trocar valor com base em uma posição
        nomes.set(2, "Mario");
        System.out.println(nomes);

        // Remover um nome com base em um indice
        nomes.remove(1);
        System.out.println(nomes);

        nomes.remove("Mario");
        System.out.println(nomes);

        // Pega um elemento pelo indice
        String nome = nomes.get(1);
        System.out.println(nome);

        // Retorna o tamanho do array
        int tamanho = nomes.size();
        System.out.println(tamanho);

        // Verifica se contem o item
        boolean temCarlos = nomes.contains("Carlos");
        System.out.println(temCarlos);

        // Verifica se esta vazio
        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        // Retorna o indice do elemento
        int posicao = nomes.indexOf("Carlos");
        System.out.println(posicao);

        for (String nomeItem : nomes) {
            System.out.println(nomeItem);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Limpar array
        nomes.clear();
    }
}
