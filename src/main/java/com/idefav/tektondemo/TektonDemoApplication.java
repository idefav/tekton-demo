package com.idefav.tektondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TektonDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TektonDemoApplication.class, args);
    }

    /**
     * hello world
     *
     * @param name 名称
     * @return 结果
     */
    @GetMapping("/say/hello/{name}")
    public String say(@PathVariable("name") String name) {
        return String.format("hello, %s", name);
    }

}
