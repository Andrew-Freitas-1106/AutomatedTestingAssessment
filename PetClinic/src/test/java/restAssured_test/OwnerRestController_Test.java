//package restAssured_test;
//
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//import io.restassured.response.ValidatableResponse;
//import io.restassured.specification.RequestSpecification;
//import org.json.JSONArray;
//import org.json.JSONObject;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.Map;
//
//import static io.restassured.RestAssured.given;
//
//public class OwnerRestController_Test {
//    private RequestSpecification request;
//    private Response response;
//    private ValidatableResponse json;
//    private JSONObject params;
//
//    ExtentReports report;
//    ExtentTest test;
//
//    @Before
//    public void setup(){
//        //report = new ExtentReports();
//        request = given().contentType(ContentType.JSON);
//    }
//
//    @After
//    public void teardown(){
//
//    }
//
//    @Test
//    public void test_Get_OwnerRestController(){
//        response = request.when().get("http://10.0.10.10:9966/petclinic/api/owners");
//        json = response.then().statusCode(200);
//    }
//
//    @Test
//    public void test_Get_Lastname_OwnerRestController(){
//        response = request.when().get("http://10.0.10.10:9966/petclinic/api/owners/*/lastname/Z");
//        json = response.then().statusCode(200);
//    }
//
//    @Test
//    public void test_Get_ID_OwnerRestController(){
//        response = request.when().get("http://10.0.10.10:9966/petclinic/api/owners/3");
//        json = response.then().statusCode(200);
//    }
//
//    @Test
//    public void test_Post_OwnerRestController(){
////        params = new JSONObject();
////
////        response = request.when().get("http://10.0.10.10:9966/petclinic/api/owners");
////
////        params.put("firstName", "awefrqwef");
////        params.put("lastName", "sdfgser");
////        params.put("address", "qazxsw2");
////        params.put("city", "london");
////        params.put("telephone", "1234567890");
////        params.put("pets",Map<0,0>);
////
////        request.body(params.toString());
////
////        response = request.post("http://10.0.10.10:9966/petclinic/api/owners");
////
////        //json = response.then().statusCode(201);
////        System.out.println(response.getStatusCode());
//
//        JSONArray petArray = new JSONArray();
//
//        JSONArray visitArray = new JSONArray();
//
//        RestAssured.baseURI = "http://10.0.10.10:9966/petclinic/api/owners";
//
//        Map<String, Object> emptyOwner = new HashMap<>();
//
//        Map<String, Object> emptyPet = new HashMap<>();
//
//        Map<String, Object> nestedVisitAsMap = new HashMap<>();
//
//        nestedVisitAsMap.put("date", "yyyy/MM/dd");
//        nestedVisitAsMap.put("description", "string");
//        nestedVisitAsMap.put("id", 0);
//        nestedVisitAsMap.put("pet", emptyPet);
//        visitArray.add(nestedVisitAsMap);
//
//        Map<String, Object> nestedPetAsMap = new HashMap<>();
//
//        Map<String, Object> nestedTypeAsMap = new HashMap<>();
//
//        nestedTypeAsMap.put("id", 0);
//
//        nestedTypeAsMap.put("name", "String");
//
//        nestedPetAsMap.put("birthDate", "2018-07-27T09:02:40.767Z");
//        nestedPetAsMap.put("id", 0);
//        nestedPetAsMap.put("name", "String");
//        nestedPetAsMap.put("owner", emptyOwner);
//        nestedPetAsMap.put("type", nestedTypeAsMap); // needs nested type TODO
//        nestedPetAsMap.put("visits", visitArray); // needs nested type TODO
//
//        petArray.add(nestedPetAsMap);
//        JSONObject requestParams = new JSONObject();
//
//        requestParams.put("address", "Manchester");
//        requestParams.put("city", "This is a test");
//        requestParams.put("firstName", "ANTHIA");
//        requestParams.put("id", 10);
//        requestParams.put("lastName", "String");
//        requestParams.put("pets", petArray);
//        requestParams.put("telephone", "1234567891");
//
//
//        given().contentType(ContentType.JSON).body(requestParams).when().post("/").then().statusCode(201);
//
//        System.out.println(requestParams.toString());​
//
//
//    }
//
//    @Test
//    public void test_Delete_OwnerRestController(){
//        response = request.delete("http://10.0.10.10:9966/petclinic/api/owners/14");
//        json = response.then().statusCode(204);
//    }
//
//    @Test
//    public void test_Put_OwnerRestController(){
//
//    }
//
//
//}
