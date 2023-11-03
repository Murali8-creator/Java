public class Main {
    public static void main(String[] args) {
        MyHashMap hm=new MyHashMap();
        hm.put(20,4);
        hm.put(200,9);
        hm.put(4,16);
        hm.put(210,7);
//        hm.put(310,8);


        hm.display();

        System.out.println(hm.get(20));
        hm.remove(210);
        hm.display();
    }
}
class MyHashMap{

    Entity []entities;

    MyHashMap(){
        entities=new Entity[100];
    }

    public void put(int key,int value){
        int hash=Math.abs(key% entities.length);

        System.out.println("hash put"+hash);
        entities[hash]=new Entity(key,value);//overriding
    }

    public int get(int key){
        int hash=Math.abs(key% entities.length);

        System.out.println("hash get "+hash);

        if (entities[hash]!=null&&entities[hash].key==key){
            return  entities[hash].value;
        }
        return -1;
    }

    public void remove(int key){
        int hash=Math.abs(key% entities.length);

        System.out.println("hash remove "+hash);

        if (entities[hash]!=null&&entities[hash].key==key){
            entities[hash]=null;
        }
    }


    public void display(){
        for (int i=0;i<entities.length;i++){
            if (entities[i]!=null)
              System.out.println(entities[i].key+" --> "+entities[i].value);
        }
    }

    private class Entity{
        int key;
        int value;


        Entity(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
}