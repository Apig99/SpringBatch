package apig.aramian.demo.batch;

import apig.aramian.demo.model.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<User, User> {


    @Override
    public User process(User user) throws Exception {

        return user;
    }
}
