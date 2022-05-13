
public class TableItem {
    String key;
    MyLinkedList value;

    TableItem(String key, String value) {
        this.key = key;
        this.value = new MyLinkedList(value);
    }
}
