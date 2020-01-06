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
import java.util.Date;
import java.util.List;
import java.util.Optional;
@CrossOrigin("*")
@RepositoryRestResource
public interface LigneAchatRepository extends JpaRepository<LigneAchat,Long> {
    List<LigneAchat> findByAchatId(long AchatIdAchat);
    Optional<LigneAchat> findByIdAndAchatId(Long idLAchat,Long AchatIdAchat);
    List<LigneAchat> findByArticleId(long ArticleIdArticle);
    Optional<LigneAchat> findByIdAndArticleId(Long idLAchat,Long ArticleIdArticle);
}
