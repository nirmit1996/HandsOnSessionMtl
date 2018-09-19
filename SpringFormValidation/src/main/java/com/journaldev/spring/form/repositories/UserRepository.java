package com.journaldev.spring.form.repositories;

import com.journaldev.spring.form.model.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserRepository {

    private Map<String, User> users = null;

    UserRepository() {
        users = new HashMap<String, User>();
        users.put("a@mail.com", new User("a@mail.com", "12345678@aA"));
        users.put("b@mail.com", new User("b@mail.com", "12345678@bB"));
        users.put("c@mail.com", new User("c@mail.com", "12345678@cC"));
        users.put("d@mail.com", new User("d@mail.com", "12345678@dD"));
        users.put("e@mail.com", new User("e@mail.com", "12345678@eE"));
        users.put("f@mail.com", new User("f@mail.com", "12345678@fF"));
    }
    public Map<String, User> getMapOfUsers() {
        return users;
    }
}
