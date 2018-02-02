package org.gson;

import com.google.gson.Gson;

public class GsonUtil {

	public static void GsonTest(Object obj) {
		Gson gs = new Gson();
		gs.toJson(obj);
	}
}
