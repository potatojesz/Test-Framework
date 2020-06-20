package tklimczak.tfk.hooks;

import org.atteo.classindex.IndexAnnotated;

/** Basic annotation used for classes which are able to run before and after each test */
@IndexAnnotated
public @interface InjectHook {
    int order = 1000;
}
