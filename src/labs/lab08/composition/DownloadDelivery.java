package labs.lab08.composition;

public class DownloadDelivery extends DeliveryMethod {
    private final String downloadFile;

    public DownloadDelivery(String downloadFile) {
        if (downloadFile == null || downloadFile.isBlank()) {
            throw new IllegalArgumentException("downloadFile cannot be null or blank");
        }

        this.downloadFile = downloadFile;
    }

    @Override
    public String instructions() {

        return "Download " + downloadFile;
    }
}