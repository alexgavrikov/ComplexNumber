package com.netcracker.edu.java.tasks;

import java.util.*;

/**
 * Created by user on 08.07.2015.
 */
public class Main {
    public static void main(String[] args) {
        ComplexNumberImpl q = new ComplexNumberImpl();
        //System.out.println(q.getRe());
        //System.out.println(q.getIm());
        //q.set("2.2+3.5i");
        //System.out.println(q.getRe());
        //System.out.println(q.getIm());
        q.set("+2.2+3.5i");
        System.out.println(q.getRe());
        System.out.println(q.getIm());
        System.out.println();
        System.out.println();
        q.set("-2.2+3.5i");
        System.out.println(q.getRe());
        System.out.println(q.getIm());
        System.out.println();
        System.out.println();
        q.set("+3.5i");
        System.out.println(q.getRe());
        System.out.println(q.getIm());
        System.out.println();
        System.out.println();
        q.set("-3.5i");
        System.out.println(q.getRe());
        System.out.println(q.getIm());
        System.out.println();
        System.out.println();
        q.set("3.5i");
        System.out.println(q.getRe());
        System.out.println(q.getIm());
        System.out.println();
        System.out.println();
        q.set("-i");
        System.out.println(q.getRe());
        System.out.println(q.getIm());
        q.set("-1.3");
        System.out.println(q.getRe());
        System.out.println(q.getIm());
        q.set("+1.3");
        System.out.println(q.getRe());
        System.out.println(q.getIm());
        q=new ComplexNumberImpl("2+3.456i");
        System.out.println(q.getRe());
        System.out.println(q.getIm());
        System.out.println(q);
        System.out.println(q.equals(q));
        ComplexNumberImpl w=new ComplexNumberImpl(2.234,0.5);
        ComplexNumberImpl z = w.add(q.copy().multiply(q).negate());
        ComplexNumber[] as=new ComplexNumber[]{w,q,z};
        q.sort(as);
        System.out.println(as[0]);
        System.out.println(as[1]);
        System.out.println(as[2]);
        //q.equals("2+3i");
        /*
        System.out.println();
        System.out.println();
        */
        TreeSet<ComplexNumber> a=new TreeSet<ComplexNumber>(new Comparator<ComplexNumber>(){
            public int compare(ComplexNumber o1,ComplexNumber o2){
                return o1.compareTo(o2);
            }
        });
        a.add(new ComplexNumberImpl(2,3));
        ComplexNumber[] dfg=new ComplexNumberImpl[4];
        ComplexNumberImpl[] ghj=(ComplexNumberImpl[])dfg;
        ArrayList<Integer> asd=new ArrayList<>();
        TreeSet<Integer> mnb=new TreeSet<>();
        mnb.add(3);
        asd.add(4);
        asd.add(3);
        asd.add(5);
        Iterator<Integer> qaz=asd.iterator();

        Integer cv=qaz.next();
        System.out.println(cv);
        cv=qaz.next();
        System.out.println(cv);
        cv=qaz.next();
        System.out.println(asd.get(0));
        ert();
        ComplexNumberImpl pol=new ComplexNumberImpl(4,5);
        System.out.println(pol instanceof ComplexNumberImpl);
        System.out.println(cv);
        System.out.println(cv);
        System.out.println(q.equals("sdf"));
        C on=new C();
        System.out.println(on.a);
        System.out.println();
        System.out.println(cv);
        char[] mn=new char[2];
        mn[0]='d';
        mn[1]='f';
        Object nm=mn;
        System.out.println(mn);
        Integer[] io=new Integer[2];
        io[0]=2;
        io[1]=3;

        System.out.println(io);
        System.out.println(io.toString());
        System.out.println(new Integer(2));
        System.out.println("dfg"+(Object)"gh");
        C<ComplexNumberImpl> plm=new C<>();
        C[] array=new C[2];
        array[0]=new C();
        B[] array2=array;
        System.out.println(array2[0] instanceof B);
        System.out.println(array2[0] instanceof C);
        System.out.println(array2[0] instanceof A);
        System.out.println(io);
        System.out.println(io);
        HashSet<Integer> nf=new HashSet<>();
        nf.add(null);
                String ytr="df";
        String yte=null;
        ytr.equals(yte);
        char[] hgf=new char[2];
        hgf[0]='f';
        hgf[1]='d';
        System.out.println(hgf);
        System.out.println("fgd" + hgf);
        StringBuilder lop=new StringBuilder();
        lop.trimToSize();
        //lop.append("dffggggggggggggggggg");
        System.out.println(lop.capacity());
        Object ob=new Object();
        LinkedList<Integer> plat=new LinkedList();
        plat.add(30);
        plat.add(30);
        Iterator iter=plat.iterator();
        iter.remove();

        System.out.println(plat.size());
        System.out.println(plat);
        System.out.println(hgf);
        System.out.println(iter.next());




    }

    public static int ert(){
        try{
            return 0;
            //throw new Exception("str");
            //return 0;
        }
        catch(Exception str){
            System.out.println(str);
            return -1;
        }
        finally{
            System.out.println(12345);
            //return -1;
        }
    }

    private static class A{
        int a=1;
        A(int a){
            this.a=a;
        }
        A(){

        }
         int qwe() {
             System.out.println("er");
            return 0;
         }
    }
    private static class B extends A{
        //int a=2;
        int b=5;
        B(int b){

        }
        B(){

        }

    }
    private static class C<T extends ComplexNumber> extends  B{
        int a=3;
        private T v;
        C(){
            super(4);
            //super(4);
            System.out.println(super.a);
            super.qwe();
            int fgv=new Integer(2);
                    int[] fg=new int[3];
        }
        int qwe(){
            System.out.println("ty");
return -1;
        }
    }
}
