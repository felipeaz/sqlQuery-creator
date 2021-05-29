import org.json.simple.JSONObject;

public class Main {
    public static void main(String[] args) throws Exception {
        JsonReaderService jsonReaderService = new JsonReaderService("src/query.json");
        JSONObject jsonContent = jsonReaderService.getContent();

        QueryService queryService = new QueryService(jsonContent);
        Query query = queryService.BuildQuery();
    }
}
