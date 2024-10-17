package tn.esprit.tpfoyer.ServicesImp;

import tn.esprit.tpfoyer.Entities.Chambre;

import java.util.List;
import java.util.Optional;

public interface IChambreInterface {
    public Chambre addChambre(Chambre c);
    public List<Chambre> getAllChambre();
    public Optional<Chambre> getChambreById(Long id);
    public Chambre updateChambre(Chambre c);
    public void deleteChambre(Chambre c);

    List<Chambre> addlist(List<Chambre> list);
}
