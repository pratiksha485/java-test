package com.example.myAppS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myAppS.Entity.Resource;
import com.example.myAppS.Service.ResourceService;

@RestController
@RequestMapping("/api/resource")
public class ResourceController {

    @Autowired
    private ResourceService service;

    @PostMapping("/add")
    public Resource addResource(@RequestBody Resource resource) {
        return service.addResource(resource);
    }

    @GetMapping("/microservice")
    public List<String> getMicroserviceResources() {
        return service.getMicroserviceResources();
    }

    @GetMapping("/cloud")
    public List<String> getCloudResources() {
        return service.getCloudResources();
    }

    @GetMapping("/all")
    public List<Resource> getAllResources() {
        return service.getAllResources();
    }
}
