package com.netcracker.edu.java.tasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 07.07.2015.
 */
public class ComplexNumberImpl implements ComplexNumber {
    private double re;
    private double im;
    public ComplexNumberImpl(){
        re=0;
        im=0;
    }

    public ComplexNumberImpl(double re,double im){
        this.re=re;
        this.im=im;
    }

    public ComplexNumberImpl(String value){
        set(value);
    }

    public void set(String value) throws NumberFormatException {
        String str="^([\\+\\-]?[^\\+\\-i]+)(?:([\\+\\-][^i]*)i)?$";
        String str2="^([\\+\\-]?[^i]*)i$";
        Pattern pat=Pattern.compile(str);
        Matcher mat=pat.matcher(value);
        if(mat.matches()){
            String real=mat.group(1);
            String imag=mat.group(2);
            re=Double.parseDouble(real);
            if(imag==null) im=0;
            else if("+".equals(imag)) im=1;
            else if("-".equals(imag)) im=-1;
            else im=Double.parseDouble(imag);
        }
        else{
            str = "^([\\+\\-]?[^i]*)i$";
            pat=Pattern.compile(str);
            mat=pat.matcher(value);
            if(mat.matches()){
                re=0;
                String imag=mat.group(1);
                if("+".equals(imag) || imag.length()==0) im=1;
                else if("-".equals(imag)) im=-1;
                else im=Double.parseDouble(imag);
            }
            else throw new NumberFormatException();
        }
    }

    @Override
    public double getRe() {
        return re;
    }

    @Override
    public double getIm() {
        return im;
    }

    @Override
    public boolean isReal() {
        return im==0;
    }

    @Override
    public void set(double re, double im) {
        this.re=re;
        this.im=im;
    }

    @Override
    public ComplexNumberImpl copy() {
       try{
            return clone();
        }
        catch (CloneNotSupportedException exception){
            System.out.println(exception);
            return new ComplexNumberImpl(0,0);
        }
    }

    @Override
    public ComplexNumberImpl clone() throws CloneNotSupportedException {
        ComplexNumberImpl copy = (ComplexNumberImpl)super.clone();
        copy.re=re;
        copy.im=im;
        return copy;
    }

    @Override
    public String toString() {
        if(im==0){
            return Double.toString(re);
        }
        else if(re==0){
            return Double.toString(im)+"i";
        }
        else{
            String str;
            str=Double.toString(re);
            if(im>0){
                str+="+";
            }
            return str+Double.toString(im)+"i";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        else {
            if(obj instanceof ComplexNumber) {
                ComplexNumber compl = (ComplexNumber) obj;
                double Re = compl.getRe();
                double Im = compl.getIm();
                return ((getRe() == Re) && (getIm() == Im));
            }
            else return false;
        }
    }

    @Override
    public int compareTo(ComplexNumber other) {
        double subtr=Math.pow(re,2)+Math.pow(im,2)-Math.pow(other.getRe(),2)-Math.pow(other.getIm(),2);
        if(subtr<0) return -1;
        if(subtr>0) return 1;
        return 0;
    }

    @Override
    public void sort(ComplexNumber[] array) {
        Arrays.sort(array, new Comparator<ComplexNumber>() {
            public int compare(ComplexNumber o1,ComplexNumber o2){
                return o1.compareTo(o2);
            }
        });
    }

    @Override
    public ComplexNumberImpl negate() {
        re=-re;
        im=-im;
        return this;
    }

    @Override
    public ComplexNumberImpl add(ComplexNumber arg2) {
        re+=arg2.getRe();
        im+=arg2.getIm();
        return this;
    }

    @Override
    public ComplexNumberImpl multiply(ComplexNumber arg2) {
        double re2=re*arg2.getRe()-im*arg2.getIm();
        double im2=re*arg2.getIm()+im*arg2.getRe();
        re=re2;
        im=im2;
        return this;
    }
}
