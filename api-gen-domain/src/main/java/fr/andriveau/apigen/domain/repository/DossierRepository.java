package fr.andriveau.apigen.domain.repository;

import fr.andriveau.apigen.domain.model.Dossier;

import java.util.List;

public interface DossierRepository {
    void create(Dossier dossier);

    List<Dossier> getAll();
}
