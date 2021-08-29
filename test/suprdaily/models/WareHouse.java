package test.suprdaily.models;

import java.util.List;

public class WareHouse {
    String warehouseId;
    List<ItemRequest> items;
    String date;

    public WareHouse(String warehouseId, List<ItemRequest> items, String date) {
        this.warehouseId = warehouseId;
        this.items = items;
        this.date = date;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public List<ItemRequest> getItems() {
        return items;
    }

    public void setItems(List<ItemRequest> items) {
        this.items = items;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
