package FileIoSample;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class FileReadSample {
    public List<String[]> FileRead(Path path, Charset charset, String delimiter) throws IOException{
        try (Reader reader = Files.newBufferedReader(path, charset)) {
            CSVFormat format = CSVFormat.DEFAULT.builder()
                .setDelimiter(delimiter.charAt(0))
                .setTrim(true)
                .setIgnoreSurroundingSpaces(true)
                .setAllowMissingColumnNames(true)
                .build();
            try (CSVParser parser = format.parse(reader)) {
                List<String[]> content = new java.util.ArrayList<>();
                for (CSVRecord csvRecord : parser) {
                    String[] row = new String[csvRecord.size()];
                    for (int i = 0; i < csvRecord.size(); i++) {
                        row[i] = csvRecord.get(i);
                    }
                    content.add(row);
                }
                return content;
            }
        }
    }

    public List<String[]> FileRead_StreamVer(Path path, Charset charset, String delimiter) throws IOException{
        try (Reader reader = Files.newBufferedReader(path, charset)) {
            CSVFormat format = CSVFormat.DEFAULT.builder()
                .setDelimiter(delimiter.charAt(0))
                .setTrim(true)
                .setIgnoreSurroundingSpaces(true)
                .setAllowMissingColumnNames(true)
                .build();
            try (CSVParser parser = format.parse(reader)) {
                return StreamSupport.stream(parser.spliterator(), false)
                    .map(record ->
                        StreamSupport.stream(record.spliterator(), false)
                            .toArray(String[]::new)
                    )
                    .collect(Collectors.toList());
            }
        }
    }
}



// with系はdeprecateになった
// CSVFormat format = CSVFormat.DEFAULT
//     .withDelimiter(delimiter.charAt(0))
//     .withTrim()
//     .withIgnoreSurroundingSpaces()
//     .withAllowMissingColumnNames();
// よってbuilderを使う。