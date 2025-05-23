
# Spring MongoDB Expense Tracker

A simple RESTful API built with Spring Boot and MongoDB to manage expenses, along with a minimal frontend (vanilla JS + HTML) to interact with the API.

---

## Features

* Create, read, update, and delete expense records
* Expenses have categories, unique names, and amounts
* MongoDB used as the database
* REST API endpoints with standard HTTP methods
* Simple frontend (no frameworks) to display and manage expenses
* CORS enabled to allow frontend-backend communication

---

## Technologies Used

* Java 17+
* Spring Boot
* Spring Data MongoDB
* MongoDB
* HTML, CSS, JavaScript (vanilla)

---

## Getting Started

### Prerequisites

* Java 17 or higher installed
* MongoDB installed and running locally or remotely
* Maven or Gradle for building the project

---

### Running the Backend

1. Clone the repository:

   ```bash
   git clone <your-repo-url>
   cd <repo-folder>
   ```

2. Configure MongoDB connection (if needed) in `application.properties` or `application.yml`.

3. Build and run Spring Boot application:

   ```bash
   ./mvnw spring-boot:run
   ```

   or

   ```bash
   ./gradlew bootRun
   ```

4. The backend server will start at `http://localhost:8080`.

---

### Running the Frontend

1. Move the frontend files (`index.html`, `script.js`, etc.) into:

   ```
   src/main/resources/static/
   ```

2. Access the frontend at:

   ```
   http://localhost:8080/index.html
   ```

---

## API Endpoints

| Method | Endpoint              | Description                |
| ------ | --------------------- | -------------------------- |
| POST   | `/api/expense/`       | Add a new expense          |
| PUT    | `/api/expense/`       | Update an existing expense |
| GET    | `/api/expense/`       | Get all expenses           |
| GET    | `/api/expense/{name}` | Get expense by name        |
| DELETE | `/api/expense/{id}`   | Delete expense by ID       |

---

## Example Expense JSON

```json
{
  "id": "string",
  "expenseName": "Groceries",
  "expenseCategory": "GROCERIES",
  "expenseAmount": 150.00
}
```

---

## Notes

* Ensure MongoDB is running and accessible by your application.
* CORS is enabled to allow API calls from frontend.
* Expense names are unique.
* The frontend uses relative API URLs, so backend and frontend must be served from the same origin or CORS enabled.

---

## License

MIT License

---

