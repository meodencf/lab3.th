/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final int orderID;
    private LocalDate orderDate;
    private  List<OrderDetail> lineItems;
    private  int count;
    
    

    public Order(int orderID, LocalDate orderDate, List<OrderDetail> lineItems, int count) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.lineItems = lineItems;
        this.count = 20;
    }


    public int getOrderID() {
        return orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<OrderDetail> getLineItems() {
        return lineItems;
    }

    public int getCount() {
        return count;
    }
    
    public void setOrderData(LocalDate orderDate){
        this.orderDate = orderDate;
    }
    public void addLineItem(Product product, int quantity){
        lineItems.add(new OrderDetail(product, quantity));
    }
     public double calcTotalCharge() {
        double totalCharge = 0;
        for (OrderDetail item : lineItems) {
            totalCharge += item.calcTotalPrice();
        }
        return totalCharge;
    }

    @Override
    public String toString() {
        return "Order{" + "orderID=" + orderID + ", orderDate=" + orderDate + ", lineItems=" + lineItems + ", count=" + count + '}';
    }
}
