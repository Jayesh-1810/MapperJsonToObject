package mapperexample;

public class JsonDataProvider{
	
      public static final String JSON_DATA = """
        {
          "employeeId": 101,
          "firstName": "John",
          "lastName": "Doe",
          "email": "john.doe@example.com",
          "phoneNumber": "+1234567890",
          "hireDate": "2022-05-01",
          "jobTitle": "Software Engineer",
          "department": "IT",
          "salary": 75000,
          "address": {
            "street": "123 Main St",
            "city": "New York",
            "state": "NY",
            "zipCode": "10001"
          },
          "skills": ["Java", "Spring Boot", "Hibernate", "SQL"],
          "manager": {
            "managerId": 102,
            "firstName": "Jane",
            "lastName": "Smith",
            "email": "jane.smith@example.com"
          }
        }
        """;

    
}

