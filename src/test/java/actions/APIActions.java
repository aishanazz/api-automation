package actions;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class APIActions {

    public static <T> T getDataFromJsonPath(Response response, String jsonPath) {
        JsonPath jPath = response.jsonPath();
        return jPath.get(jsonPath);
    }
}
