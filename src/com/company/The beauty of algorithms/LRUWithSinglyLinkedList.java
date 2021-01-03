
/**
 * @author LOGI
 * @version 1.0
 * @date 2019/7/9 18:02
 */

/**
 * 维护一个有序单链表，规定越靠近表尾的结点是越早访问的。当访问新页面 get(key) 时，从表头遍历链表，
 * 如果该页面已存在，则将其从原来位置删除，然后插入到表头。加载页面 put(key,value) 时，若该页面不存在且链表未满
 * ，则将页面插入表头。否则，删除表尾结点，再将新页面插入表头。
 */

/**
 * 存储密度：2/3
 *
 * 空间复杂度：O(1)
 *
 * 时间复杂度：遍历链表 O(n)，插入删除 O(1)，因此总的时间复杂度 O(n
 */
public class LRUWithSinglyLinkedList {
    LRUNode head;
    int capacity;
    int size;

    public LRUWithSinglyLinkedList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.head = new LRUNode();
    }

    public static void main(String[] args) {
        LRUWithSinglyLinkedList lru = new LRUWithSinglyLinkedList(2);
        lru.put(1, 1);
        System.out.println(lru + ", after put(1,1)");
        lru.put(2, 2);
        System.out.println(lru + ", after put(2,2)");
        lru.get(1);
        System.out.println(lru + ", after get(1)");
        lru.put(3, 3);
        System.out.println(lru + ", after put(3,3)");
        lru.get(2);
        System.out.println(lru + ", after get(2)");
        lru.put(4, 4);
        System.out.println(lru + ", after put(4,4)");
        lru.get(1);
        System.out.println(lru + ", after get(1)");
        lru.get(3);
        System.out.println(lru + ", after get(3)");
        lru.get(4);
        System.out.println(lru + ", after get(4)");
    }

    @Override
    public String toString() {
        LRUNode current = this.head.next;
        StringBuilder list = new StringBuilder();
        while (current != null) {
            list.append(current.value);
            if (current.next != null) {
                list.append("->");
            }
            current = current.next;
        }
        return list.toString();
    }

    /**
     * 根据 key 查找 value，如果已存在将其移至表头并返回，否则返回 -1
     *
     * @param key
     * @return
     */
    public int get(int key) {
        LRUNode prev = this.getPrev(key);
        if (prev != null) {
            LRUNode current = prev.next;
            this.delete(prev);
            this.insert(current);
            return current.value;
        } else {
            return -1;
        }
    }

    /**
     * 加载页面，如果缓存已满，删掉表尾
     *
     * @param key
     * @param value
     */
    public void put(int key, int value) {
        LRUNode current = new LRUNode(key, value);
        LRUNode prev = this.getPrev(key);
        if (prev == null) {
            if (this.size == this.capacity) {
                this.delete(this.getTailPrev());
            }
            this.insert(current);
        }
    }

    /**
     * 获取 tail 前驱
     *
     * @return
     */
    public LRUNode getTailPrev() {
        LRUNode current = this.head;
        if (current.next == null) {
            return null;
        }
        while (current.next.next != null) {
            current = current.next;
        }
        return current;
    }

    /**
     * 根据 key 获得前驱
     *
     * @param key
     * @return
     */
    public LRUNode getPrev(int key) {
        LRUNode prev = this.head;
        while (prev != null) {
            if (prev.next != null && prev.next.key == key) {
                break;
            }
            prev = prev.next;
        }
        return prev;
    }

    /**
     * 根据前驱删除
     *
     * @param prev
     */
    public void delete(LRUNode prev) {
        prev.next = prev.next.next;
        this.size--;
    }

    /**
     * 插入到表头
     *
     * @param current
     */
    public void insert(LRUNode current) {
        current.next = this.head.next;
        this.head.next = current;
        this.size++;
    }
}

class LRUNode {
    LRUNode next;
    int key;
    int value;

    public LRUNode() {
        this.key = this.value = 0;
        this.next = null;
    }

    public LRUNode(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}