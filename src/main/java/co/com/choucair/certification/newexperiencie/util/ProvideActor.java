package co.com.choucair.certification.newexperiencie.util;


import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ProvideActor {
    @Before
    public void SetUp(){
        OnStage.setTheStage(new OnlineCast());
    }

}
