import java.io.File;

public class Main {

    public static void main(String[] args) {
        String path = "C:\\Users\\Eric\\Google Drive\\Series\\Game of Thrones\\Game of Thrones Season 6 S06 Complete 1080p WEB DL x265 HEVC SUJAIDR";
        File folder = new File(path);
        File[] fileList = folder.listFiles();
        for (File file: fileList) {
            if (!file.isDirectory()) {
                String fileName = file.getAbsolutePath();
                String folderName = fileName.substring(0, fileName.length() - 4);
                File newFolder = new File(folderName);
                newFolder.mkdir();
                file.renameTo(new File(newFolder.getAbsolutePath() + "\\" + file.getName()));
            }
        }
    }
}
