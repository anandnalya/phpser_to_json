import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.util.Scanner;


public class PHPSerToJSON  {

  private final ObjectMapper mapper = new ObjectMapper();

  public void PHPSerToJSON() {
    mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
  }

  public String evaluate(String phpSerailzedString) throws JsonProcessingException {
    if (phpSerailzedString.trim().length() == 0) {
      return "";
    }

    Object result = new SerializedPhpParser(phpSerailzedString).parse();
    System.out.println(result);

    return mapper.writeValueAsString(result);
  }

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(new File("/Users/anandnalya/Downloads/query-hive-90358.csv"));

    while (scanner.hasNextLine()) {
      String agent = scanner.nextLine();
      agent = agent.substring(1, agent.length() - 1).replaceAll("\"\"", "\"");
      System.out.println(agent + "\n");
      new PHPSerToJSON().evaluate(agent);
    }
  }
}
