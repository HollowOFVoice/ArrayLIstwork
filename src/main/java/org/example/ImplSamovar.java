package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class ImplSamovar implements StringList{

    ArrayList<String> arrayList = new ArrayList<>();


@Override
    public String add(String list) {
        arrayList.add(list);
    return list;
    }
@Override
    public String add(int index, String item) {
    try {
        arrayList.add(index,item);
        return item;
    }catch (Exception e){
        System.out.println("Выход за пределы"); ;
    }

    return item;
}

    public String set(int index, String item) {
        try {
            arrayList.set(index,item);
            return item;
        }catch (Exception e){
            System.out.println("Выбран элемент за пределы массива"); ;
        }

        return item;
    }

    public String remove(String item) {
    arrayList.remove(item);
    return item;
    }

    public String remove(int index) {
        arrayList.remove(index);
        return "Строка с индексом  "+index+"  Успешно удалена!";
    }

    public boolean contains(String item) {
    try {

        arrayList.contains(item);
        return true ;
    }catch (Exception e){
        return false;
    }

    }

    @Override
    public int indexOf(String item) {
        return 0;
    }

    public int lastIndexOf(String item) {
        return 0;
    }

    public String get(int index) {
        return null;
    }

    public boolean equals(StringList otherList) {
        return false;
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public void clear() {

    }

    public String[] toArray() {
        return new String[0];
    }
}
