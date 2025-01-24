/*
 *  Copyright (c) 2024 Piyush Kumar
 *  All Rights Reserved Worldwide.
 */
package org.example.cucumber;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

/**
 * @author Piyush Kumar.
 * @since 24/01/25.
 */

public class RunCucumberTagTest {

    @Suite
    @IncludeEngines("cucumber")
//    @SelectClasspathResource("features")
    @SelectClasspathResource("features/4_tags_example.feature") // we can also give specific file as well.
    @ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
    @ConfigurationParameter(key = "cucumber.filter.tags", value = "@All")
    public static class RunFeatureLevelAllTagTest{

    }

    @Suite
    @IncludeEngines("cucumber")
    @SelectClasspathResource("features/4_tags_example.feature")
    @ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
    @ConfigurationParameter(key = "cucumber.filter.tags", value = "@Smoke")
    public static class RunSmokeTagTest{

    }

    @Suite
    @IncludeEngines("cucumber")
    @SelectClasspathResource("features/4_tags_example.feature")
    @ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
    @ConfigurationParameter(key = "cucumber.filter.tags", value = "@Regression")
    public static class RunRegressionTagTest{

    }

    @Suite
    @IncludeEngines("cucumber")
    @SelectClasspathResource("features/4_tags_example.feature")
    @ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
    @ConfigurationParameter(key = "cucumber.filter.tags", value = "@Regression or @Smoke")
    public static class RunOrTagTest{

    }

    @Suite
    @IncludeEngines("cucumber")
    @SelectClasspathResource("features/4_tags_example.feature")
    @ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
    @ConfigurationParameter(key = "cucumber.filter.tags", value = "@Regression and @Smoke")
    public static class RunAndTagTest{

    }

    @Suite
    @IncludeEngines("cucumber")
    @SelectClasspathResource("features/4_tags_example.feature")
    @ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
    @ConfigurationParameter(key = "cucumber.filter.tags", value = "not @Regression") // except @Regression scenarios and run all other. It can be used to disable test.
    public static class RunNotTagTest{

    }
}
