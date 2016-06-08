package mazur.goit.module3.fileSystem;

import java.util.List;

/**
 * Created by pan on 08.06.16.
 */
public class Folder {
    List<File> fileList;
    List<Folder> folderList;

    public List<File> getFileList(){
        return fileList;
    }

    public List<Folder> getFolderList(){
        return folderList;
    }
    public boolean addFile(File file){
        return fileList.add(file);
    }
    public boolean removeFile(File file){
        return fileList.remove(file);
    }
}
