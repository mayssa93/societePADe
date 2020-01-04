package societepade.demo.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import societepade.demo.entity.Achat;
import societepade.demo.entity.Article;
import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface ArticleRepository extends JpaRepository<Article,Long> {
@RestResource(path="/byReference")
    public List<Article> findByReferenceContains(@Param("rf")String ref);
@RestResource(path="/byReferencePage")
    public Page<Article> findByReferenceContains (@Param("rf")String ref,Pageable pageable);
}
