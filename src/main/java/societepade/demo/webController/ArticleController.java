package societepade.demo.webController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import societepade.demo.entity.Article;
import societepade.demo.service.ArticleService;
import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/articlees")
public class ArticleController {
    @Autowired
    ArticleService articleService;
    @GetMapping(value="")
    public List<Article> getArticles() {
        return articleService.getArticles();
    }
    @GetMapping (value="/{id}")
    public Article getArticlesById(@PathVariable long id) throws Exception {
        Optional<Article> art =  articleService.getArticlesById(id);
        if(!art.isPresent())
            throw new Exception("Could not find article with id- " + id);
        return art.get();
    }
    @PostMapping(value="/")
    public Article createArticle(@RequestBody Article newart) {
        return articleService.addNewArticle(newart);
    }
    @PutMapping (value= "/{id}")
    public Article updateArticle(@RequestBody Article upart, @PathVariable Long id) throws Exception {
        Optional<Article> art =  articleService.getArticlesById(id);
        upart.setId(id);
        return articleService.updateArticle(upart);
    }
    @DeleteMapping (value= "/{id}")
    public void deleteArticleById(@PathVariable long id) throws Exception {
        articleService.deleteArticleById(id);
    }
    @DeleteMapping(value= "/")
    public void deleteAll() {
        articleService.deleteAllArticles();
    }
}
