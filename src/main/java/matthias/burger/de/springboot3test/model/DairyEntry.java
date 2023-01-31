package matthias.burger.de.springboot3test.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Entity
@Data
@Accessors(chain=true)
@NoArgsConstructor
@AllArgsConstructor
public class DairyEntry {

    @Id
    private Integer id;

    @Column
    private LocalDateTime entryDate;

    @Column
    private String text;


}
