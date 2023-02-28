package functions.tryyourself;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.Collections;

/*
Using a boolean value as a method parameter helps you loudly to proclaim that the method does more than one thing
Please fix it to do one thing per function
 */
public class Logbook {

    static final Path CAPTAIN_LOG = Paths.get("/var/log/captain.log");
    static final Path CREW_LOG = Paths.get("/var/log/crew.log");

//    public void log(String message, boolean classified) throws IOException {
//        if (classified) {
//            writeMessage(message, CAPTAIN_LOG);
//        } else {
//            writeMessage(message, CREW_LOG);
//        }
//    }
//
//    public void writeMessage(String message, Path location) throws IOException {
//        String entry = LocalDate.now() + " " + message;
//        Files.write(location, Collections.singleton(entry),
//                StandardCharsets.UTF_8, StandardOpenOption.APPEND);
//    }

    void writeToCaptainLog(String message) throws IOException {
        writeMessage(message, CAPTAIN_LOG);
    }

    void writeToCrewLog(String message) throws IOException {
        writeMessage(message, CREW_LOG);
    }

    void writeMessage(String message, Path location) throws IOException {
        String entry = LocalDate.now() + " " + message;
        Files.write(location, Collections.singleton(entry),
                StandardCharsets.UTF_8, StandardOpenOption.APPEND);
    }
}


