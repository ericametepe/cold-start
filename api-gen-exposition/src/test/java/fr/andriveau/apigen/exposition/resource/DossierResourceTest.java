package fr.andriveau.apigen.exposition.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.andriveau.apigen.domain.command.ICommand;
import fr.andriveau.apigen.domain.query.IQuery;
import fr.andriveau.apigen.exposition.resource.dto.DossierCreationRequest;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc(addFilters = false)
@WebMvcTest(controllers = DossierResource.class)
@ActiveProfiles(value = "test")
class DossierResourceTest {

    private static final String BASE_URL="http://localhost/nosecure";

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private ICommand iCommand;

    @MockBean
    private IQuery query;

    @Test
    void create() throws Exception {
        String requestBody = new ObjectMapper().writeValueAsString(DossierCreationRequest.builder().description("Yes set it").build());

        Mockito.doNothing().when(iCommand).execute(Mockito.any());

        mockMvc.perform(post("/gen/dossiers")
                .content(requestBody)
                .contentType("application/json"))
                .andExpect(status().isCreated())
                .andDo(print());

    }

    @Test
    void get() {
    }
}
