/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.File;

class Nodes{
    String playListName;
    File[] songPath;
    String [] songName;
    int songCount;
    Nodes nextNode;
    Nodes prevNode;
    
}


public class PlayList {
    int count=0;
    Nodes head=null;
    public void insertEnd( String playListName,File[] songPath, String[] songName,int songCount) {

        if (head == null) {
            Nodes newNode = new Nodes();
            newNode.songPath = songPath;
            newNode.songName=songName;
            newNode.playListName=playListName;
            newNode.songCount=songCount;
            head = newNode;
            count++;
        } else {
            Nodes currentNode = head;
            Nodes newNode = new Nodes();
            newNode.songPath = songPath;
            newNode.songName=songName;
            newNode.playListName=playListName;
            newNode.songCount=songCount;

            while (currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
                
            }
            currentNode.nextNode = newNode;
            newNode.prevNode=currentNode;
            count++;
        }

    }
     public void print() {
        if(head!=null){
            Nodes currentNode = head;
            while (currentNode.nextNode != null) {
                //System.out.println("Song List : " +songList. );
                //System.out.println("Play List :"+currentNode.playListName);
                currentNode = currentNode.nextNode;
            }
            for(int i=0;i<currentNode.songCount;i++){
                    System.out.println("Song List : " + currentNode.songName[i]);
            }
            
            System.out.println("Play List :"+currentNode.playListName);
        }else{
            System.out.println("No values in the list");
        }
    }

    public File[] getPlayListSongPaths(String playListName){
        File[] currentPlayListSongPaths=null;
        if(head!=null){
            Nodes currentNode=head;
            
            while(currentNode.nextNode!=null){
               
                if(currentNode.playListName.equals(playListName)){
                     System.out.println("Done");
                    currentPlayListSongPaths=currentNode.songPath;
                    break;
                }
                currentNode=currentNode.nextNode;
            }currentPlayListSongPaths=currentNode.songPath;
            
        }else{
            System.out.println("No Elemtns");
        }
        return currentPlayListSongPaths;
    }
    public String[] getPlayListSongNames(String playListName){
        String[] songNames=null;
        if(head!=null){
            Nodes currentNode=head;
            
            while(currentNode.nextNode!=null){
               
                if(currentNode.playListName.equals(playListName)){
                     System.out.println("Done");
                    songNames=currentNode.songName;
                    break;
                }
                currentNode=currentNode.nextNode;
            }songNames=currentNode.songName;
            
        }
        return songNames;
    }
    
    //get all playList names for combobox
    public String[] getAllPlayListNames(){
        int run=0;
        String[] playListNames=new String[count];
        if(head!=null){
            Nodes currentNode=head;
            
            while(currentNode.nextNode!=null){
                
                if(run!=count){
                    playListNames[run]=currentNode.playListName;
                    run++;
                }
                currentNode=currentNode.nextNode;
            }
            //System.out.println("Done");
            
            playListNames[count-1]=currentNode.playListName;
            //System.out.println(playListNames[0]);
            
        }else{
            System.err.println("Play List Empty");
        }
        return playListNames;
    }
    public int updatePlayList(String playListName,File[] songPath, String[] songName){
        int taskDone=0;
        Nodes selectedNode=null;
        if(head!=null){
            Nodes currentNode=head;
            while(head.nextNode!=null){
                if(currentNode.playListName.equals(playListName)){
                    selectedNode=currentNode;
                    selectedNode.songPath=songPath;
                    selectedNode.songName=songName;
                    taskDone=1;
                    break;
                }
                currentNode=currentNode.nextNode;
            }
        }
        return taskDone;
    }
}
