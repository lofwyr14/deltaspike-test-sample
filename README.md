# deltaspike-test-sample
Example of how to test a CDI application with DeltaSpikes CdiTestRunner.
It tests beans which are 
@RequestScoped, 
@SessionScoped or
@WindowScoped. 


Run the test with OpenEJB, OpenWebBeans or Weld:


```
mvn -Popenejb clean install
```
or
```
mvn -Popenwebbeans clean install
```
or
```
mvn -Pweld clean install
```

The tests works with Java 8 with all 3 implementations and OpenWebBeans and Weld
are working with all current Java versions:

|                    | Java 8 | Java 9 | Java 10 | Java 11 | Java 12 | Java 13 |
|--------------------|--------|--------|---------|---------|---------|---------|
| OpenEJB 7.0.2      |    ✓   |        |         |         |         |         |
| OpenWebBeans 1.7.6 |    ✓   |    ✓   |    ✓    |    ✓    |    ✓    |    ✓    |
| Weld 2.4.8.Final   |    ✓   |    ✓   |    ✓    |    ✓    |    ✓    |    ✓    |
