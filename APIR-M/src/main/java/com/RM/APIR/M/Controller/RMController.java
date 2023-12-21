package com.RM.APIR.M.Controller;

import com.RM.APIR.M.Service.RMService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RMController {
    private final RMService rmService;

    public RMController(RMService rmService) {
        this.rmService = rmService;
    }

    @GetMapping("/character/{id}")
    public String getCharacterById(@PathVariable int id) {
        return rmService.getCharacterById(id);
    }
}
