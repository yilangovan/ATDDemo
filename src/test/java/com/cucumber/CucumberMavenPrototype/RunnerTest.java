package com.cucumber.CucumberMavenPrototype;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features = {"src/test/resource/features"}
		)
public class RunnerTest {

}
