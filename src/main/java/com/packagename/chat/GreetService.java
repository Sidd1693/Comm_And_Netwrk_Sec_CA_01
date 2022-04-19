package com.packagename.chat;

import java.io.Serializable;

import org.springframework.stereotype.Service;



// jsut for checking
@Service
public class GreetService implements Serializable {

    public String greet(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello  user";
        } else {
            return "Hello " + name;
        }
    }

}
