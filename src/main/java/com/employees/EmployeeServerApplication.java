package com.employees;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class EmployeeServerApplication extends Application<EmployeeServerConfiguration> {

    public static void main(final String[] args) throws Exception {
        new EmployeeServerApplication().run(args);
    }

    @Override
    public String getName() {
        return "EmployeeServer";
    }

    @Override
    public void initialize(final Bootstrap<EmployeeServerConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final EmployeeServerConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
