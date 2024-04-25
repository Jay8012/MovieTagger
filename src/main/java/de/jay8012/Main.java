package de.jay8012;

import de.jay8012.exceptions.NotImplementedException;
import de.jay8012.exceptions.UserInputException;
import de.jay8012.models.Args;

public class Main {
    public static void main(String[] args) {
        Args arg;
        try {
            arg = new Args(args);
        } catch (UserInputException e) {
            System.out.println(e);
            throw new NotImplementedException();
        }
        System.out.println("arg.toString() = " + arg.toString());
    }
}
