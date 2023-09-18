package OOP_Java.Lesson6.srp2;

public class SaveFile {

    private static String path = "/Users/aleksr/Desktop/GB_OOP/src/OOP_Java/Lesson6/srp2/";

    public static String getPath() {
        return path;
    }

    public static void setPath(String path) {
        SaveFile.path = path;
    }

    public static String fileExtension(String fileName, String extension){
        return getPath() + fileName + "." + extension;
    }

}
