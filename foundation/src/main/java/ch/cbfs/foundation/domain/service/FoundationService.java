package ch.cbfs.foundation.domain.service;

import ch.cbfs.core.domain.service.ToUppercaseService;
import ch.cbfs.foundation.domain.model.Foundation;
import ch.cbfs.foundation.domain.repository.FoundationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class FoundationService {

    @Autowired
    private ToUppercaseService toUppercaseService;

    @Autowired
    private FoundationRepository foundationRepository;

    public Foundation getFoundation(Long id) {
        return foundationRepository.findById(id).orElse(null);
    }

    public List<Foundation> getAllFoundations() {
        return (List<Foundation>) foundationRepository.findAll();
    }

    public List<Foundation> getAllFoundationsNameUppercase() {
        List<Foundation> foundations = (List<Foundation>) foundationRepository.findAll();
        List<Foundation> foundationsNameUppercase = new ArrayList<>();

        for (Foundation foundation : foundations) {
            foundationsNameUppercase.add(
                    new Foundation(
                            foundation.getId(),
                            toUppercaseService.toUppercase(foundation.getName()),
                            foundation.getPerson())
            );
        }

        return foundationsNameUppercase;
    }
}
