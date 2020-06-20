package tklimczak.tfk.runners;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;
import tklimczak.tfk.hooks.Hook;
import tklimczak.tfk.utils.HookUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class DefaultHookTestRunner extends BlockJUnit4ClassRunner {
    public DefaultHookTestRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    @Override
    public void run(RunNotifier notifier) {
        try {
            List<Hook> hooks = HookUtils.getHooks();
            before(hooks);
            super.run(notifier);
            after(hooks);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    protected void after(List<Hook> hooks) {
        for(Hook hook : hooks) {
            hook.after();
        }
    }

    protected void before(List<Hook> hooks) {
        for(Hook hook : hooks) {
            hook.before();
        }
    }
}
