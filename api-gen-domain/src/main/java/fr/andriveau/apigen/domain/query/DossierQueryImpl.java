package fr.andriveau.apigen.domain.query;

import fr.andriveau.apigen.domain.model.Dossier;
import fr.andriveau.apigen.domain.repository.DossierRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class DossierQueryImpl implements IQuery<List<Dossier>> {

    private final DossierRepository dossierRepository;

    @Override
    public List<Dossier> get() {
        return dossierRepository.getAll();
    }
}
