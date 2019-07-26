package com.example.Notes.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringRunner.class)//this tells JUnit to run using Spring's testing support. spring runner is the new name for springjunit4classrunner
@SpringBootTest// is saying bootstrap with Springboots support- load application properties and give all te springboot goodies
@WebAppConfiguration// a class-level annotation that is used to declare that the applicationcontext loaded for an integration test shod be a webapplicationcontext
@AutoConfigureMockMvc// annotation that can be applied to a test class to enable and configure auto-configuration of mockmvc
public class NoteControllerTest {
@Autowired
private WebApplicationContext ctx;
// interface to provide configuration for a web application. This is read-only while
    //while the application is running but may be reloaded if
    //the implementation supports this

@Autowired
private MockMvc pract;
// main entry point for server-side Spring MVC test support

    @Before
    public void setUp() throws Exception {
        pract= MockMvcBuilders.webAppContextSetup(ctx).build();
    }

    @Test
    public void getNotes() throws Exception{//set up the configuration in our mockmvc needs to be done before we run any of our tests
        pract.perform(get("/"))//this is using hte mockmvc object to perform the get call on our url/ which is out home URL and its saying that we should expect that to return and it's Okay value
                .andExpect(status().isOk())
                .andExpect(view().name("note"));// make sure that the proper view is being returned

    }

    @Test
    public void getNewNote() throws Exception {
        pract.perform(get("/note/new"))
                .andExpect(status().isOk())
                .andExpect(view().name("note/new"));
    }

    @Test
    public void postNewNote() {
    }

    @Test
    public void editNote() {
    }

    @Test
    public void deleteNote() {
    }
}