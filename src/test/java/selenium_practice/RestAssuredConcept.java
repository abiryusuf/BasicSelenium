package selenium_practice;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class RestAssuredConcept {

    @Test
    public void testResponseCode() {
      Response response = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
      int statusCode = response.getStatusCode();
        System.out.println("Status code is-->"+statusCode);
        Assert.assertEquals(statusCode,200);


    }
    @Test
    public void testResponseData() {
        Response response = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
        String data = response.asString();
        System.out.println("Response data is-->"+data);
        long resTime = response.getTime();
        System.out.println("Respone Time Is-->"+ resTime);
    }

    @Test
    public void createPostStatement(){
       RequestSpecification requestSpecification = RestAssured.given();
       requestSpecification.header("Content-Type","application/json");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","Kartick");
        jsonObject.put("job","leader");

        requestSpecification.body(jsonObject.toJSONString());
        Response response  = requestSpecification.post("https://reqres.in/api/users");
        String resBody = response.getBody().print();
        System.out.println("Response Body is-->"+resBody);
        int resCode = response.getStatusCode();
        System.out.println("Response code is-->"+resCode);
        Assert.assertEquals(resCode,201);
    }
    @Test
    public void createDeleteStatement(){
        RequestSpecification requestSpecification = RestAssured.given();
        Response response  = requestSpecification.delete("https://reqres.in/api/users/2");
        String resBody = response.getBody().print();
        System.out.println("Response Body is-->"+resBody);
        int resCode = response.getStatusCode();
        System.out.println("Response code is-->"+resCode);
        Assert.assertEquals(resCode,204);
    }

    @Test
    public void createPutStatement(){
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.header("Content-Type","application/json");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","Kartick");
        jsonObject.put("job","Automation Tester");

        requestSpecification.body(jsonObject.toJSONString());
        Response response  = requestSpecification.put("https://reqres.in/api/users");
        String resBody = response.getBody().print();
        System.out.println("Response Body is-->"+resBody);
        int resCode = response.getStatusCode();
        System.out.println("Response code is-->"+resCode);
        Assert.assertEquals(resCode,200);
    }
}
