package com.qa.test;

import com.qa.main.Constant;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = Constant.FEATURE_PATH)

public class Runner {

}
