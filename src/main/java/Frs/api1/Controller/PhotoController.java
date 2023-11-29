package Frs.api1.Controller;

import java.io.Console;
import java.io.IOException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Frs.api1.Entity.Photo;
import Frs.api1.Service.JsonReaderFile;

@RestController
@RequestMapping("/photo")
public class PhotoController {

   private final JsonReaderFile jReaderFile;

   public PhotoController(JsonReaderFile jsonReaderFile){
    this.jReaderFile=jsonReaderFile;
   }


  @GetMapping("/getAll")
public ResponseEntity<List<Photo>> getAll() {
  System.out.println("triggered from the front end");
    try {
        List<Photo> photos = jReaderFile.readDataFromFile("src/main/resources/static/data.json");
        return ResponseEntity.ok(photos);
    } catch (IOException e) {
        e.printStackTrace();
        // You might want to log the exception or handle it in a way appropriate for your application
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}

}
