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
