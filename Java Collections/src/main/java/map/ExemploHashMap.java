package map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeoes = new HashMap<>();

        campeoes.put("Brasil", 5);
        campeoes.put("Alemanha", 4);
        campeoes.put("Itália", 4);
        campeoes.put("Uruguai", 2);
        campeoes.put("Argentina", 2);
        campeoes.put("França", 2);
        campeoes.put("Inglaterra", 1);
        campeoes.put("Espanha", 1);

        System.out.println(campeoes);

        // Atualiza o valor para a chave Brasil
        campeoes.put("Brasil", 6);
        System.out.println(campeoes);

        // Retorna a Argentina
        System.out.println(campeoes.get("Argentina"));

        // Retorna se existe ou não a França
        System.out.println(campeoes.containsKey("França"));

        // Remove a França
        campeoes.remove("França");
        System.out.println(campeoes);

        // Retorna se existe ou não alguma seleção hexa campeã
        System.out.println(campeoes.containsValue(6));
    }
}
