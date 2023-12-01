import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class SerializeDemo {

    public static void main(String[] args) {
        Student kasun = new Student(1, "Kasun", 100);
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("id", kasun.getId());
        builder.add("name", kasun.getName());
        builder.add("marks", kasun.getMarks());
        JsonObject json = builder.build();
        System.out.println(json.toString());
    }
}
