package ch.cbfs.foundation.rest;

import ch.cbfs.foundation.domain.service.FoundationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/foundation")
@RestController
public class FoundationController {

    @Autowired
    private FoundationService foundationService;

    @GetMapping
    public String getAllFoundations() {
        return "foo";
    }
}
