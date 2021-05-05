package fr.andriveau.apigen.exposition.resource.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DossierCreationRequest {
    @NotBlank
    private String description;

}
