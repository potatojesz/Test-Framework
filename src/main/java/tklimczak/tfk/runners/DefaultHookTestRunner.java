package tklimczak.tfk.runners;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class DefaultHookTestRunner extends BlockJUnit4ClassRunner {
    public DefaultHookTestRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    @Override
    public void run(RunNotifier notifier) {
        List<Hook> hooks = this.getClass().getAnni
        super.run(notifier);
    }
}
