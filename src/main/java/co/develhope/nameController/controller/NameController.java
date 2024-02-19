package co.develhope.nameController.controller;

import co.develhope.nameController.services.GetName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class NameController {
    @Autowired
    private GetName getName;

    @GetMapping("/name")
    public String returnName(@RequestParam String name) {
        return getName.getName(name);
    }

    @PostMapping("/invertname")
    public StringBuilder invertName(@RequestParam String name) {
        return getName.invertName(name);
    }
}
