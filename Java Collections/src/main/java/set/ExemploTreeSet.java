package set;

import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> capitais = new TreeSet<>();

        capitais.add("Porto Alegre");
        capitais.add("Florianópolis");
        capitais.add("Curitiba");
        capitais.add("São Paulo");
        capitais.add("Rio de Janeiro");
        capitais.add("Belo Horizonte");

        System.out.println(capitais);

        // Retorna o topo/primeiro elemento
        System.out.println(capitais.first());
        // Retorna a raiz/ultimo elemento
        System.out.println(capitais.last());
        // Retorna o elemento abaixo do elemento passado
        System.out.println(capitais.lower("Florianópolis"));
        // Retorna o elemento acima do elemento passado
        System.out.println(capitais.higher("Florianópolis"));
        // Retorna o primeiro elemento e o remove
        System.out.println(capitais.pollFirst());
        // Retorna o último elemento e o remove
        System.out.println(capitais.pollLast());

    }
}
