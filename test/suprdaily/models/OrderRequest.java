package test.suprdaily.models;


import java.util.List;

public class OrderRequest {
    String customerId; // Customer ID
    String warehouseId; // ID of Warehouse which serves the Customer
    String deliveryDate; // Delivery Date
    List<ItemRequest> items; // Items that Customer is trying to Order

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public List<ItemRequest> getItems() {
        return items;
    }

    public void setItems(List<ItemRequest> items) {
        this.items = items;
    }


    @Override
    public String toString() {
        return "OrderRequest{" +
                "customerId='" + customerId + '\'' +
                ", warehouseId='" + warehouseId + '\'' +
                ", deliveryDate=" + deliveryDate +
                ", items=" + items +
                '}';
    }

    public OrderRequest(String customerId, String deliveryDate, List<ItemRequest> items) {
        this.customerId = customerId;
        this.warehouseId = "1";
        this.deliveryDate =deliveryDate;
        this.items = items;
    }
}