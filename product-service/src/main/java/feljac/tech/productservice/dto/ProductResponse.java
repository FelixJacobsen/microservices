package feljac.tech.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {

    /**
     DTO as response to not expose model entity.
     **/

    @Id
    private String id;
    private String name;
    private String description;
    private double price;
}
