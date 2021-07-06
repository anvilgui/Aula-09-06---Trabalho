import java.util.Stack;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.print("2)");

        Queue<Cliente> filaPrioridade = new PriorityQueue<Cliente>(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente p1, Cliente p2) {
                return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
            }

        });

        filaPrioridade.offer(new Cliente("Quantidade máxima de 15 itens", 3));
        filaPrioridade.offer(new Cliente("Gestante 2", 2));
        filaPrioridade.offer(new Cliente("Demais clientes", 4));
        filaPrioridade.offer(new Cliente("Idoso 1", 1));
        filaPrioridade.offer(new Cliente("Quantidade máxima de 15 itens", 3));
        filaPrioridade.offer(new Cliente("Idoso 2", 1));
        filaPrioridade.offer(new Cliente("Gestante 1", 2));

        while (!filaPrioridade.isEmpty()) {
            System.out.println(filaPrioridade.poll());
        }

        System.out.print("\n3) ");

        System.out.println("Pré ordem: 8, 4, 2, 1, 3, 6, 5, 12, 10, 11, 14, 13, 15");
        System.out.println("Em ordem: 1, 2, 3, 4, 5, 6, 8, 10, 11, 12, 13, 14, 15");
        System.out.println("Pós ordem: 1, 3, 2, 5, 6, 4, 11, 10, 13, 15, 14, 12, 8");

    }

}