package co.zw.arfel.clothing.model;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * Created by ezinzombe on 7/13/17.
 */
public class UploadItem {

    private String filename;
    private CommonsMultipartFile fileData;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public CommonsMultipartFile getFileData() {
        return fileData;
    }

    public void setFileData(CommonsMultipartFile fileData) {
        this.fileData = fileData;
    }
}
