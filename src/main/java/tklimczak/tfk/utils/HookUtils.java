package tklimczak.tfk.utils;

import tklimczak.tfk.hooks.Hook;
import tklimczak.tfk.hooks.InjectHook;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HookUtils {
    private HookUtils() {}

    public static List<Hook> getHooks() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        final Iterable<Class<?>> classes = ReflectionUtils.getClasses(InjectHook.class);
        final List<Hook> result = new ArrayList<>();

        for (final Class<?> clazz : classes) {
            final Constructor<?> namedConstructor = clazz.getConstructor();
            Logger.getGlobal().log(Level.INFO, clazz.getSimpleName() + " added to scope.");
            result.add((Hook)namedConstructor.newInstance());
        }

        return result;
    }
}
