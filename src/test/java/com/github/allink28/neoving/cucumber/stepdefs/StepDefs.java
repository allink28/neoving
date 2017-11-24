package com.github.allink28.neoving.cucumber.stepdefs;

import com.github.allink28.neoving.NeovingApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = NeovingApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
