package br.com.dio.collection.list;


import java.util.*;
import java.util.List;

class ExemploList {
    public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      List notas = new ArrayList(); //antes do java 5
//      ArrayList<Double> notas = new ArrayList<>();
//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);*/
        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas.toString());
        // [7.0, 8.5, 9.3, 5.0, 7.0, 0.0, 3.6]

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));
        // Exiba a posição da nota 5.0: 3

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
// também poderia ser ---- notas.add(i:4, e:8d);

        System.out.println(notas);
        //[7.0, 8.5, 9.3, 5.0, 8.0, 7.0, 0.0, 3.6]

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);
        // [7.0, 8.5, 9.3, 6.0, 8.0, 7.0, 0.0, 3.6]

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
        // Confira se a nota 5.0 está na lista: false


        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);
        /*
        7.0
        8.5
        9.3
        6.0
        8.0
        7.0
        0.0
        3.6
         */


        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        // Exiba a terceira nota adicionada: 9.3
        System.out.println(notas.toString());
        // [7.0, 8.5, 9.3, 6.0, 8.0, 7.0, 0.0, 3.6]

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        // Exiba a menor nota: 0.0

        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        // Exiba a maior nota: 9.3

        // Exiba a soma dos valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
                soma += next;
        }

        System.out.println("Exiba a soma dos valores: " + soma);
        // Exiba a soma dos valores: 49.4

        // size = O método size() retorna o tamanho de uma lista.
        // Se estivéssemos trabalho com vetores unidimensionais seria, mais ou menos, o equivalente a length
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));
        // Exiba a média das notas: 6.175

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);
        // Remova a nota 0:
        //[7.0, 8.5, 9.3, 6.0, 8.0, 7.0, 3.6]

        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);
        // Remova a nota da posição 0
        // [8.5, 9.3, 6.0, 8.0, 7.0, 3.6]

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);
        // Remova as notas menores que 7 e exiba a lista:
        //[8.5, 9.3, 8.0, 7.0]

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);
        // Apague toda a lista
        //[]

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
        //  Confira se a lista está vazia: true  - o isEmpty é um método boolean




                System.out.println("Crie uma lista chamada notas2 ");

                LinkedList<Double> notas2 = new LinkedList<>();
                notas2.add(9.5);
                notas2.add(8.0);
                notas2.add(7.5);
                notas2.add(9.3);
                notas2.add(5.0);
                notas2.add(4.0);
                notas2.add(0.0);

                System.out.println(notas2);
                // Crie uma lista chamada notas2
                //[9.5, 8.0, 7.5, 9.3, 5.0, 4.0, 0.0]


                System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.get(0));
               // Mostre a primeira nota da nova lista sem removê-lo: 9.5

                System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
                notas2.remove(0);
                System.out.println(notas2);
                // [8.0, 7.5, 9.3, 5.0, 4.0, 0.0]
    }

}
