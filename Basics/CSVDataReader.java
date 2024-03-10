import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVDataReader {
    public static void main(String[] args) {
        String fileName = "data.csv";
        String columnName = "value";
        try {
            double average = calculateColumnAverage(fileName, columnName);
            System.out.println("Average " + columnName + ": " + average);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static double calculateColumnAverage(String fileName, String columnName) throws IOException {
        BufferedReader reader = null;
        double sum = 0;
        int count = 0;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            String[] headers = reader.readLine().split(",");
            int columnIndex = -1;
            for (int i = 0; i < headers.length; i++) {
                if (headers[i].equalsIgnoreCase(columnName)) {
                    columnIndex = i;
                    break;
                }
            }
            if (columnIndex == -1) {
                throw new IOException("Column '" + columnName + "' not found in CSV file.");
            }
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length > columnIndex && values[columnIndex].matches("\\d+")) {
                    sum += Double.parseDouble(values[columnIndex]);
                    count++;
                }
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        if (count == 0) {
            throw new IOException("No numeric values found in column '" + columnName + "'.");
        }
        return sum / count;
    }
}
