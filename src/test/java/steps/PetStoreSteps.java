package steps;

import io.cucumber.java.en.Given;
import models.petstore.Pet;
import org.junit.Assert;
import petstore.PetStore;
import java.util.List;

public class PetStoreSteps {
    PetStore petStore = new PetStore();

    @Given("Post randomized pet")
    public void postRandomPet(){
        Pet pet = new Pet();
        pet.setStatus("unavailable");
        pet.setName("Grumpy");

        Pet.DataModel category = new Pet.DataModel();
        category.setId(0);
        category.setName("Dog");

        Pet.DataModel tag = new Pet.DataModel();
        tag.setId(0);
        tag.setName("Healthy");

        pet.setCategory(category);
        pet.setTags(List.of(tag));
        pet.setPhotoUrls(List.of("null"));

        Pet responsePet = petStore.postPet(pet);

        Assert.assertEquals("Pet names do not match!", pet.getName(), responsePet.getName());
    }
}
