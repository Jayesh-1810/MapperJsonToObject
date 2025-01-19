package mapperexample;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToEmployeeMapper {

	public static void main(String[] args) {

		try {
			String jsonData = JsonDataProvider.JSON_DATA;

			ObjectMapper objectMapper = new ObjectMapper();

			Employee employee1 = objectMapper.readValue(jsonData, Employee.class);
			
			System.out.println(employee1);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
