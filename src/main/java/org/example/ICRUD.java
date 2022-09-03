package org.example;

public interface ICRUD {
    public Object add();
    public int updata(Object obj);
    public int delete(Object obj);
    public void selectOne(int id);
}