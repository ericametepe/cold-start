package fr.andriveau.apigen.exposition.resource;

import fr.andriveau.apigen.domain.command.DossierCommandCreationRequest;
import fr.andriveau.apigen.domain.command.ICommand;
import fr.andriveau.apigen.domain.query.IQuery;
import fr.andriveau.apigen.domain.model.Dossier;
import fr.andriveau.apigen.exposition.resource.dto.DossierCreationRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = {"/gen","/nosecure"})
@AllArgsConstructor
@Slf4j
public class DossierResource {
    private final ICommand iCommand;
    private final IQuery queryExecutor;

    @Operation(summary = "Create dossier ")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Create the new dossier",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = DossierCreationRequest.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid input supplied",
                    content = @Content)})

    @PostMapping(path = "/dossiers")
    public ResponseEntity<String> create(@RequestBody DossierCreationRequest dossierCreationRequest){
        log.info("start creation with : {}",dossierCreationRequest);
        ModelMapper modelMapper = new ModelMapper();
        var request = modelMapper.map(dossierCreationRequest, DossierCommandCreationRequest.class);
        iCommand.execute(request);
        log.info("end creation");

        return new ResponseEntity<>("/dossiers/"+UUID.randomUUID().toString(), HttpStatus.CREATED);
    }
    @GetMapping(path = "/dossiers")
    public ResponseEntity<List<Dossier>> get(){
        log.info("get all dossiers  : ");
        ModelMapper modelMapper = new ModelMapper();
        return new ResponseEntity(List.of(Dossier.builder().description("Frist dossier").build()), HttpStatus.OK);
    }




}
