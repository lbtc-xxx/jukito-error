package app;

import com.google.inject.AbstractModule;
import com.google.inject.PrivateModule;

import java.lang.annotation.Annotation;

public class MyModule extends AbstractModule {

    @Override
    protected void configure() {
        install(new MyPrivateModule(MyAnnotation1.class) {
            @Override
            protected void doConfigure() {
                bindAndExposeConcreteClass(MyClient2.class);
            }
        });
        install(new MyPrivateModule(MyAnnotation2.class) {
            @Override
            protected void doConfigure() {
            }
        });
    }

    private abstract static class MyPrivateModule extends PrivateModule {

        private final Class<? extends Annotation> annotationClass;

        private MyPrivateModule(final Class<? extends Annotation> annotationClass) {
            this.annotationClass = annotationClass;
        }

        @Override
        protected void configure() {
            install(new MyService1Module());
            bindAndExposeWithAnnotation(MyService.class);
            doConfigure();
        }

        abstract protected void doConfigure();

        protected void bindAndExposeConcreteClass(final Class<?>... classes) {
            for (final Class<?> klass : classes) {
                bindAndExposeConcreteClass(klass);
            }
        }

        private void bindAndExposeConcreteClass(final Class<?> klass) {
            // http://stackoverflow.com/questions/8486437/guice-beginner-how-to-bind-concrete-classes
            bind(klass);
            expose(klass);
        }

        private <T> void bindAndExposeWithAnnotation(final Class<T> klass) {
            bind(klass).annotatedWith(annotationClass).toProvider(binder().getProvider(klass));
            expose(klass).annotatedWith(annotationClass);
        }
    }
}
