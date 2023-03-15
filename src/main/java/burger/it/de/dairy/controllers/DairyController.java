package burger.it.de.dairy.controllers;

import burger.it.de.dairy.models.DairyEntry;
import burger.it.de.dairy.repositories.DairyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/dairy")
public class DairyController {

    @Autowired
    private DairyRepository dairyRepository;

    @GetMapping
    public List<DairyEntry> findAll() {
        return dairyRepository.findAll();
    }
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void create(@RequestBody DairyEntry entry){
        dairyRepository.save(entry);
    }
}
