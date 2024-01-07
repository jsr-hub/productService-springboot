package com.scaler.productservicedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/say/{name}/{times}")
    public  String  sayHello(@PathVariable("name") String name,
                             @PathVariable("times") int times){
        StringBuilder st = new StringBuilder();
        st.append(("Hello " + name + "<br>").repeat(Math.max(0, times)));
        return st.toString();
    }
}
]