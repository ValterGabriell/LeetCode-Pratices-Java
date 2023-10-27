package org.example.leetcode.LinkedList;

public class RemoveDuplicateds {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;

        while(list != null) {
            //se o proximo for igual a nulo, estamos no ultimo
            if (list.next == null) {
                break;
            }
            // caso nao seja, verificamos se o valor atual é igual ao proximo
            if (list.val == list.next.val) {
                //se for, a gente faz com que o atual receba o que vem depois do proximo
                list.next = list.next.next;
            } else {
                // caso nao, o no que a gente vai verificar recebe a proxima
                list = list.next;
            }
        }

        return head;
    }


}
