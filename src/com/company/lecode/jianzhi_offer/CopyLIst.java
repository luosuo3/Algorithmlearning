package com.company.lecode.jianzhi_offer;

import jdk.internal.org.objectweb.asm.util.CheckAnnotationAdapter;
import org.w3c.dom.Node;

class CopyLIst {
    public Node copyRandomList(Node head) {
        Node cur = head;
        Node dum = new Node(0), pre = dum;
        while(cur != null) {
            Node node = new Node(cur.val); // 复制节点 cur
            pre.next = node;               // 新链表的 前驱节点 -> 当前节点
            // pre.random = "???";         // 新链表的 「 前驱节点 -> 当前节点 」 无法确定
            cur = cur.next;                // 遍历下一节点
            pre = node;                    // 保存当前新节点
        }
        return dum.next;
    }
    public Node copy(Node node) {
        Node cur = node;
        Node dum = new Node(0), pre = dum;
        while (cur != null) {
            Node nodeCur = new Node(cur.val);
            pre.next = nodeCur;
            cur = cur.next;
            pre = nodeCur;
        }
        return dum.next;
    }
    class Node {
        int val;
        Node next, random;
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}