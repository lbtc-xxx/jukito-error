To run the test execute:

    mvn clean test

The test yields:

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running app.MyClientTest
Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 0.322 sec <<< FAILURE!
initializationError(app.MyClientTest)  Time elapsed: 0.008 sec  <<< ERROR!
java.lang.RuntimeException: com.google.inject.CreationException: Guice creation errors:

1) A binding to app.ThirdPartyService was already configured at org.jukito.JukitoModule.configure(JukitoModule.java:208).
  at app.ThirdPartyModule.configure(ThirdPartyModule.java:9)

1 error
	at org.jukito.JukitoRunner.computeTestMethods(JukitoRunner.java:245)
	at org.jukito.JukitoRunner.validateInstanceMethods(JukitoRunner.java:379)
	at org.junit.runners.BlockJUnit4ClassRunner.collectInitializationErrors(BlockJUnit4ClassRunner.java:104)
	at org.junit.runners.ParentRunner.validate(ParentRunner.java:355)
	at org.junit.runners.ParentRunner.<init>(ParentRunner.java:76)
	at org.junit.runners.BlockJUnit4ClassRunner.<init>(BlockJUnit4ClassRunner.java:57)
	at org.jukito.JukitoRunner.<init>(JukitoRunner.java:75)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.lang.reflect.Constructor.newInstance(Constructor.java:422)
	at org.junit.internal.builders.AnnotatedBuilder.buildRunner(AnnotatedBuilder.java:29)
	at org.junit.internal.builders.AnnotatedBuilder.runnerForClass(AnnotatedBuilder.java:21)
	at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:59)
	at org.junit.internal.builders.AllDefaultPossibilitiesBuilder.runnerForClass(AllDefaultPossibilitiesBuilder.java:26)
	at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:59)
	at org.junit.internal.requests.ClassRequest.getRunner(ClassRequest.java:26)
	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:250)
	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:141)
	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:112)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:497)
	at org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:189)
	at org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:165)
	at org.apache.maven.surefire.booter.ProviderFactory.invokeProvider(ProviderFactory.java:85)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:115)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:75)
Caused by: com.google.inject.CreationException: Guice creation errors:

1) A binding to app.ThirdPartyService was already configured at org.jukito.JukitoModule.configure(JukitoModule.java:208).
  at app.ThirdPartyModule.configure(ThirdPartyModule.java:9)

1 error
	at com.google.inject.internal.Errors.throwCreationExceptionIfErrorsExist(Errors.java:435)
	at com.google.inject.internal.InternalInjectorCreator.initializeStatically(InternalInjectorCreator.java:154)
	at com.google.inject.internal.InternalInjectorCreator.build(InternalInjectorCreator.java:106)
	at com.google.inject.Guice.createInjector(Guice.java:95)
	at com.google.inject.Guice.createInjector(Guice.java:72)
	at com.google.inject.Guice.createInjector(Guice.java:62)
	at org.jukito.JukitoRunner.createInjector(JukitoRunner.java:94)
	at org.jukito.JukitoRunner.ensureInjector(JukitoRunner.java:116)
	at org.jukito.JukitoRunner.computeTestMethods(JukitoRunner.java:243)
	... 28 more
```