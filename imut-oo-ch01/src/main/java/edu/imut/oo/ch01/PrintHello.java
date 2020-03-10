package edu.imut.oo.ch01;

/**
 * 输出Hello类
 * 
 * @author 黄老师
 *
 */
public class PrintHello {

  /**
   * 输出Hello应用程序入口
   * 
   * @param args 启动参数
   */
  public static void main(String[] args) {
    GetHello getHello = new GetHello();
    System.out.println(getHello.getHello());
  }
}
