/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01;

/**
 *
 * @author This PC
 */
class node{
    int data;
    node next;
    public node(int x){
        data=x;
        next= null;
    }
    
    public String toString(){
        return data+"";
    }
}

class list{
    node head, tail;
    public list(){
        head= tail=null;
    }
    
    public boolean empty(){
        return head==null;        
    }
    
    public void add_tail(int x){
//        node t= new node(x);
//        if(empty()) head=t;
//        else tail.next= t;
//        tail= t;
            add_after(new node(x), tail);
    }
    
    public void add_head(int x){
//        node t= new node(x);
//        t.next= head;
//        head= t;
//        if(tail == null) tail = t;
          add_after(new node(x), null);
    }
    
    void add_after(node t, node pred){
        
        if(pred==null){
            t.next= head;
            head= t;
        }else{
            t.next= pred.next;
            pred.next= t;
            //if(pred == tail ) tail =t;
        }
        if(pred == tail ) tail =t;
    }
    //chen node vao sau vi tri thu k;
    public void add_after_index(int x, int k){
        node[] res= search(k);
        add_after(new node(x), res[0]);
    }
    public node[] search(int k){
        int i=0; node t= head, pred= null;
        while(i < k && t!=null){
            i++;
            pred=t;
            t= t.next;
            
        }
        return  new node[]{t, pred};
    }
    
    public String toString(){
        String s="";
        for(node t= head; t!=null; t= t.next)
            s+= t + "-";
        return s;
    }
    
    
}
public class Main {

    
    public static void main(String[] args) {
        list L= new list();
        L.add_tail(5);
        L.add_tail(2);
        L.add_tail(3);
        L.add_tail(6);
        L.add_head(0);
        System.out.println("The list: "+L);
        
    }
    
}
