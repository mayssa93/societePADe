package societepade.demo.webController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import societepade.demo.entity.LigneAchat;
import societepade.demo.service.LigneAchatService;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(path = "/ligne-achats")
public class LigneAchatController {
    @Autowired
    LigneAchatService ligneAchatService;
    @GetMapping (value= "/")
    public List<LigneAchat> getLigneArticles() {
        return ligneAchatService.getLigneAchat();
    }
    @GetMapping (value= "/{id}")
    public LigneAchat getLigneAchatById(@PathVariable long id) throws Exception {
        Optional<LigneAchat> LA = ligneAchatService.getLigneAchatById(id);
        return LA.get();
    }
    @PostMapping (value= "/")
    public LigneAchat createLigneAchat(@RequestBody LigneAchat newla) {
        return ligneAchatService.addNewLigneAchat(newla);
    }
    @PutMapping (value= "/{id}")
    public LigneAchat updateArticle(@RequestBody LigneAchat upla, @PathVariable Long id) throws Exception {
        Optional<LigneAchat> LA =  ligneAchatService.getLigneAchatById(id);
        upla.setId(id);
        return ligneAchatService.updateLigneAchat(upla);
    }
    @DeleteMapping (value= "/{id}")
    public void deleteLigneAchatById(@PathVariable long id) throws Exception {
        Optional<LigneAchat> LA =  ligneAchatService.getLigneAchatById(id);
        ligneAchatService.deleteLigneAchatById(id);
    }
    @DeleteMapping(value= "/")
    public void deleteAll() {
        ligneAchatService.deleteAllLigneAchat();
    }
}
