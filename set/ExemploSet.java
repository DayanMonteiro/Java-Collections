package br.com.dio.collection.set;


import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      Set notas = new HashSet(); //antes do java 5
//      HashSet<Double> notas = new HashSet<>();
//      Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
/*      Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
*/


        System.out.println("Crie um conjunto e adicione as notas: ");
        // Um HashSet é uma coleção de itens em que cada item é único
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());
        // Crie um conjunto e adicione as notas:
        //[0.0, 8.5, 3.6, 5.0, 9.3, 7.0] - como cada elemento é unico ele n repetiu o 7d e passou os numeros de forma aleatória

        /*
        System.out.println("Exiba a posição da nota 5.0: ");
        o metodo Set não permite realizar buscas percorrendo o array, sendo assim não realizável
        */

        /*
       System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
       não é possivel trabalhar com posições dentro de um Set
       */

        /*
       System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
       por não se tratar de uma List não é possivel a realização
       */


        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));
        // Confira se a nota 5.0 está no conjunto: true

          /*
//        System.out.println("Exiba a terceira nota adicionada: ");
           não se aplica pois o metodo get() não é aplicável em Set
        */

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        // Exiba a menor nota: 0.0


        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        // Exiba a maior nota: 9.3


        // exibir  a soma dos valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        // Exiba a soma dos valores: 33.400000000000006
        // - obs lembrando que o Set não soma os valores que são repetidos


        System.out.println("Exiba a média das notas: " + (soma/ notas.size()));
        // Exiba a média das notas: 5.566666666666667



        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);
        // Remova a nota 0:
        //[8.5, 3.6, 5.0, 9.3, 7.0]

          /*
//        System.out.println("Remova a nota da posição 0");
            não é posivel identificar posições usando SET, já que o mesmo não trabalha com indices
            */

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);
        // Remova as notas menores que 7 e exiba a lista:
        //[8.5, 9.3, 7.0]

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);
        // Exiba todas as notas na ordem em que foram informados:
        //[7.0, 8.5, 9.3, 5.0, 0.0, 3.6]
        // - obs exibiu na ordem que foram passados, porém sem exibir valores repetidos como ja é o padrão do Set


        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
        // Exiba todas as notas na ordem crescente:
        //[0.0, 3.6, 5.0, 7.0, 8.5, 9.3]


        System.out.println("Apague todo o conjunto");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        // Confira se o conjunto está vazio: true
        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        // Confira se o conjunto 2 está vazio: false
        System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());
        // Confira se o conjunto 3 está vazio: false
    }
}
