package fr.andriveau.apigen.domain.command;

import fr.andriveau.apigen.domain.repository.DossierRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DossierCreationCommandImpl implements ICommand {

    private final DossierRepository dossierRepository;

    @Override
    public void execute(Object commandRequest) {

    }
}
