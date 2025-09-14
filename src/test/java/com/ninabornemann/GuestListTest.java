package com.ninabornemann;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GuestListTest {

    @Test
    void shouldBeEmptyInitially() {
        GuestList guestList = new GuestList();
        guestList.setGuests(new ArrayList<String>());
        assertEquals(0, guestList.getGuests().size());
    }

    @Test
    void shouldReadSameGuestsAsWrittenBefore() {
        GuestList guestList = new GuestList();
        guestList.setGuests(List.of("Karl", "Ute"));
        assertEquals("[Karl, Ute]", guestList.getGuests().toString());
    }


    @Test
    void shouldWriteFile() throws IOException {
        Path path = Path.of("guests.txt");
        List<String> guests = List.of("Theodore", "Anette");
        Files.write(path, guests);
        List<String> readGuests = Files.readAllLines(path);
        String guestFromFile = readGuests.stream()
                .reduce("", (a, b) -> {
                    if (a.isEmpty()) {
                        return a + b;
                    } else {
                        return a + ", " + b;
                    }
                });

        assertEquals("Theodore, Anette", guestFromFile);
    }

    @Test
    void shouldReadFromFileSystem() throws IOException {
        GuestList guests = new GuestList();
        guests.setGuests(Files.readAllLines(Path.of("guests_for_read_test.txt")));
        assertEquals("[Max, Stephan]", guests.getGuests().toString());
    }

}