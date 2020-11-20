package com.tqc;

public class Hello {   // 需要先設計類別
    public static void main(String[] args) {    // 在類別中設計一個main方法做為程式起始點，可打psvm再按TAB，自動展開
        //System.out.println("Hello world");
        // 讓新增的person類別，加到記憶體當中讓他去執行，新增的類別才有功能
        //如果一個類別沒有繼承任何的父類別，它一律繼承java.lang.Object類別，所以這些功能是Object類別所帶來給你
        //new Person().hello();  //執行完這一行其實就取不到物件了


//        現在把在記憶體當中的這一個物件Person物件，把它儲存起來再利用物件去呼叫hello這個方法
//        那先定義一個專門存放Person的，Person物件的物件，它的名稱叫做p等於new Person
//        那這樣子的語法也就是
        Person p = new Person();   //等號右邊先在記憶體當中生出一個Person的物件, 在將這個物件的住址寫在一張叫p的紙上面
//        所以我們可以簡稱這個p就是代表了記憶體裡面的這個Person物件
        p.hello();

        //以下為基本資料型態，沒有功能
        //假設我們今天想要把，整數這個值利用物件把它包起來讓它有功能的話
        //那我們可以使用每一種資料型態，它都會對應給你一個叫做類別

        int age = 19;  //一般整數用int，短用short，長用long  (基本資料型態 點不出功能)
        Integer age2 = 19; //(物件，參照資料型態，按. 有功能)

        char c ='我';  //以char表示字元，以單引號括起
        Character c2 = 'A';

        byte b = 120; //比較小的字元
        float weight = 66.5f; //加上f，會將66.5這個double用比較窄的float來放

        double height = 1.7;
        Double height2 = 1.7;


        boolean adult = true;
        boolean enroll = false;
        String name = "TQC";


    }
}
