package com.driver;

public class Main {
  public class A{
      public String meth(){
          return "Invoking method from class A";
      }
  }
  public class B extends A{
      public String meth(){
          return "Method is overridden in Extendend class B";
      }
  }
  public void main(String args[]){
      B obj = new B();
      obj.meth();
  }
}