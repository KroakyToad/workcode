package com.infrrd.roostifyapitest.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.infrrd.roostifyapitest.common.FilePropertyHandler;
import com.infrrd.roostifyapitest.pojocollection.CreatingATaskPOJO;
import com.infrrd.roostifyapitest.pojocollection.UpdateATaskPOJO;
import com.infrrd.testfrogforapi.base.BaseTest;

import io.restassured.response.Response;

public class QaAPI extends BaseTest {

	@BeforeClass
	public void setup(){
		initializeReports();
	}
	
	@Test(description = "Testcase to display all tasks")
	public void display_all_tasks() {

		baseURI = "https://qa.roostify.com";
		basePath = "/api/v1/";

		headerMap.put("Authorization", "Basic NjY2MTA0NTE4OTAwNjIxNDoyMmNkOGY0Yzc2ZTYwYTkw");
		headerMap.put("Content-Type", "application/json");

		queryParamMap.put("loan_application_id", "6657144636962928");

		endPoint = "/tasks";

		Response response = get();

		Assert.assertEquals(response.statusCode(), 200);
	}

	@Test(description = "Testcase to retreive all accounts")
	public void retrieving_accounts() {

		baseURI = "https://qa.roostify.com";
		basePath = "/api/v1/";

		headerMap.put("Authorization", "Basic NjY2MTA0NTE4OTAwNjIxNDoyMmNkOGY0Yzc2ZTYwYTkw");
		headerMap.put("Content-Type", "application/json");

		endPoint = "/accounts/6661045189006214";

		Response response = get();

		Assert.assertEquals(response.statusCode(), 200);

	}

	@Test(description = "Testcase to create and update a task")
	public void creating_and_update_a_task() {
		
		Response response ;
		
		// Create a new task

		baseURI = "https://qa.roostify.com";
		basePath = "/api/v1/";

		headerMap.put("Authorization", "Basic NjY2MTA0NTE4OTAwNjIxNDoyMmNkOGY0Yzc2ZTYwYTkw");
		headerMap.put("Content-Type", "application/json");

		endPoint = "/tasks";

		jsonFilePath = FilePropertyHandler.getProperty( "application", "jsonPath" ).get()+"/Creating_a_task.json";

		response = post(CreatingATaskPOJO.class);

		Assert.assertEquals(response.statusCode(), 200);
		
		// =====================================
		
		// Update the created task
		
		String update_id = response.path("id");
		
		endPoint = "/tasks/"+update_id;
		
		jsonFilePath = FilePropertyHandler.getProperty( "application", "jsonPath" ).get()+"/update_a_task.json";
		
		UpdateATaskPOJO pojo = new UpdateATaskPOJO();
				
		response = patch(UpdateATaskPOJO.class);
		
		Assert.assertEquals(response.statusCode(), 200);
		
		// =====================================

	}
}
