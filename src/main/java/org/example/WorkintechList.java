package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList extends ArrayList { // Array List gibi olmasını sağladık.


    @Override
    public boolean add(Object object){
        if(!this.contains(object)){
            return super.add(object);
        }
        return false;
    }

    public void sort(){
        Collections.sort(this);
    }
    @Override
    public boolean remove(Object object){
        sort();
        return super.remove(object);
    }

}
