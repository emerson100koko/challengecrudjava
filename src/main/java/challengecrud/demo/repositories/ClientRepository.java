package challengecrud.demo.repositories;

import challengecrud.demo.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {



}
