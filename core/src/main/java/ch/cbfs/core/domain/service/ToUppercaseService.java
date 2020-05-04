package ch.cbfs.core.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ToUppercaseService {

    public String toUppercase(String inputString) {
        return inputString.toUpperCase();
    }

}
