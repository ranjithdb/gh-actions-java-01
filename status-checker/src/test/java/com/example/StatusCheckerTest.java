package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;

public class StatusCheckerTest {
    @Test
    void testValidUrl() throws IOException {
        int statusCode = StatusChecker.getStatusCode("https://www.google.com");
        assertTrue(statusCode >= 200 && statusCode < 400, "Expected a successful status code");
    }

    @Test
    void testInvalidUrl() {
        assertThrows(IOException.class, () -> StatusChecker.getStatusCode("https://invalid.url.that.does.not.exist"));
    }
}
