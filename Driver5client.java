package driver;

import client.DefaultSocketClient;

public class Driver5client {

  public static void main(String[] args) {

    DefaultSocketClient c1 = new DefaultSocketClient("127.0.0.1", 4444);
    c1.start();
  }
}
