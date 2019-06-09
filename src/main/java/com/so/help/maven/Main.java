package com.so.help.maven;

import org.apache.commons.lang3.StringUtils;

public class Main {
  public static void main(String[] args) {
    String someString = null;
    System.out.println("============CODE EXECUTED=============");
    if (StringUtils.isBlank(someString)) {
      System.out.println("String null or blank ...");
    } else {
      System.out.println("String is not blank ...");
    }
    System.out.println("============CODE EXECUTED=============");
  }
}
