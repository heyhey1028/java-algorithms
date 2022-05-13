public class MyHashTable {
    private static int tableSize = 1000;
    private TableItem[] data = new TableItem[tableSize];
    private int size = 0;

    /// test method
    public static void main(String[] args) {
        MyHashTable hashTable = new MyHashTable();

        hashTable.put("Tokyo", "Japan");
        hashTable.put("Seoul", "Korea");
        hashTable.put("Beijing", "China");
        hashTable.put("Paris", "France");
        hashTable.put("Washington", "USA");
        hashTable.put("Brazilia", "Brazil");
        System.out.println("Size: " + hashTable.size());

        System.out.println((String) hashTable.get("Tokyo"));
        System.out.println((String) hashTable.get("Seoul"));
        System.out.println((String) hashTable.get("Beijing"));
        System.out.println((String) hashTable.get("Paris"));
        System.out.println((String) hashTable.get("Washington"));
        System.out.println((String) hashTable.get("Brazilia"));

        hashTable.remove("Brazilia");
        System.out.println("Size: " + hashTable.size());
        System.out.println((String) hashTable.get("Brazilia"));

        hashTable.put("Tokyo", "India");
        System.out.println((String) hashTable.get("Tokyo"));
    }

    /// get(key)
    public String get(String key) {
        int hash = key.hashCode() % tableSize;

        if (data[hash] == null) {
            return null;
        }
        return data[hash].value.tail.item;
    }

    /// put(key,value)
    public void put(String key, String value) {
        int hash = key.hashCode() % tableSize;
        data[hash] = new TableItem(key, value);
        size++;
    }

    /// remove(key)
    public void remove(String key) {
        int hash = key.hashCode() % tableSize;
        data[hash] = null;
        size--;
    }

    /// containsKey(key)
    public boolean containsKey(String key) {
        int hash = key.hashCode() % tableSize;
        return data[hash] != null;
    }

    /// size()
    public int size() {
        return size;
    }
}
