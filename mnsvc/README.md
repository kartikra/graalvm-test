## Micronaut 3.2.3 Documentation

- [User Guide](https://docs.micronaut.io/3.2.3/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.2.3/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.2.3/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

## Running micronaut

- Create a new project ```mn create-app mnsvc-raw --build maven```
- Create native image ```./mvnw package -Dpackaging=native-image ```
This creates an executable under target. Executable is unique for each OS

- Create a new project using graalvm
```mn create-app mnsvc-ntv --build maven --features graalvm ```

