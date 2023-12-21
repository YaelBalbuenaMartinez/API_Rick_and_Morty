package com.RM.APIR.M.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RMService {
    private final String apiUrl = "https://rickandmortyapi.com/api/";

    private final RestTemplate restTemplate;

    public RMService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getCharacterById(int id) {
        String characterUrl = apiUrl + "character/" + id;
        return restTemplate.getForObject(characterUrl, String.class);
    }
}
