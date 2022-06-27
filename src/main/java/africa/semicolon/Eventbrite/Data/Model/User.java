package africa.semicolon.Eventbrite.Data.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("User")
public class User {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    private LocalDateTime localDateTime = LocalDateTime.now();
}
