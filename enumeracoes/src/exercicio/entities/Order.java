package exercicio.entities;

import exercicio.entities.enums.OrderStatus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.getTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        sb.append("Order moment: ").append(sdf.format(moment)).append("\n");
        sb.append("Order status: ").append(status).append("\n");
        sb.append("Client: ").append(client.getNome())
                .append(" (").append(new SimpleDateFormat("dd/MM/yyyy").format(client.getDataNascimento()))
                .append(") - ").append(client.getEmail()).append("\n");
        sb.append("Order items:\n");

        for (OrderItem item : items) {
            sb.append(item.getProductName()).append(", $")
                    .append(String.format("%.2f", item.getPrice())).append(", Quantity: ")
                    .append(item.getQuantity()).append(", Subtotal: $")
                    .append(String.format("%.2f", item.getTotal())).append("\n");
        }

        sb.append("Total price: $").append(String.format("%.2f", total()));
        return sb.toString();
    }
}