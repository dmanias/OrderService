# OrderService

### Testing
## Unit Tests

The OrderService has unit tests for the key classes such as OrderService, OrderController, and OrderRepository. These tests are written using the JUnit 5 framework and Mockito for mocking dependencies.

Unit tests focus on small, isolated parts of the application's logic. For instance, the OrderServiceTest tests the methods in the OrderService class by mocking its dependencies.

To run the unit tests, you can execute the following command in your terminal:

```bash
mvn test
```
You can find the unit tests in the src/test/java/gr/dmanias/OrderService/service and src/test/java/gr/dmanias/OrderService/controller directories.

## Integration Tests

The integration tests for the OrderService are written using Spring Boot's MockMvc, allowing dispatching requests to the controllers in a test environment without starting a full HTTP server.

Additionally, the tests make use of WireMock to mock external HTTP-based services. This is particularly important for the OrderService which interacts with ProductService and PaymentService via HTTP calls.

The integration tests cover scenarios such as successfully placing an order, getting a 403 Forbidden response when placing an order with wrong access, fetching an order successfully, and getting a 404 Not Found response when trying to fetch a non-existing order.

To run the integration tests, you can execute the following command in your terminal:

```bash
mvn test -Dtest=OrderControllerTest
```
You can find the integration tests in the src/test/java/gr/dmanias/OrderService/controller/OrderControllerTest.java directory.
