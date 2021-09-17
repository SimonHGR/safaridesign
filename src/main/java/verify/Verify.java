package verify;

public record Verify() {
  public static void main(String[] args) {
    int x = 99;
    System.out.println(switch (x) {
      case 99 -> "Hello World!";
      default -> "no, that's wrong?";
    });
  }
}
