/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.io.File;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Goutam
 */
public class FreeDiskAvailable {
    public static void main(String args[]){
        FreeDiskAvailable fda = new FreeDiskAvailable();
        fda.freeDisk();
        fda.DriveNames();
        fda.DriveType();
    }
    
    private void freeDisk(){
        File file = new File("C:\\");
        double size = file.getFreeSpace()/(1024*1024*1024); //getUsableSpace, getTotalSpace
        System.out.println("Free Space in C Drive: "+size+" GB");
    }
    
    private void DriveNames(){
        File Drives[] = File.listRoots();
        if(Drives != null & Drives.length>0){
            System.out.println("All the Drive Names:");
            for(File Drive: Drives){
                System.out.println(Drive);
            }
        }
    }
    
    private void DriveType(){
        FileSystemView fsv = FileSystemView.getFileSystemView();
        File drive = new File("C:\\");
        System.out.println("Type of C Drive is "+fsv.getSystemDisplayName(drive));
    }
}
