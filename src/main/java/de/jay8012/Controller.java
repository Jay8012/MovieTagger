package de.jay8012;

import de.jay8012.exceptions.NotImplementedException;
import de.jay8012.exceptions.UserInputException;
import de.jay8012.models.Args;
import de.jay8012.services.TMDbApiService;

import java.io.IOException;

public class Controller {
    public static void start(String[] args) throws IOException, InterruptedException {
        Args arg;
        try {
            arg = new Args(args);
        } catch (UserInputException e) {
            System.out.println(e);
            throw new NotImplementedException();
        }

        new TMDbApiService().getMetadataForMovie("Star Wars 1");
        new TMDbApiService().getMetadataForMovie("Star Wars 2");
    }
}
