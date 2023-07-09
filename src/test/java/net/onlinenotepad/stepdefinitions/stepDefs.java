package net.onlinenotepad.stepdefinitions;


import cucumber.api.java.Before;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class stepDefs {

      public static Actor UserWeb;



    @Before
    public void prepareStage() {

        UserWeb = Actor.named("The user");
        OnStage.setTheStage(new OnlineCast());
    }





}
