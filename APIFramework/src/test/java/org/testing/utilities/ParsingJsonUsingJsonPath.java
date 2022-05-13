package org.testing.utilities;

import io.restassured.response.Response;

public class ParsingJsonUsingJsonPath
{
	public static String parseJsonPath(Response res,String jsonPath)
	{
		return res.jsonPath().get(jsonPath);
	}

}
