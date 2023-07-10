package homeworkspring2_11.service;

import homeworkspring2_11.Basket;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class BasketServiceImpl implements BasketService{

    ArrayList<Basket> data = new ArrayList<>();
    @Override
    public void addId(Integer id) {
        Basket newItem = new Basket(id);
        data.add(newItem);
    }

    @Override
    public ArrayList<Basket> getId() {
        return data;
    }
}
