package societepade.demo.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import societepade.demo.entity.Achat;
import societepade.demo.entity.Article;
import societepade.demo.entity.LigneAchat;

import java.sql.ClientInfoStatus;
import java.util.Date;
import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface AchatRepository extends JpaRepository<Achat,Long> {
    @RestResource(path="/byDate")
    public List<Achat> findByDateContains (@Param("dt") Date date);
    @RestResource(path="/byDatePage")
    public Page<Achat> findByDateContains (@Param("dt")Date date,Pageable pageable);

}
