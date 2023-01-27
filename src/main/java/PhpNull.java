import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = PhpNullSerializer.class)
public class PhpNull {
    @Override
    public String toString() {
        return "NULL";
    }
}
