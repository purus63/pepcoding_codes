package test.suprdaily.service;

import test.suprdaily.Exceptions.OrderReservationException;
import test.suprdaily.SuprDaily;
import test.suprdaily.models.ItemRequest;
import test.suprdaily.models.OrderRequest;

import java.util.List;



public class ServeOrder extends SuprDaily implements OrderFulfilmentService  {

    public boolean getcount(int id,int quantity,String date)
    {
        List<ItemRequest> itr;
        if(wh1.getDate()== date)
        {
            itr= wh1.getItems();
            return check(itr,id,quantity);
        }
        else if(wh2.getDate()== date){}

        else if(wh3.getDate()== date){}
        else if(wh4.getDate()== date){}
    }

    private boolean check(List<ItemRequest> itr,int id,int quantity) {
        for(ItemRequest it:itr)
        {
            if(it.getItemId() == id)
            {
                if(it.getQuantity()>=quantity)
                {
                    it.setQuantity(it.getQuantity()-quantity);
                    return true;
                }
                else
                {return false;}
            }
            else continue;
        }
    }


    @Override
    public Boolean canFulfilOrder(OrderRequest orderRequest) {
        for(ItemRequest it: orderRequest.getItems())
        {
            String day =orderRequest.getDeliveryDate();
            if(getcount(it.getItemId(),it.getQuantity(),day))
        }
        return true;
    }

    @Override
    public void reserveOrder(OrderRequest orderRequest) throws OrderReservationException {

    }


}
