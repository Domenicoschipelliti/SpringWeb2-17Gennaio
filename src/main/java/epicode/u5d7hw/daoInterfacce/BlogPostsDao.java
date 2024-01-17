package epicode.u5d7hw.daoInterfacce;

import epicode.u5d7hw.entities.Blogpost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.UUID;

@Repository
public interface BlogPostsDao extends JpaRepository<Blogpost, UUID> {
}
