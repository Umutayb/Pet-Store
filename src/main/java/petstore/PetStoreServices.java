package petstore;

import models.petstore.Pet;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface PetStoreServices {
    String BASE_URL = PetStoreApi.BASE_URL;

    @POST(PetStoreApi.PET_SUFFIX)
    Call<Pet> postPet(@Body Pet pet);
}
