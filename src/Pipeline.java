
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Pipeline {

  public static void main(String[] args)
      throws IOException, InterruptedException {

    PipedInputStream input = new PipedInputStream();
    PipedOutputStream output = new PipedOutputStream();
    output.connect(input);

    Producer producer = new Producer(output);
    Consumer consumer = new Consumer(input);
    new Thread(consumer).start();
    Thread.sleep(1000);
    new Thread(producer).start();
  }
}

class Producer implements Runnable {

  private final OutputStream out;

  public Producer(OutputStream out) {
    this.out = out;
  }

  @Override
  public void run() {
    String str = "hello world!";
    try {
      out.write(str.getBytes());
      out.flush();
      out.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

class Consumer implements Runnable {

  private final InputStream in;

  public Consumer(InputStream in) {
    this.in = in;
  }

  @Override
  public void run() {
    byte[] bs = new byte[1024];
    int len = -1;
    try {
      while ((len = in.read(bs)) != -1) {
        System.out.println(new String(bs, 0, len));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
