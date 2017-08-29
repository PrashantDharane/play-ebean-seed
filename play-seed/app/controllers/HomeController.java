package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import dao.ebean.TestDao;
import models.Test;
import play.libs.Json;
import play.mvc.*;

import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
    @Inject
    TestDao testDao;
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    @BodyParser.Of(BodyParser.Json.class)
    public Result addRecord() {
        JsonNode requestData = request().body().asJson();

        Test test = new Test();
        test.setId(requestData.get("id").asLong());
        test.setName(requestData.get("name").asText());
        testDao.save(test);
        return ok(Json.toJson(test));
    }

    public Result getAllRecord() {
        return ok(Json.toJson(testDao.findAllRecords()));
    }

}
