import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DossierCreationStep {
    @Given("l'utilisateur {string} de la filiale de {string} veut créer un dossier avec les informations suivantes:")
    public void lUtilisateurDeLaFilialeDeVeutCréerUnDossierAvecLesInformationsSuivantes(String arg0, String arg1) {
    }

    @When("l'utilisateur {string} soumet sa demande de création de dossier")
    public void lUtilisateurSoumetSaDemandeDeCréationDeDossier(String arg0) {
    }

    @Then("le systeme affiche le lien du dossier créé")
    public void leSystemeAfficheLeLienDuDossierCréé() {
    }
}
