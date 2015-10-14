package domain;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * @author Koloturka
 * @version 19.08.2015 19:29
 */
public class RoleSerializer extends JsonSerializer<Role> {

	@Override
	public void serialize(Role role, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
		jsonGenerator.writeString(role.toValue().toUpperCase());
	}
}
