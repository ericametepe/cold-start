package fr.andriveau.apigen.domain.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DossierCommandCreationRequest {
    @NotBlank
    private String description;
}
