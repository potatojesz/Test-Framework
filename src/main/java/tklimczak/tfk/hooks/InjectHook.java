package tklimczak.tfk.hooks;

/** Basic annotation used for classes which are able to run before and after each test */
public @interface InjectHook {
    int order = 1000;
}
