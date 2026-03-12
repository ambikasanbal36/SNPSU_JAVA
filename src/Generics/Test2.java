package Generics;

class Test2<k,v> {
    k key;
    v val;

    Test2(k key, v val) {
        this.key = key;
        this.val = val;
    }

    void display() {
        System.out.println(key + " " + val);
    }
}
class Driver1 {
    static void main(String[] args) {
        Test2<String, Integer> obj1 = new Test2<>("Gunda", 60);
        obj1.display();
    }
}
