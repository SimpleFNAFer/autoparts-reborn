package com.autoparts.partservice;

import com.autoparts.partservice.model.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private MainService mainService;
    @GetMapping("/all")
    public List<Part> all() {
        return mainService.all();
    }

    @GetMapping("/search")
    public List<Part> search(@RequestParam String model) {
        return mainService.search(model);
    }

    @GetMapping("/part")
    public Part part(@RequestParam long id) {
        return mainService.part(id);
    }

    @GetMapping("/replace")
    public List<Part> replace(@RequestParam long id) {
        return mainService.replace(id);
    }
}
