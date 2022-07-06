package africa.semicolon.Eventbrite.Data.Repository;

import africa.semicolon.Eventbrite.Data.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository <User, String>{

    Optional <User>  findByEmailAddress(String emailAddress);

    boolean existsByEmailAddress(String emailAddress);

}
