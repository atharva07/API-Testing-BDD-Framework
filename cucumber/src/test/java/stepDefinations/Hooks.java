package stepDefinations;

import java.io.IOException;
import io.cucumber.java.Before;

public class Hooks {
    
    @Before("@DeletePlace")
    public void beforeScenario() throws IOException {
        // write a code that will give placeid
        // execute this code is only placeid is null

        StepDefinitions obj = new StepDefinitions();
        if(StepDefinitions.place_id == null) {
            obj.add_place_payload("Shetty", "French", "Asia");
            obj.user_calls_with_post_http_request("AddPlaceAPI", "POST");
            obj.verify_place_id_created_maps_to_using("Shetty", "getPlaceAPI");
        }
    }
}
