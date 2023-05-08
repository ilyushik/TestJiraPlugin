package com.atlassian.plugins.tutorial.rest.test;

import com.atlassian.plugins.rest.common.security.AnonymousAllowed;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.LinkedList;
import java.util.List;

@Path("/jira/rest/version")
public class TestResource {
    private List<TestModel> testModels = new LinkedList<TestModel>();
    private int number = 0;

    @POST
    @AnonymousAllowed
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<TestModel> list(@QueryParam("str") String str) {
        if (str != null) {
            return words(str);
        } else {
            return words("Hello world");
        }
    }





    private List<TestModel> words(String str) {
        testModels.clear();
        number = 0;
        String[] newWords = str.split(" ");
        for (String string : newWords) {
            number++;
            testModels.add(new TestModel(number, string));
        }
        return testModels;
    }
}
