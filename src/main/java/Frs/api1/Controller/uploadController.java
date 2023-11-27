package Frs.api1.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController("/")
public class uploadController {

    @GetMapping("/api")
    public void test(){
      System.out.println("test api access");
    }
}
