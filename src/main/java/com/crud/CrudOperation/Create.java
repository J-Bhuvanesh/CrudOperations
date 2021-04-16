package com.crud.CrudOperation;
import java.util.ArrayList;
import java.util.List;
public class Create {
    List<String> li=new ArrayList<>();

    public String setName(String name) {
        String n= name;
        li.add(name);
        return "name "+ n +" inserted successfully....";
    }
    public String display(int index)
    {
        String n=li.get(index);
        return ("inserted name is "+n);
    }
    public String update(int key, String name) {
        String n= li.get(key);
        li.set(key,name);
        String nc=li.get(key);
        return "name has changed from "+n+" to "+nc;
    }
    public String delete(int index) {
        String n= li.get(index);
        li.remove(index);
        return "The data "+n+" has been deleted";

    }
}
