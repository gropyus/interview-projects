# TaxCalculator - Kotlin

A service that can perform various tax calculations for a store.

## Running tests

```bash
./mvnw verify
```

## Running the service

```bash
# start the server
./mvnw spring-boot:run

# interact - get the list of supported states
curl localhost:8080/states
# interact - define the tax amount per state
curl -X POST -H 'Content-Type: application/json' -d '0.08' localhost:8080/states/UT/tax
```