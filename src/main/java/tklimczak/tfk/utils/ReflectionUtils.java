package tklimczak.tfk.utils;

import org.atteo.classindex.ClassIndex;

import java.lang.annotation.Annotation;

public class ReflectionUtils {
    private ReflectionUtils() {}

    public static Iterable<Class<?>> getClasses(Class<? extends Annotation> annotation) {
        return ClassIndex.getAnnotated(annotation);
    }
}
