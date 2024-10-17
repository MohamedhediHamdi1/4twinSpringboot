package tn.esprit.tpfoyer.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tpfoyer.Entities.Chambre;
import tn.esprit.tpfoyer.ServicesImp.ChambreServiceImpl;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreController {

    ChambreServiceImpl chambreService;

    @GetMapping("/getall")
    public List<Chambre> getAll(){
        return chambreService.getAllChambre();
    }

}
