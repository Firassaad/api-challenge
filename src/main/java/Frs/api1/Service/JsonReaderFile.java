package Frs.api1.Service;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import Frs.api1.Entity.Photo;

@Service
public class JsonReaderFile {


  private final ObjectMapper objectMapper = new ObjectMapper();

      public List<Photo> readDataFromFile(String filePath) throws IOException {
        // Read JSON from file and convert to List<Photo>
        return Arrays.asList(objectMapper.readValue(Path.of(filePath).toFile(), Photo[].class));
    }

}
