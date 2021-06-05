package br.com.dio.collection.map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */

//        Map carrosPopulares2020 = new HashMap(); //antes do java 5
//        Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//        HashMap<String, Double> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        /*
        o HashMap trabalha com o conceito de key-value pairs, ou seja, cada elemento de sua lista possui
        uma chave e valor associado, assim podemos realizar uma busca rápida pela chave que desejamos,
        sem precisar percorrer toda lista ou saber o index/posição que desejamos consultar.
         */
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            // no Map não usamos o add() no Map é usado o put()
            // no Map as chaves são de valores únicos
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());
        // Crie um dicionário que relacione os modelos e seus respectivos consumos:
        //{gol=14.4, kwid=15.6, uno=15.6, hb20=14.5, mobi=16.1}



        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        // "gol" é uma chave e 15.2 um valor de substituição, a chave não foi alterada,
        // porém é possivel substituir o valor
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);
        // Substitua o consumo do gol por 15,2 km/l:
        //{gol=15.2, kwid=15.6, uno=15.6, hb20=14.5, mobi=16.1}



        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));
        // Confira se o modelo tucson está no dicionário: false
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));
        // Exiba o consumo do uno: 15.6

//      //  System.out.println("Exiba o terceiro modelo adicionado: ");
        // não aplicável ao método Map

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        // Exiba os modelos:
        //[gol, kwid, uno, hb20, mobi]


        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);
        // Exiba os consumos dos carros:
        //[15.2, 15.6, 15.6, 14.5, 16.1]


        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        /*
        entrySet () em Java é usado para criar um conjunto dos mesmos elementos contidos no mapa hash.
        Ele basicamente retorna uma visualização de conjunto do mapa hash ou podemos criar um novo conjunto
        e armazenar os elementos do mapa nele.
         */
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        //Exiba o modelo mais econômico e seu consumo:
        //Modelo mais eficiente: mobi - 16.1

        System.out.println("Exiba o modelo menos econômico e seu consumo: " );

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }
        // Exiba o modelo menos econômico e seu consumo:
        //Modelo menos eficiente: hb20 - 14.5


        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);
        // Exiba a soma dos consumos: 77.0



        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));
        // Exiba a média dos consumos deste dicionário de carros: 15.4


        System.out.println(carrosPopulares);
        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);
        // Remova os modelos com o consumo igual a 15,6 km/l:
        //{gol=15.2, hb20=14.5, mobi=16.1}



        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        /*
        O LinkedHashMap é como o HashMap com um recurso adicional de manter uma ordem dos elementos inseridos nele.
        O HashMap oferece a vantagem de inserção, pesquisa e exclusão rápidas, mas nunca mantém o controle
        e a ordem de inserção que o LinkedHashMap fornece, onde os elementos podem ser acessados em sua ordem de inserção.
        */
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());
        // Exiba todos os carros na ordem em que foram informados:
        //{gol=14.4, uno=15.6, mobi=16.1, hb20=14.5, kwid=15.6}



        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        /*
        TreeMap é uma implementação de mapa que mantém suas entradas classificadas de acordo com a ordem natural
        de suas chaves ou, melhor ainda, usando um comparador se fornecido pelo usuário no momento da construção.
         */
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());
        // Exiba o dicionário ordenado pelo modelo:
        //{gol=14.4, hb20=14.5, kwid=15.6, mobi=16.1, uno=15.6}


        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();
        // Apague o dicionario de carros:

        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());
        // Confira se o dicionário está vazio: true

    }
}
