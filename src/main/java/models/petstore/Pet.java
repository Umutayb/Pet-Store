package models.petstore;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
public class Pet {
    Long id;
    DataModel category;
    String name;
    List<String> photoUrls;
    List<DataModel> tags;
    String status;

    @Data
    @NoArgsConstructor
    public static class DataModel {
        Integer id;
        String name;
    }
}