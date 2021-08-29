package test.suprdaily;

import test.suprdaily.Exceptions.OrderReservationException;
import test.suprdaily.models.ItemRequest;
import test.suprdaily.models.OrderRequest;
import test.suprdaily.models.WareHouse;
import test.suprdaily.service.ServeOrder;

import java.util.ArrayList;
import java.util.List;

public class SuprDaily {
    public static WareHouse wh1,wh2,wh3,wh4;

    public static void main(String[] args) throws OrderReservationException {



        createwareHouse();

        ItemRequest itr1 =new ItemRequest("Apple",3);
        ItemRequest itr2 =new ItemRequest("Banana",1);
        ItemRequest itr3 =new ItemRequest("Parle-G",1);
        List<ItemRequest> list1= new ArrayList<>();
        list1.add(itr1);
        list1.add(itr2);
        list1.add(itr3);
        OrderRequest req1 = new OrderRequest("10001","2020-10-13",list1);
        ServeOrder serve1= new ServeOrder();
        System.out.println(serve1.canFulfilOrder(req1));
        serve1.reserveOrder(req1);
    }

    private static void createwareHouse() {
        ItemRequest it1 =new ItemRequest("Apple",100);
        ItemRequest it2 =new ItemRequest("Banana",100);
        ItemRequest it3 =new ItemRequest("Parle-G",100);
        List<ItemRequest> l1= new ArrayList<>();
        l1.add(it1);
        l1.add(it2);
        l1.add(it3);
        wh1 = new WareHouse("1",l1,"2020-10-13");
        wh2 = new WareHouse("2",l1,"2020-10-13");

        List<ItemRequest> l2= new ArrayList<>();
        ItemRequest item1 =new ItemRequest("Apple",100);
        ItemRequest item2 =new ItemRequest("Banana",100);
        ItemRequest item3 =new ItemRequest("Parle-G",100);
        wh3 = new WareHouse("1",l1,"2020-10-14");
        wh4 = new WareHouse("2",l1,"2020-10-14");
    }
}
