package Frs.api1.Controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import Frs.api1.Service.FileUploadService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:3000")
public class UploadController {

  // DI with contructor
  private final FileUploadService fileUploadService;

  public UploadController(FileUploadService fileUploadService) {
    this.fileUploadService = fileUploadService;
  }

  @GetMapping("/api")
  public void test() {
    System.out.println("test api access");
  }

  @PostMapping("/upload")
  public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file,
      @RequestParam("username") String firstName, @RequestParam("password") String lastName) {
    try {
      byte[] fileData = file.getBytes();
      // Vous pouvez utiliser firstName, lastName, et fileData comme nécessaire
      fileUploadService.saveFile(firstName, lastName, fileData);

      return ResponseEntity.ok("File uploaded successfully");
    } catch (IOException e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error uploading file");
    }

  }

}
