package com.ResourceManagementUI.freemarker;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.ResourceManagementUI.service.types.ProjectRequest;
import com.ResourceManagementUI.service.types.UserInfoResponse;

@Controller
public class ProjectController {
	@GetMapping("/projects")
	public String getProjects(Map<String, Object> model) {
		RestTemplate restTemplate = new RestTemplate();
		StringBuilder url1 = new StringBuilder().append("http://localhost:8383/project/getprojects");
		List<ProjectRequest> records = restTemplate.getForObject(url1.toString(),List.class);
		model.put("records", records);
		model.put("listName", "Projects");
		
		return "ProjectDetails";
	}
	@GetMapping("/getproject")
	public String getProject(Map<String, Object> model) {
		RestTemplate restTemplate = new RestTemplate();
		StringBuilder url1 = new StringBuilder().append("http://localhost:8383/project/1");
		ProjectRequest record = restTemplate.getForObject(url1.toString(),ProjectRequest.class);
		model.put("record", record);
		model.put("listName", "Projects");
		
		return "ProjectDetail";
	}

}
