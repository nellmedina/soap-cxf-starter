# soap-cxf-starter

This is using Apache CXF 3.5.9 that supports JDK 8 and Spring Framework 5.3.x.

## Tech Stack

- Apache CXF 3.5.x
- Spring Framework 5.3.x
- JDK 8
- SLF4J
- Legacy web.xml

## wsdl2java

```bash
mvn -Pcodegen generate-resources

# then copy generate classes in src/java folder
```

## build

```
mvn clean install
```