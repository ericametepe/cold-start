package fr.andriveau.apigen.domain.infra.jpa;

import fr.andriveau.apigen.domain.model.Dossier;
import fr.andriveau.apigen.domain.repository.DossierRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DossierRepositoryImpl implements DossierRepository {

    public void create(Dossier dossier) {

    }

    @Override
    public List<Dossier> getAll() {
        return null;
    }
}
