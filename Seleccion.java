import java.util.Scanner;

public class Seleccion {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int op;

        // Arreglo de pasteles con sus precios
        Cake[] cakes = {
            new Cake("Pastel Tres Leches", 15),
            new Cake("Pastel de Chocolate", 8),
            new Cake("Pastel de Vainilla", 6),
            new Cake("Pastel de Fresa", 2)
        };

        System.out.print("\n\tPasteleria\n\nIngresa su opcion:\n\n1:Pastel mas barto\n2:Pastel mas caro\n\nOpcion: ");
        op = sc.nextInt();

        if (op == 1) {

            // Encontrar el pastel más barato
            Cake barato = cakes[0];

            //bucle for que recorre la matris cake desde indice 1 al final 
            for (int i = 1; i < cakes.length; i++) {

                // En cada iteración del bucle, se compara el precio del pastel actual
                if (cakes[i].getPrice() < barato.getPrice()) { 
                    barato = cakes[i];
                }
            }
            // Imprimir el resultado
            System.out.println("\nEl pastel mas barato es: " + barato.getName() +
                    " con un precio de " + barato.getPrice());
        } else if (op == 2) {
            // Encontrar el pastel más caro
            Cake caro = cakes[0];

            for (int i = 1; i < cakes.length; i++) {

                if (cakes[i].getPrice() > caro.getPrice()) { // 
                    caro = cakes[i];
                }
            }
            // Imprimir el resultado
            System.out.println("\nEl pastel mas caro es: " + caro.getName() +" con un precio de " + caro.getPrice());
        }
    }
}

class Cake {
    private String name;
    private int price;

    public Cake(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
