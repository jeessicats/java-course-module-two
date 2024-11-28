package enumeracoes.entities;

import enumeracoes.entities.enums.OrderStatus;

import java.util.Date;

public class Order {
    private int id;
    private Date data;
    private OrderStatus status;

    public Order(int id, Date data, OrderStatus status) {
        this.id = id;
        this.data = data;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", data=" + data +
                ", status=" + status +
                '}';
    }
}
