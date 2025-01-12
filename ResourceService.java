package com.example.myAppS.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myAppS.Entity.Resource;
import com.example.myAppS.Repository.ResourceRepository;

@Service
public class ResourceService {

    @Autowired
    private ResourceRepository repository;

    public Resource addResource(Resource resource) {
        return repository.save(resource);
    }

    public List<Resource> getAllResources() {
        return repository.findAll();
    }

    public List<String> getMicroserviceResources() {
        return repository.findAll().stream()
                .filter(resource -> resource.getSkills().toLowerCase().contains("java") &&
                        resource.getSkills().toLowerCase().contains("redis") &&
                        resource.getSkills().toLowerCase().contains("javascript"))
                .map(Resource::getName)
                .collect(Collectors.toList());
    }

    public List<String> getCloudResources() {
        return repository.findAll().stream()
                .filter(resource -> resource.getSkills().toLowerCase().contains("mysql") &&
                        resource.getSkills().toLowerCase().contains("docker") ||
                        resource.getSkills().toLowerCase().contains("spring") &&
                        resource.getSkills().toLowerCase().contains("react") &&
                        resource.getExperience() < 10)
                .map(Resource::getName)
                .collect(Collectors.toList());
    }
}
