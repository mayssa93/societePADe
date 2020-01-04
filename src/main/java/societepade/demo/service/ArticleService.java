package societepade.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import societepade.demo.dao.ArticleRepository;
import societepade.demo.entity.Article;
import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    ArticleRepository articleRepository;
    public List<Article> getArticles() {
        return articleRepository.findAll();
    }
    public Optional<Article> getArticlesById(Long articleid) {
        return articleRepository.findById(articleid);
    }
    public Article addNewArticle(Article article) {
        return articleRepository.save(article);
    }
    public Article updateArticle(Article article) {
        return articleRepository.save(article);
    }
    public void deleteArticleById(Long articleid) {
        articleRepository.deleteById(articleid);
    }
    public void deleteAllArticles() {
        articleRepository.deleteAll();
    }
}
