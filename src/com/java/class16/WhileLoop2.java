package com.java.class16;

public class WhileLoop2 {
    public static void main(String[] args) {
        //write a program that will
        //print out
        //*
        //**
        //***
        //****
        //*****
        String astr = "*****";
        while(astr.length()>0){
            System.out.println(astr);
           astr=  astr.substring(0, astr.length()-1);
        }

    }
}
