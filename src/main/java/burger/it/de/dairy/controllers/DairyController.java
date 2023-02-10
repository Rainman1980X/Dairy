package burger.it.de.dairy.controllers;

import burger.it.de.dairy.models.DairyEntry;
import burger.it.de.dairy.repositories.DairyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/dairy")
public class DairyController {

    @Autowired
    private DairyRepository dairyRepository;

    @GetMapping
    public List<DairyEntry> findAll(){
        return dairyRepository.findAll();
    }
}
