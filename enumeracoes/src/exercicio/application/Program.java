package exercicio.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio.entities.Order;
import exercicio.entities.OrderItem;
import exercicio.entities.Client;
import exercicio.entities.enums.OrderStatus;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Entrada dos dados do cliente
        System.out.println("Enter client data:");
        System.out.println("Name: ");
        String clientName = sc.nextLine();
        System.out.println("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date clientBirthDate = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());

        Client client = new Client(clientName, clientEmail, clientBirthDate);

        // Entrada dos dados do pedido
        System.out.println("Enter order data #");
        System.out.println("Order status: ");
        String status = sc.nextLine();
        OrderStatus orderStatus = OrderStatus.valueOf(status.toUpperCase());

        Date moment = new Date(); // Instante atual do pedido
        Order order = new Order(moment, orderStatus, client);

        // Entrada dos itens do pedido
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine(); // Consumir quebra de linha

        for (int i = 1; i <= n; i++) {
            System.out.printf("Enter #%d item data:%n", i);
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();
            sc.nextLine(); // Consumir quebra de linha

            OrderItem item = new OrderItem(productName, productPrice, productQuantity);
            order.addItem(item);
        }

        // Exibição do sumário do pedido
        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        System.out.println(order);

        sc.close();
    }
}
