package petstore;

import api_assured.ServiceGenerator;
import common.Utilities;
import models.petstore.Pet;
import retrofit2.Call;

public class PetStore extends Utilities {

    PetStoreServices petStore = new ServiceGenerator().generate(PetStoreServices.class);

    public Pet postPet(Pet pet){
        Call<Pet> petCall = petStore.postPet(pet);
        return perform(petCall, true, true);
    }

}
