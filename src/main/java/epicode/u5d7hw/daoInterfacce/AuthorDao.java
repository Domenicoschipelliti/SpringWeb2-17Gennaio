package epicode.u5d7hw.daoInterfacce;

import epicode.u5d7hw.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AuthorDao extends JpaRepository<Author, UUID> {
}
