package de.jay8012.services;

import de.jay8012.exceptions.NotImplementedException;
import de.jay8012.utils.PropertiesUtils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;

public class TMDbApiService {
    private Properties properties;
    public TMDbApiService() {
        properties = PropertiesUtils.getProperties();
    }

    public String getMetadataForMovie(String movieName) throws IOException, InterruptedException {
        if (properties == null) {
            throw new NotImplementedException();
        }
        String baseurl = properties.getProperty("url");
        String apiKey = properties.getProperty("apiKey");
        System.out.println(baseurl);

        String url = baseurl +"/search/movie?api_key=" + apiKey + "&query=" + movieName.trim().replace(' ','+');
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();

    }
}
