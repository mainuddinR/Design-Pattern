package ProxyL06;

import java.util.ArrayList;
import java.util.List;

public class ImageViewer {
    private List<Image> images = new ArrayList<>();

    public ImageViewer() {
        images.add(new ImageProxy("photo1.jpg"));
        images.add(new ImageProxy("photo2.jpg"));
        images.add(new ImageProxy("photo3.jpg"));
    }

    public void displayImage(int index) {
        if (index < images.size()) {
            Image image = images.get(index);
            System.out.println("Image selected: " + image.getFilename());
            image.display();
        } else {
            System.out.println("Image not found.");
        }
    }

    public void showImageList() {
        System.out.println("Available images:");
        for (int i = 0; i < images.size(); i++) {
            System.out.println((i + 1) + ". " + images.get(i).getFilename());
        }
    }

    public static void main(String[] args) {
        ImageViewer viewer = new ImageViewer();
        viewer.showImageList();

        viewer.displayImage(1);  // load second image
        viewer.displayImage(0);  // Load first image
    }
}
 