package com.theironyard.installparty;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class EventLogTest extends EventLog {

    Event event = new Event();

    @Before
    public void setUp() throws Exception {
        System.out.println("Setting up...");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Cleaning Up");
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void addEvent() throws Exception{
        System.out.println("Running Basic Test");
        event.name = "Donovan";
        event.action = "Run";

        assertTrue(EventLog.addEvent(event));

    }

    @Test
    public void nameNull() throws Exception {
        System.out.println("Running Basic Test");

        event.name = null;
        event.action = null;
        thrown.expect(IllegalArgumentException.class);
        assertFalse(EventLog.addEvent(event));


    }

    @Test
    public void faceToFace() {
        System.out.println("Running basic test");

        event.name = "Donovan";
        event.action = "Face2Face";

        assertTrue(EventLog.addEvent(event));
    }

    @Test
    public void phoneCall() {
        System.out.println("Running basic test");

        event.name = "Donovan";
        event.action = "PhoneCall";

        assertTrue(EventLog.addEvent(event));
    }

    @Test
    public void textMessaging() {
        System.out.println("Running basic test");

        event.name = "Donovan";
        event.action = "TextMessaging";

        assertTrue(EventLog.addEvent(event));
    }

    @Test
    public void unknown() {
        System.out.println("Running basic test");

        event.name = "Donovan";
        event.action = "Unknown";

        assertTrue(EventLog.addEvent(event));
    }

    @Test
    public void action2() throws Exception {
        System.out.println();

        event.name = "";
        event.action = "";
        thrown.expect(AssertionError.class);
        assertFalse(EventLog.addEvent(event));
    }
}