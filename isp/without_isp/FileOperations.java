public interface FileOperations {
    byte[] readFile(String path);
    void writeFile(String path, byte[] contents);
    boolean deleteFile(String path);
    List<String> listFiles(String directory);
    FileMetadata getMetadata(String path);
}
