// 17)Write a program to print File Extension Type 

import java.util.Scanner;

public class FileExtension {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter file extension: ");
        String extension = scn.nextLine();

        switch (extension) {
            case ".jpg":
                System.out.println("Image");
                break;
            case ".mp4":
                System.out.println("Video");
                break;
            case ".txt":
                System.out.println("Text File");
                break;
            default:
                System.out.println("Unknown");
                break;
        }
        scn.close();
    }

}
