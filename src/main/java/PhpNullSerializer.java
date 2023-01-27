import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class PhpNullSerializer extends StdSerializer<PhpNull> {

    protected PhpNullSerializer() {
        super(PhpNull.class);
    }

    public void serialize(
            PhpNull value, JsonGenerator jgen, SerializerProvider provider)
            throws IOException {
        jgen.writeNull();
    }
}
