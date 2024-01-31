package com.basic_oops;

public class POJO {


    public static void main(String[] args) {
        Employes en = new Employes();
        Employes en1 = new Employes(1, "default_name", 3);
        Employes en2 = new Employes(10, "default_user2");
        System.out.println(en.SetbyId(5));
        System.out.println(en1);
        System.out.println(en);
        System.out.println(en2);
    }


}
