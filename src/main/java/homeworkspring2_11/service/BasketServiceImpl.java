package homeworkspring2_11.service;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService{

    ArrayList<Integer> data = new ArrayList<>();
    @Override
    public void addId(Integer[] id) {
        Collections.addAll(data,id);
    }

    @Override
    public ArrayList<Integer> getId() {
        return data;
    }
}
