package tests;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import pages.ApiTask.Atributs;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import static constans.Constants.UrlApiRequest.UrlPostDelay;
import static io.restassured.RestAssured.given;

public class APItest {
    @Test
    public void UrlDelayTest() {
        int delayTime = 6;
        String  url1 = String.valueOf(given()
                .when()
                .contentType(ContentType.JSON)
                .get(UrlPostDelay +delayTime)
                .then().log().all()
                .extract().jsonPath().getString("url"));
     System.out.println(url1);
    }
    @Test
    public void UrlDelayTest2() {
        int delayTime = 4;
        Response  response = RestAssured
                .post(UrlPostDelay +delayTime)
                .andReturn();
        long timeInMS = response.time();
        long timeInS = response.timeIn(TimeUnit.SECONDS);
        Assert.assertEquals(delayTime+1, timeInMS/1000);
        //примерно 1с на отправку запроса + время ожидания = разница прммерно 1-2с
        System.out.println(delayTime+1 +"=="+ timeInMS/1000);
    }
    @Test
    public void UrlDelayTest3() {
        Gson js = new Gson();
       List<Atributs> atributs = given()
                .when()
                .contentType(ContentType.JSON)
                .queryParam("status", "sold")
                .get("https://petstore.swagger.io/v2/pet/findByStatus")
                .then().log().all()
                .extract().body().jsonPath().getList("$", Atributs.class);
       List <String> name = atributs.stream().map(Atributs::getName).collect(Collectors.toList());
        System.out.println(name);
    }
}
