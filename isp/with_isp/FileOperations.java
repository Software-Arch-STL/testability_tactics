public interface FileReader {
    byte[] readFile(String path);
}

public interface FileWriter {
    void writeFile(String path, byte[] contents);
}

// Additional interfaces for other responsibilities
