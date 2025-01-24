/*
 *  Copyright (c) 2024 Piyush Kumar
 *  All Rights Reserved Worldwide.
 */
package org.example.cucumber;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

/**
 * @author Piyush Kumar.
 * @since 24/01/25.
 */

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME,
    value = "pretty,html:build/cucumber-reports/report.html, " +
        "json:build/cucumber-reports/report.json, junit:build/cucumber-reports/report.xml")
//@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "org.example.cucumber.stepdefinitions") // This is optional to provide. It glues the feature files with their step definitions, which cucumber junit platform autodiscovers.
//@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "org.example.cucumber") // You can provide this way too since cucumber junit platform recursively checks all sub-directories.
//@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "org.example") // You can provide this way too since cucumber junit platform recursively checks all sub-directories.
public class RunCucumberTest {
}
