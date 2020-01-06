package societepade.demo.webController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import societepade.demo.dao.LigneAchatRepository;
import societepade.demo.entity.LigneAchat;
import societepade.demo.service.LigneAchatService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Collection;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LigneAchatController {
    @Autowired
    LigneAchatService ligneAchatService;
    @GetMapping(value="/cool-ligneachats")
    public List<LigneAchat> getLigneAchats() {
        return ligneAchatService.getLigneAchat();
    }
    @GetMapping (value= "/cool-ligneachats/{id}")
    public LigneAchat getLigneAchatById(@PathVariable long id) throws Exception {
        Optional<LigneAchat> LA = ligneAchatService.getLigneAchatById(id);
        return LA.get();
    }
    @PostMapping (value= "/cool-ligneachats")
    public LigneAchat createLigneAchat(@RequestBody LigneAchat newla) {
        return ligneAchatService.addNewLigneAchat(newla);
    }
    @PutMapping (value= "/cool-ligneachats/{id}")
    public LigneAchat updateArticle(@RequestBody LigneAchat upla, @PathVariable Long id) throws Exception {
        Optional<LigneAchat> LA =  ligneAchatService.getLigneAchatById(id);
        upla.setId(id);
        return ligneAchatService.updateLigneAchat(upla);
    }
    @DeleteMapping (value= "/cool-ligneachats/{id}")
    public void deleteLigneAchatById(@PathVariable long id) throws Exception {
        Optional<LigneAchat> LA =  ligneAchatService.getLigneAchatById(id);
        ligneAchatService.deleteLigneAchatById(id);
    }
    @DeleteMapping(value= "/cool-ligneachats")
    public void deleteAll() {
        ligneAchatService.deleteAllLigneAchat();
    }
}
