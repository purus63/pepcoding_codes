package test.suprdaily.models;

public class ItemRequest {
    Integer itemId;
    String itemName;
    String category; // Category that the items belongs to.
    Integer quantity; // Quantity trying to be ordered.

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ItemRequest{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public ItemRequest(String itemName, Integer quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }
}