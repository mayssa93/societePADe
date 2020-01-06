package societepade.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import societepade.demo.dao.LigneAchatRepository;
import societepade.demo.entity.LigneAchat;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
@Service
public class LigneAchatService {
    @Autowired
    LigneAchatRepository ligneAchatRepository;
    public List<LigneAchat> getLigneAchat() {
       return ligneAchatRepository.findAll();
  }
    public Optional<LigneAchat> getLigneAchatById(Long achatLid) {
        return ligneAchatRepository.findById(achatLid);
    }
    public LigneAchat addNewLigneAchat(LigneAchat ligneAchat) {
        return ligneAchatRepository.save(ligneAchat);
    }
    public LigneAchat updateLigneAchat(LigneAchat ligneAchat) {
        return ligneAchatRepository.save(ligneAchat);
    }
    public void deleteLigneAchatById(Long achatLid) {
        ligneAchatRepository.deleteById(achatLid);
    }
    public void deleteAllLigneAchat() {
        ligneAchatRepository.deleteAll();
    }
}
