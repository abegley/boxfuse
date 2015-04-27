package dwunikernel;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DwUnikernelApplication extends Application<DwUnikernelConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DwUnikernelApplication().run(args);
    }

    @Override
    public String getName() {
        return "DwUnikernel";
    }

    @Override
    public void initialize(final Bootstrap<DwUnikernelConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DwUnikernelConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}