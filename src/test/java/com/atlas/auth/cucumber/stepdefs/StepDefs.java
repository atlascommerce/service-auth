package com.atlas.auth.cucumber.stepdefs;

import com.atlas.auth.AuthApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = AuthApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
