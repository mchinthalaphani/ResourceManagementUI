/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ResourceManagementUI.freemarker;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.ResourceManagementUI.service.types.UserInfoResponse;

@Controller
public class UserController {

	@Value("${application.message:Hello World}")
	private String message = "Hello World";

	@GetMapping("/users")
	public String getUsers(Map<String, Object> model) {
		RestTemplate restTemplate = new RestTemplate();
		StringBuilder url = new StringBuilder().append("http://localhost:8383/users/3");
		UserInfoResponse userInfo = restTemplate.getForObject(url.toString(),UserInfoResponse.class);
		StringBuilder url1 = new StringBuilder().append("http://localhost:8383/users");
		List<UserInfoResponse> records = restTemplate.getForObject(url1.toString(),List.class);
		model.put("userName", userInfo.getFirstName());
		model.put("records", records);
		model.put("listName", "Users");
		return "UserDetails";
	}

}
