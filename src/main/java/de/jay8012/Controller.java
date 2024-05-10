package de.jay8012;

import com.google.gson.Gson;
import de.jay8012.exceptions.NotImplementedException;
import de.jay8012.exceptions.UserInputException;
import de.jay8012.models.Args;
import de.jay8012.models.TMDBResponse;
import de.jay8012.services.TMDbApiService;

import java.io.IOException;

public class Controller {
    public static void start(String[] args) throws IOException, InterruptedException {
        Args arguments;
        try {
            arguments = new Args(args);
        } catch (UserInputException e) {
            System.out.println(e);
            throw new NotImplementedException();
        }

        if (!arguments.isFolder()) {

        } else {
            arguments.getFilePath();
        }
        String movie = new TMDbApiService().getMetadataForMovie("Dune: Part Two");
        Gson gson = new Gson();
        TMDBResponse response = gson.fromJson(movie, TMDBResponse.class);
        System.out.println("response.getResults().length = " + response.getResults().length);
        if (response.getTotal_results() == 1) {
            System.out.println("Result" + response.getResults()[0]);
        }
//        new TMDbApiService().getMetadataForMovie("Star Wars 2");
    }
}
