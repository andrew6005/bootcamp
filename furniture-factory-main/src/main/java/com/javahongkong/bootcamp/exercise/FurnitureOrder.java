

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> ordersOfFurnitures;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
        this.ordersOfFurnitures = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        this.ordersOfFurnitures.put(type,furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        
        return null;
    }

    public float getTotalOrderCost() {
        for(var entry:this.ordersOfFurnitures.entrySet()){
            bd=bd.add(BigDecimal.valueOf(entry.getKey().cost()*entry.getValue()));}
        return bd.floatValue();


        
    }

    public int getTypeCount(Furniture type) {
        
        return this.ordersOfFurnitures.get(type);
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        return this.ordersOfFurnitures.get(type)*type.cost;
    }

    public int getTotalOrderQuantity() {
        

        return this.ordersOfFurnitures.values().stream.mapToInt(Integer::intValue).sum();
        
    }
}