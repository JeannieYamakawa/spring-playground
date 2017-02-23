package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloControllerTest {
    @Autowired
    MockMvc mvc;

    @Test
    public void testHomepage(){
        RequestBuilder request = MockMvcRequestBuilders.get("/test/hello");
        this.mvc.perform(RequestBuilder request)
                .andExpect(status().isOk())
                .andExpect(content().string("Booyah. Hello World."));


    };
    @Test
    public void testHomepageGet(){
        RequestBuilder request = MockMvcRequestBuilders.post("/test/hello");
        this.mvc.perform(RequestBuilder request)
                .andExpect(status().isOk());

    };



};
