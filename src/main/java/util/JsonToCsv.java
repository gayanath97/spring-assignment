package util;

import java.io.File;
import java.io.IOException;

public class JsonToCsv {

    public static void JsonToCsv(File jsonFile, File csvFile) throws IOException {
        JsonNode jsonTree = new ObjectMapper().readTree(jsonFile);

        Builder csvSchemaBuilder = CsvSchema.builder();
        JsonNode firstObject = jsonTree.elements().next();
        firstObject.fieldNames().forEachRemaining(fieldName -> {csvSchemaBuilder.addColumn(fieldName);} );
        CsvSchema csvSchema = csvSchemaBuilder
                .build()
                .withHeader();

        CsvMapper csvMapper = new CsvMapper();
        csvMapper.writerFor(JsonNode.class)
                .with(csvSchema)
                .writeValue(csvFile, jsonTree);
    }


}
