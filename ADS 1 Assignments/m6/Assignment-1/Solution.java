import java.util.Scanner;

class Node {
   String number;
    Node address;
    Node(String number1) {
        this.number = number1;

    }
    Node() {

    }
    public String getNumber() {
        return this.number;
    }
    public Node getAddress() {
        return this.address;
    }
    public void setAddress(Node address1) {
        this.address = address1;
    }
}
class LinkedList {
    int size = 0;
    Node head;
    Node tail;
    public void addStart(String item) {
        if (size == 0) {
            head = new Node(item);
            head.address = null;
            tail = head;
            size++;
            return;
        }
        Node temp = new Node(item);
        temp.address = head;
        head = temp;
        size++;
    }
}

class AddLargeNumbers {
    
    public static LinkedList numberToDigits(String number) {
        Node head = new Node(number);
        Node temp = new Node(number);
        LinkedList object = new LinkedList();
        object.getAddress(head);
        while(object.number!=number) {
            object = object.getAddress();
        }
        temp.address = object.address;
        object.address = temp;

        

    }

    public static String digitsToNumber(LinkedList list) {

         

    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
        int ans;
        String p;
        String q;
         list1 = p.length;
          list2 = q.length;        
        for (int i = list1 ; i >= 0; i--) {
            pDigits.add(p.charAt(i) - '0');
        }
        for (int i = list2 ; i >= 0; i--){
            qDigits.add(q.charAt(i) - '0');
        }

 
        int carry = 0;
        for (int i = 0; i < len; i++)
        {
            int d1 = 0, d2 = 0;            
            try {
                d1 = p.getAddress(Integer.parseInt(i));
            } 
            catch(Exception e){}            
            try {
                d2 = q.getAddress(Integer.parseInt(i));
            } 
            catch(Exception e){}                        
            int x = d1 + d2 + carry;
            ans.add(x % 10);
            carry = x / 10;
        }
        /* Adding carry */
        while (carry != 0)
        {
            ans.add(carry % 10);
            carry /= 10;
        }
        /* Printing ans list */
        System.out.print("\nSum = ");
        for (int i = ans.size() - 1; i >= 0; i--) {
            System.out.print(ans.getAddress(i));
        }
        System.out.println();        
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                 pDigits = AddLargeNumbers.numberToDigits(p);
                 qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
