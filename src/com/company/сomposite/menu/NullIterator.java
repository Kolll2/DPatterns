package com.company.сomposite.menu;

import com.company.iterator.basic_iterator.Iterator;

public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }


}
